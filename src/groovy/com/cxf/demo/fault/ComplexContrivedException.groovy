package com.cxf.demo.fault

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.ws.WebFault

/**
 */
@WebFault(name = "ComplexContrivedException", targetNamespace = "http://foo.bar.com/")
@XmlAccessorType(XmlAccessType.FIELD)
class ComplexContrivedException extends RuntimeException {

    String contrivedMessage

    public ComplexContrivedException() {
        super();
    }

    public ComplexContrivedException(String message) {
        super(message);
    }

    public ComplexContrivedException(String message, Throwable cause) {
        super(message, cause);
    }

}
