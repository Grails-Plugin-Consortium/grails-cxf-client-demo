package cxf.client.demo

import grails.test.spock.IntegrationSpec

/**
 */
class SimpleServiceSpec extends IntegrationSpec {

    //These are just regular old services
    SimpleService simpleService

    def "get the base service response for simple method1"() {
        given:
        com.cxf.demo.SimpleRequest serviceRequest = new com.cxf.demo.SimpleRequest(name: "Fred Flinstone", age: 40)

        when:
        com.cxf.demo.SimpleResponse serviceResponse = simpleService.simpleMethod1(serviceRequest)

        then:
        !serviceResponse.isOld
        serviceResponse.status.contains("normal")
    }

    def "get the base service response for simple method2"() {
        given:
        com.cxf.demo.SimpleRequest serviceRequest = new com.cxf.demo.SimpleRequest(name: "Fred Flinstone", age: 40)

        when:
        com.cxf.demo.SimpleResponse serviceResponse = simpleService.simpleMethod2(serviceRequest)

        then:
        serviceResponse.isOld
        serviceResponse.status.contains("young")
    }
}
