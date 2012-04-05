package com.cxf.demo.logging

import org.apache.cxf.common.injection.NoJSR250Annotations
import org.apache.cxf.common.logging.LogUtils
import org.apache.cxf.interceptor.AbstractLoggingInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.message.Message
import org.apache.cxf.phase.Phase

import java.util.logging.Logger

/**
 *
 */
@NoJSR250Annotations
public class VerboseCustomLoggingInInterceptor extends AbstractLoggingInterceptor {

    private static final Logger LOG = LogUtils.getLogger(VerboseCustomLoggingInInterceptor)
    def name


    public VerboseCustomLoggingInInterceptor() {
        super(Phase.RECEIVE);
        log LOG, "Creating the custom interceptor bean"
    }

    public void handleMessage(Message message) throws Fault {
        log LOG, "$name :: verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger verbose logger "
    }

    @Override
    protected Logger getLogger() {
        LOG
    }
}
