package cxf.client.demo

import com.cxf.demo.SimpleResponse


class AuthorizationService {

    static expose = ['cxf']

    SimpleResponse secureMethod() {
        println "in authorization secure method"
        new SimpleResponse(isOld: false, status: "Authorization Service")
    }
}
