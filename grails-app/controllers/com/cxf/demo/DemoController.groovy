package com.cxf.demo

import cxf.client.demo.complex.ComplexServicePortType
import cxf.client.demo.simple.SimpleServicePortType

class DemoController {

    SimpleServicePortType simpleServiceClient
    ComplexServicePortType complexServiceClient

    def index = {
        render(view: "/index")
    }

    /**
     * I am using the full path for objects in controller since I have source for original objects here
     * which are named the same as the jaxb objects except the namespace.
     */
    def simpleServiceDemo = {
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.simple.SimpleResponse response1 = simpleServiceClient.simpleMethod1(request1)


        cxf.client.demo.simple.SimpleRequest request2 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.simple.SimpleResponse response2 = simpleServiceClient.simpleMethod2(request2)

        render(view: '/index', model: [simpleRequest1: request1, simpleResponse1: response1, simpleRequest2: request2, simpleResponse2: response2])

    }

    //{http://demo.cxf.com/}simpleMethod1Response
    /**
     * I am using the full path for objects in controller since I have source for original objects here
     * which are named the same as the jaxb objects except the namespace.
     */
    def complexServiceDemo = {
        cxf.client.demo.complex.ComplexRequest request1 = new cxf.client.demo.complex.ComplexRequest(
                singleChild: new cxf.client.demo.complex.ComplexChild(name: "Child"),
                propagateCount: 3)
        cxf.client.demo.complex.ComplexResponse response1 = complexServiceClient.complexMethod1(request1)


        cxf.client.demo.complex.ComplexRequest request2 = new cxf.client.demo.complex.ComplexRequest(
                singleChild: new cxf.client.demo.complex.ComplexChild(name: "Child"),
                propagateCount: 3)
        cxf.client.demo.complex.ComplexResponse response2 = complexServiceClient.complexMethod2(request1)

        render(view: '/index', model: [complexRequest1: request1, complexResponse1: response1, complexRequest2: request2, complexResponse2: response2])
    }
}
