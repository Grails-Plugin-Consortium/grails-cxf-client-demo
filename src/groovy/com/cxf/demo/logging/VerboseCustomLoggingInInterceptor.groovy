package com.cxf.demo.logging

import org.apache.cxf.common.injection.NoJSR250Annotations
import org.apache.cxf.interceptor.AbstractLoggingInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.interceptor.LoggingInInterceptor
import org.apache.cxf.message.Message
import org.apache.cxf.phase.Phase

/**
 *
 */
@NoJSR250Annotations
public class VerboseCustomLoggingInInterceptor extends AbstractLoggingInterceptor {

    def name

    public VerboseCustomLoggingInInterceptor() {
        super(Phase.RECEIVE);
        log "Creating the custom interceptor bean"
    }

    public void handleMessage(Message message) throws Fault {
        log "$name :: verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger "
    }
}
