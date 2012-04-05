package com.cxf.demo.logging

import org.apache.cxf.common.injection.NoJSR250Annotations
import org.apache.cxf.interceptor.AbstractLoggingInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.interceptor.LoggingInInterceptor
import org.apache.cxf.message.Message
import org.apache.cxf.phase.Phase
import java.util.logging.Logger
import org.apache.cxf.common.logging.LogUtils

/**
 *
 */
@NoJSR250Annotations
public class CustomLoggingOutInterceptor extends AbstractLoggingInterceptor {

    private static final Logger LOG = LogUtils.getLogger(CustomLoggingOutInterceptor)
    def name

    public CustomLoggingOutInterceptor() {
        super(Phase.WRITE);
        log LOG, "Creating the custom interceptor bean"
    }

    public void handleMessage(Message message) throws Fault {
        log LOG, "$name :: I AM IN CUSTOM OUT LOGGER!!!!!!!"
    }

    @Override
    protected Logger getLogger() {
        LOG
    }
}