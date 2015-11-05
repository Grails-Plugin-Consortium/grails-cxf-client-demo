package cxf.client.demo

import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebResult


@GrailsCxfEndpoint
class AuthorizationService {

    @WebMethod
    @WebResult(name='SimpleResponse')
    SimpleResponse secureMethod() {
        println "in authorization secure method"
        new SimpleResponse(isOld: false, status: "Authorization Service")
    }
}
