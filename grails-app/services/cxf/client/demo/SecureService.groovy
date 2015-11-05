package cxf.client.demo

import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod

@GrailsCxfEndpoint
class SecureService {

    @WebMethod
    SimpleResponse secureMethod() {
        println "in secure Method"
        new SimpleResponse(isOld: false, status: "Secure Service")
    }
}
