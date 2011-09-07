import grails.plugin.spock.IntegrationSpec
import cxf.client.demo.simple.SimpleRequest
import cxf.client.demo.complex.ComplexServicePortType
import cxf.client.demo.simple.SimpleServicePortType
import cxf.client.demo.simple.SimpleResponse
import cxf.client.demo.SimpleService
import cxf.client.demo.ComplexService
/**
 */
class SimpleServiceSpec extends IntegrationSpec {

    //These are just regular old services
    SimpleService simpleService
    ComplexService complexService
    
    //these will be wired cxf services via cxf-client plugin
    SimpleServicePortType simpleServiceClient
    ComplexServicePortType complexServiceClient

    def "cxf client simple service method1 invocation"() {
        given:
        SimpleRequest request = new SimpleRequest(name: "Fred Flinstone", age: 40)

        when:
        SimpleResponse response = simpleServiceClient.simpleMethod1(request)

        then:
        response.isOld == false
        response.status == "Fred Flinstone was judged by a normal person"
    }

    def "cxf client simple service method2 invocation"() {
        given:
        SimpleRequest request = new SimpleRequest(name: "Fred Flinstone", age: 40)

        when:
        SimpleResponse response = simpleServiceClient.simpleMethod2(request)

        then:
        response.isOld == true
        response.status == "Fred Flinstone was judged by a young person"
    }

    def "cxf client response compared to inline service response for method1"() {
        given:
        SimpleRequest cxfRequest = new SimpleRequest(name: "Fred Flinstone", age: 40)
        com.cxf.demo.SimpleRequest serviceRequest = new com.cxf.demo.SimpleRequest(name: "Fred Flinstone", age: 40)

        when:
        SimpleResponse cxfResponse = simpleServiceClient.simpleMethod1(cxfRequest)
        com.cxf.demo.SimpleResponse serviceResponse = simpleService.simpleMethod1(serviceRequest)

        then:
        cxfResponse.isOld == serviceResponse.isOld
        cxfResponse.status == serviceResponse.status
    }

    def "cxf client response compared to inline service response for method2"() {
        given:
        SimpleRequest cxfRequest = new SimpleRequest(name: "Fred Flinstone", age: 40)
        com.cxf.demo.SimpleRequest serviceRequest = new com.cxf.demo.SimpleRequest(name: "Fred Flinstone", age: 40)

        when:
        SimpleResponse cxfResponse = simpleServiceClient.simpleMethod2(cxfRequest)
        com.cxf.demo.SimpleResponse serviceResponse = simpleService.simpleMethod1(serviceRequest)

        then:
        cxfResponse.isOld == serviceResponse.isOld
        cxfResponse.status == serviceResponse.status
    }
}
