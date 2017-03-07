package com.cxf.demo

import grails.transaction.Transactional
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@Transactional
@GrailsCxfEndpoint(name = "SampleService")
class SampleService {

    @WebMethod
    @WebResult
    String serviceMethod() {
        return "HELLO WORLD"
    }
}
