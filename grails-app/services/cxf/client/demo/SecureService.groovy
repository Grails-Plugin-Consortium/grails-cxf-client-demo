package cxf.client.demo

import com.cxf.demo.SimpleResponse
import com.cxf.demo.SimpleRequest

class SecureService {

    static expose = ['cxf']

    SimpleResponse secureMethod() {
        println "in secure Method"
        new SimpleResponse(isOld: false, status: "Secure Service")
    }
}
