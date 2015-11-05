package cxf.client.demo

import com.cxf.demo.SimpleRequest
import com.cxf.demo.SimpleResponse
import grails.transaction.Transactional
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@GrailsCxfEndpoint
@Transactional
class SimpleService {

    @WebMethod
    @WebResult(name='SimpleResponse')
    SimpleResponse simpleMethod1(@WebParam(name='simpleRequest') SimpleRequest request) {
        new SimpleResponse(isOld: request?.age > 100, status: "${request?.name} was judged by a normal person")
    }

    @WebMethod
    @WebResult(name='SimpleResponse')
    SimpleResponse simpleMethod2(@WebParam(name='simpleRequest') SimpleRequest request) {
        new SimpleResponse(isOld: request?.age > 25, status: "${request?.name} was judged by a young person")
    }
}
