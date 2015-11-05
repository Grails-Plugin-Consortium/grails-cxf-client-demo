package cxf.client.demo

import com.cxf.demo.SimpleRequest
import com.cxf.demo.SimpleResponse
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod

@GrailsCxfEndpoint
class SimpleService {

    static transactional = false

    @WebMethod
    SimpleResponse simpleMethod1(SimpleRequest request) {
        new SimpleResponse(isOld: request?.age > 100, status: "${request.name} was judged by a normal person")
    }

    @WebMethod
    SimpleResponse simpleMethod2(SimpleRequest request) {
        new SimpleResponse(isOld: request?.age > 25, status: "${request.name} was judged by a young person")
    }
}
