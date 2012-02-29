package com.cxf.demo.fault

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.phase.Phase

/**
 */
class CustomFaultOutInterceptorPreStream extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorPreStream() {
        super(Phase.PRE_STREAM)
    }

    public void handleMessage(SoapMessage message) throws Fault {
        println "PRE_STREAM"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
