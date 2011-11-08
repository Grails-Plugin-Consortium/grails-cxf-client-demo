package cxf.client.demo

import com.cxf.demo.SimpleResponse
import com.cxf.demo.SimpleRequest

class SecureService {

    static expose = ['cxf']

    SimpleResponse secureMethod() {
        new SimpleResponse(isOld: false, status: "Secure Service")
    }
}
