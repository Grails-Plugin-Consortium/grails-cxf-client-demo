package cxf.client.demo

import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod


@GrailsCxfEndpoint
class AuthorizationService {

    @WebMethod
    SimpleResponse secureMethod() {
        println "in authorization secure method"
        new SimpleResponse(isOld: false, status: "Authorization Service")
    }
}
