package com.cxf.demo.fault

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.phase.Phase

/**
 */
class CustomFaultOutInterceptorPreProtocol extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorPreProtocol() {
        super(Phase.PRE_PROTOCOL)
    }

    public void handleMessage(SoapMessage message) throws Fault {
        log "PRE_PROTOCOL"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        log fault?.message
    }
}
