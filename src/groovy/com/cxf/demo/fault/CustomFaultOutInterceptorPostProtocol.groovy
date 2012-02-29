package com.cxf.demo.fault

import org.apache.cxf.interceptor.AbstractLoggingInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.message.Message
import org.apache.cxf.phase.Phase
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.binding.soap.SoapMessage

/**
 */
class CustomFaultOutInterceptorPostProtocol extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorPostProtocol() {
        super(Phase.POST_PROTOCOL)
    }

     public void handleMessage(SoapMessage message) throws Fault {
        println "POST_PROTOCOL"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
