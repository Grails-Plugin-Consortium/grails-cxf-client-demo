package com.cxf.demo.fault.out.interceptor

import org.apache.cxf.binding.soap.SoapMessage
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor
import org.apache.cxf.interceptor.Fault
import org.apache.cxf.phase.Phase

/**
 */
class CustomFaultOutInterceptorMarshal extends AbstractSoapInterceptor  {

    public CustomFaultOutInterceptorMarshal() {
        super(Phase.MARSHAL)
    }

    public void handleMessage(SoapMessage message) throws Fault {
        println "MARSHAL"
        Fault fault = (Fault) message?.getContent(Exception.class)
        fault?.printStackTrace()
        println fault?.message
    }
}
