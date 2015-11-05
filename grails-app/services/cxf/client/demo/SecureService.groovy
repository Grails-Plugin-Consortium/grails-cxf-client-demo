package cxf.client.demo

import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult

@GrailsCxfEndpoint
class SecureService {

    @WebMethod
    @WebResult(name='SimpleResponse')
    SimpleResponse secureMethod() {
        println "in secure Method"
        new SimpleResponse(isOld: false, status: "Secure Service")
    }
}
