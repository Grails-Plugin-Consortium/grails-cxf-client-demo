package cxf.client.demo

import pages.SimplePage
import geb.spock.GebSpec
import spock.lang.Ignore

/**
 */
class FunctionalSpec extends GebSpec {

    def setup() {
        browser.config.autoClearCookies = false
    }

    @Ignore("This works only when running locally, not on build server?!")
    def "do some test"() {
        when:
        to SimplePage

        then:
        name == "Christian"
        isOld == "false"
        status != ""
    }

//    def "functional test"() {
    //        given:
    //        cxf.client.demo.simple.SimpleRequest request = new cxf.client.demo.simple.SimpleRequest(name: "Fred Flinstone", age: 40)
    //
    //        when:
    //        cxf.client.demo.simple.SimpleResponse response = simpleServiceClient.simpleMethod1(request)
    //
    //        then:
    //        response.isOld == false
    //        response.status == "Fred Flinstone was judged by a normal person"
    //    }
}
