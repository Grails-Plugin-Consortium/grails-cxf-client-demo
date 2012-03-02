package com.cxf.demo

import cxf.client.demo.complex.ComplexContrivedException
import cxf.client.demo.complex.ComplexContrivedException_Exception
import cxf.client.demo.complex.ComplexServicePortType
import cxf.client.demo.secure.SecureServicePortType
import cxf.client.demo.simple.SimpleServicePortType
import net.webservicex.StockQuoteSoap
import javax.xml.ws.soap.SOAPFaultException

class DemoController {

    SimpleServicePortType simpleServiceClient
    SimpleServicePortType simpleServiceInterceptorClient
    ComplexServicePortType complexServiceClient
    SecureServicePortType secureServiceClient
    SecureServicePortType insecureServiceClient
    SecureServicePortType customSecureServiceClient
    SecureServicePortType customSecureServiceOutClient
    StockQuoteSoap stockQuoteClient

    def index = {
        render(view: "/index")
    }

    def stockQuoteDemo = {
        String stockQuote
        try {
            stockQuote = stockQuoteClient.getQuote("AAPL")
        } catch (Exception e) {
            stockQuote = e.message
        }

        render(view: '/index', model: [stockQuote: stockQuote])
    }

    def stockQuoteDemoJasper = {
        String stockQuote
        try {
            stockQuote = stockQuoteClient.getQuote("AAPL")
        } catch (Exception e) {
            stockQuote = e.message
        }

        render model: [stockQuote: stockQuote]
    }

    def insecureServiceDemo = {
        def serviceException = null
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = new cxf.client.demo.secure.SimpleResponse()
        try {
            response1 = insecureServiceClient.secureMethod()
        } catch (SOAPFaultException e) {
            serviceException = e
        }

        render(view: '/index', model: [serviceException: serviceException, simpleRequest1: request1, simpleResponse1: response1])
    }

    def customSecureServiceDemo = {
        def serviceException = null
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = new cxf.client.demo.secure.SimpleResponse()
        try {
            response1 = customSecureServiceClient.secureMethod()
        } catch (SOAPFaultException e) {
            serviceException = e
        }

        render(view: '/index', model: [serviceException: serviceException, simpleRequest1: request1, simpleResponse1: response1])
    }

    def customSecureServiceOutDemo = {
        def serviceException = null
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = new cxf.client.demo.secure.SimpleResponse()
        try {
            response1 = customSecureServiceOutClient.secureMethod()
        } catch (SOAPFaultException e) {
            serviceException = e
        }

        render(view: '/index', model: [serviceException: serviceException, simpleRequest1: request1, simpleResponse1: response1])
    }

    def secureServiceDemo = {
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.secure.SimpleResponse response1 = secureServiceClient.secureMethod()

        render(view: '/index', model: [simpleRequest1: request1, simpleResponse1: response1])
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

    def simpleServiceInterceptorDemo = {
        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.simple.SimpleResponse response1 = simpleServiceInterceptorClient.simpleMethod1(request1)


        cxf.client.demo.simple.SimpleRequest request2 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
        cxf.client.demo.simple.SimpleResponse response2 = simpleServiceInterceptorClient.simpleMethod2(request2)

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

    def complexServiceFaultDemo = {
        //this will cause a ComplexContrivedException_Exception
        cxf.client.demo.complex.ComplexRequest request1 = new cxf.client.demo.complex.ComplexRequest(
                singleChild: new cxf.client.demo.complex.ComplexChild(name: "Child"),
                propagateCount: 3)
        cxf.client.demo.complex.ComplexResponse response1 = null
        def serviceException = null
        try {
            response1 = complexServiceClient.complexMethod3(request1)
        } catch (ComplexContrivedException_Exception e) {
            serviceException = e
        } catch (SOAPFaultException e) {
            serviceException = e
        }

        render(view: '/index', model: [complexRequest1: request1, complexResponse1: response1, serviceException: serviceException])
    }
}
