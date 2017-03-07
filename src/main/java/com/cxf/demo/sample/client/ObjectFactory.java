
package com.cxf.demo.sample.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cxf.demo.sample.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceMethod_QNAME = new QName("http://demo.cxf.com/", "serviceMethod");
    private final static QName _ServiceMethodResponse_QNAME = new QName("http://demo.cxf.com/", "serviceMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cxf.demo.sample.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceMethod }
     * 
     */
    public ServiceMethod createServiceMethod() {
        return new ServiceMethod();
    }

    /**
     * Create an instance of {@link ServiceMethodResponse }
     * 
     */
    public ServiceMethodResponse createServiceMethodResponse() {
        return new ServiceMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.cxf.com/", name = "serviceMethod")
    public JAXBElement<ServiceMethod> createServiceMethod(ServiceMethod value) {
        return new JAXBElement<ServiceMethod>(_ServiceMethod_QNAME, ServiceMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.cxf.com/", name = "serviceMethodResponse")
    public JAXBElement<ServiceMethodResponse> createServiceMethodResponse(ServiceMethodResponse value) {
        return new JAXBElement<ServiceMethodResponse>(_ServiceMethodResponse_QNAME, ServiceMethodResponse.class, null, value);
    }

}
