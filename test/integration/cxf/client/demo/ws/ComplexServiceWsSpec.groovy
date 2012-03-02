package cxf.client.demo.ws

import cxf.client.demo.complex.ComplexContrivedException_Exception
import cxf.client.demo.complex.ComplexServicePortType
import javax.jws.WebParam
import spock.lang.Specification
import cxf.client.demo.complex.ComplexContrivedException
import spock.lang.Shared
import groovy.mock.interceptor.MockFor

/**
 */
class ComplexServiceWsSpec extends Specification {

    @Shared
    ComplexServicePortType complexServiceClient

    def setup() {
        //Mock(ComplexServicePortType)
        complexServiceClient = [complexMethod3: {
            cxf.client.demo.complex.ComplexRequest request ->
            throw new ComplexContrivedException_Exception("this is silly1", new ComplexContrivedException(contrivedMessage: "this is silly2"))
        }] as ComplexServicePortType
    }

    //this will not actually test the proxy typed exception, but it will at least fake the call and act like an typed exception
    def "test for cxf checked exception type"() {
        given:
        cxf.client.demo.complex.ComplexRequest request = new cxf.client.demo.complex.ComplexRequest(
                singleChild: new cxf.client.demo.complex.ComplexChild(name: "Child"),
                propagateCount: 3)

        when:
        cxf.client.demo.complex.ComplexResponse response = complexServiceClient.complexMethod3(request)

        then:
        request
        request.propagateCount == 3
        request.singleChild.name == "Child"
        !response
        ComplexContrivedException_Exception exception = thrown()
        exception.message == "this is silly1"
        exception.faultInfo.contrivedMessage == "this is silly2"
    }
}
