package cxf.client.demo

import com.cxf.demo.ComplexChild
import com.cxf.demo.ComplexRequest
import com.cxf.demo.ComplexResponse
import com.cxf.demo.fault.ComplexContrivedException
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@GrailsCxfEndpoint
class ComplexService {

    @WebMethod
    @WebResult(name='ComplexResponse')
    ComplexResponse complexMethod1(@WebParam(name='complexRequest') ComplexRequest request) {
        ComplexResponse response = new ComplexResponse()
        response.children = []
        request?.propagateCount?.times {
            response.children << new ComplexChild(name: "Child$it")
        }
        response.childCount = response?.children?.size() ?: 0
        response.message = "Some message here"
        response
    }

    @WebMethod
    @WebResult(name='ComplexResponse')
    ComplexResponse complexMethod2(@WebParam(name='complexRequest') ComplexRequest request) {
        ComplexResponse response = new ComplexResponse()
        response.children = []
        request?.propagateCount?.times {
            response.children << new ComplexChild(name: "Child$it")
        }
        request?.propagateCount?.times {
            response.children << new ComplexChild(name: "Child$it")
        }
        response.childCount = response?.children?.size() ?: 0
        response.message = "Oops we propagated twice!"
        response
    }

    @WebMethod
    @WebResult(name='ComplexResponse')
    ComplexResponse complexMethod3(@WebParam(name='complexRequest') ComplexRequest request) throws ComplexContrivedException {
        throw new ComplexContrivedException(contrivedMessage: "this is silly")
    }
}
