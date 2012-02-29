package com.cxf.demo.fault

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.phase.Phase

/**
 */
class CustomFaultOutInterceptorPostStream extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorPostStream() {
        super(Phase.POST_STREAM)
    }

    public void handleMessage(SoapMessage message) throws Fault {
        println "POST_STREAM"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
