package cxf.client.demo

import com.cxf.demo.ComplexChild
import com.cxf.demo.ComplexRequest
import com.cxf.demo.ComplexResponse
import com.cxf.demo.fault.ComplexContrivedException
import org.grails.cxf.utils.GrailsCxfEndpoint

import javax.jws.WebMethod

@GrailsCxfEndpoint
class ComplexService {

    @WebMethod
    ComplexResponse complexMethod1(ComplexRequest request) {
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
    ComplexResponse complexMethod2(ComplexRequest request) {
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
    ComplexResponse complexMethod3(ComplexRequest request) throws ComplexContrivedException {
        throw new ComplexContrivedException(contrivedMessage: "this is silly")
    }
}
