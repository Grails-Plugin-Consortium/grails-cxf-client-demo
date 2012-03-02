package com.cxf.demo.fault.out.interceptor

import org.apache.cxf.binding.soap.interceptor.Soap11FaultOutInterceptor
import org.apache.cxf.interceptor.AbstractLoggingInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.message.Message
import org.apache.cxf.phase.Phase
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.binding.soap.SoapMessage

/**
 */
class CustomFaultOutInterceptorPreLogical extends AbstractSoapInterceptor {

    public CustomFaultOutInterceptorPreLogical() {
        super(Phase.PRE_LOGICAL)
    }

 public void handleMessage(SoapMessage message) throws Fault {
        println "PRE_LOGICAL"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
