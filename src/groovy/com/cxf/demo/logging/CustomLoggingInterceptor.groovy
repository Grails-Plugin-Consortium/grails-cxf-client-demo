package com.cxf.demo.logging

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.logging.Level
import org.apache.cxf.common.injection.NoJSR250Annotations
import org.apache.cxf.interceptor.AbstractLoggingInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.interceptor.LoggingMessage
import org.apache.cxf.interceptor.StaxOutInterceptor
import org.apache.cxf.io.CacheAndWriteOutputStream
import org.apache.cxf.io.CachedOutputStream
import org.apache.cxf.io.CachedOutputStreamCallback
import org.apache.cxf.message.Message
import org.apache.cxf.phase.Phase

/**
 *
 */
@NoJSR250Annotations
public class CustomLoggingInterceptor extends AbstractLoggingInterceptor {

    def name

    private static final String LOG_SETUP = CustomLoggingInterceptor.class.getName() + ".log-setup";

    public CustomLoggingInterceptor(String phase) {
        super(phase);
        addBefore(StaxOutInterceptor.class.getName());
    }

    public CustomLoggingInterceptor() {
        this(Phase.PRE_STREAM);
    }

    public CustomLoggingInterceptor(int lim) {
        this();
        limit = lim;
    }

    public CustomLoggingInterceptor(PrintWriter w) {
        this();
        this.writer = w;
    }


    public void handleMessage(Message message) throws Fault {
        final OutputStream os = message.getContent(OutputStream.class);
        if(os == null) {
            return;
        }
        if(LOG.isLoggable(Level.INFO) || writer != null) {
            // Write the output while caching it for the log message
            boolean hasLogged = message.containsKey(LOG_SETUP);
            if(!hasLogged) {
                message.put(LOG_SETUP, Boolean.TRUE);
                final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(os);
                message.setContent(OutputStream.class, newOut);
                newOut.registerCallback(new LoggingCallback(message, os));
            }
        }
    }

    class LoggingCallback implements CachedOutputStreamCallback {

        private final Message message;
        private final OutputStream origStream;

        public LoggingCallback(final Message msg, final OutputStream os) {
            this.message = msg;
            this.origStream = os;
        }

        public void onFlush(CachedOutputStream cos) {

        }

        public void onClose(CachedOutputStream cos) {
            String id = (String) message.getExchange().get(LoggingMessage.ID_KEY);
            if(id == null) {
                id = LoggingMessage.nextId();
                message.getExchange().put(LoggingMessage.ID_KEY, id);
            }
            final LoggingMessage buffer = new LoggingMessage("${name} - Custom Outbound Message\n---------------------------", id);

            Integer responseCode = (Integer) message.get(Message.RESPONSE_CODE);
            if(responseCode != null) {
                buffer.getResponseCode().append(responseCode);
            }

            String encoding = (String) message.get(Message.ENCODING);

            if(encoding != null) {
                buffer.getEncoding().append(encoding);
            }

            String address = (String) message.get(Message.ENDPOINT_ADDRESS);
            if(address != null) {
                buffer.getAddress().append(address);
            }
            String ct = (String) message.get(Message.CONTENT_TYPE);
            if(ct != null) {
                buffer.getContentType().append(ct);
            }
            Object headers = message.get(Message.PROTOCOL_HEADERS);
            if(headers != null) {
                buffer.getHeader().append(headers);
            }

            if(cos.getTempFile() == null) {
                //buffer.append("Outbound Message:\n");
                if(cos.size() > limit) {
                    buffer.getMessage().append("(message truncated to " + limit + " bytes)\n");
                }
            } else {
                buffer.getMessage().append("Outbound Message (saved to tmp file):\n");
                buffer.getMessage().append("Filename: " + cos.getTempFile().getAbsolutePath() + "\n");
                if(cos.size() > limit) {
                    buffer.getMessage().append("(message truncated to " + limit + " bytes)\n");
                }
            }
            try {
                writePayload(buffer.getPayload(), cos, encoding, ct);
            } catch (Exception ex) {
                //ignore
            }

            log(buffer.toString());
            try {
                //empty out the cache
                cos.lockOutputStream();
                cos.resetOut(null, false);
            } catch (Exception ex) {
                //ignore
            }
            message.setContent(OutputStream.class,
                               origStream);
        }
    }

}
