package cxf.client.demo.cxf

import cxf.client.demo.simple.SimpleServicePortType
import grails.plugin.spock.IntegrationSpec

/**
 */
class SimpleServiceClientSpec extends IntegrationSpec {
    SimpleServicePortType simpleServiceClient

//    def "test simple client injection and invocation"() {
//        given:
//        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(name: "Fred Flinstone", age: 40)
//
//        when:
//        cxf.client.demo.simple.SimpleResponse response1 = simpleServiceClient.simpleMethod1(request1)
//
//        then:
//        response1 != null
//        !response1.isIsOld()
//        response1.status.contains("normal")
//    }
//
//    def "test simple client injection and invocation method 2"() {
//        given:
//        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(name: "Fred Flinstone", age: 40)
//
//        when:
//        cxf.client.demo.simple.SimpleResponse response1 = simpleServiceClient.simpleMethod2(request1)
//
//        then:
//        response1 != null
//        response1.isIsOld()
//        response1.status.contains("young")
//    }
}
