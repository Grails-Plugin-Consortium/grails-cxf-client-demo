package cxf.client.demo

import grails.plugin.spock.IntegrationSpec

/**
 */
class SecureServiceSpec extends IntegrationSpec {

    //These are just regular old services
    SecureService secureService

    def "get the base service response for complex method1"() {
        when:
        com.cxf.demo.SimpleResponse serviceResponse = secureService.secureMethod()

        then:
        !serviceResponse.isOld
        serviceResponse.status == "Secure Service"
    }
}
