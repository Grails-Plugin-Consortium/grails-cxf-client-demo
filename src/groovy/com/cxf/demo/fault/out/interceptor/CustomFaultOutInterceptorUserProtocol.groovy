package com.cxf.demo.fault.out.interceptor

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.phase.Phase

/**
 */
class CustomFaultOutInterceptorUserProtocol extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorUserProtocol() {
        super(Phase.USER_PROTOCOL)
    }

    public void handleMessage(SoapMessage message) throws Fault {
        println "USER_PROTOCOL"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
