package com.cxf.demo.fault.out.interceptor

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.phase.Phase

/**
 */
class CustomFaultOutInterceptorPrepareSend extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorPrepareSend() {
        super(Phase.PREPARE_SEND)
    }

    public void handleMessage(SoapMessage message) throws Fault {
        println "PREPARE_SEND"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
