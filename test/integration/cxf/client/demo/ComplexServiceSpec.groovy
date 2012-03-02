package cxf.client.demo

import com.cxf.demo.ComplexChild
import com.cxf.demo.fault.ComplexContrivedException
import grails.plugin.spock.IntegrationSpec

/**
 */
class ComplexServiceSpec extends IntegrationSpec {

    //These are just regular old services
    ComplexService complexService

    def "get the base service response for complex method1"() {
        given:
        com.cxf.demo.ComplexRequest serviceRequest = new com.cxf.demo.ComplexRequest(propagateCount: 3, taskName: "helloWorld", singleChild: new ComplexChild(name: "child"))

        when:
        com.cxf.demo.ComplexResponse serviceResponse = complexService.complexMethod1(serviceRequest)

        then:
        serviceResponse.childCount > 0
        serviceResponse.message == "Some message here"
        serviceResponse.children.size() > 0
    }

    def "get the base service response for complex method2"() {
        given:
        com.cxf.demo.ComplexRequest serviceRequest = new com.cxf.demo.ComplexRequest(propagateCount: 3, taskName: "helloWorld", singleChild: new ComplexChild(name: "child"))

        when:
        com.cxf.demo.ComplexResponse serviceResponse = complexService.complexMethod2(serviceRequest)

        then:
        serviceResponse.childCount > 3
        serviceResponse.message == "Oops we propagated twice!"
        serviceResponse.children.size() > 0
    }

    def "invoke a method that throws a checked exception"() {
        given:
        com.cxf.demo.ComplexRequest serviceRequest = new com.cxf.demo.ComplexRequest(propagateCount: 3, taskName: "helloWorld", singleChild: new ComplexChild(name: "child"))

        when:
        com.cxf.demo.ComplexResponse serviceResponse = complexService.complexMethod3(serviceRequest)

        then:
        !serviceResponse
        thrown(ComplexContrivedException)
    }
}
