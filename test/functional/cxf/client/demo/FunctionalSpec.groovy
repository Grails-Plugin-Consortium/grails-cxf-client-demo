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
    def "test simple service page"() {
        when:
        to SimplePage

        then:
        name == "Christian"
        isOld == "false"
        status != ""
    }
}
