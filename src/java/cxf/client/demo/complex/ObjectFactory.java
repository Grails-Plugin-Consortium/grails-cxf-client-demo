
package cxf.client.demo.complex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf.client.demo.complex package. 
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

    private final static QName _ComplexContrivedException_QNAME = new QName("http://demo.client.cxf/", "ComplexContrivedException");
    private final static QName _ComplexMethod2Response_QNAME = new QName("http://demo.client.cxf/", "complexMethod2Response");
    private final static QName _ComplexMethod3Response_QNAME = new QName("http://demo.client.cxf/", "complexMethod3Response");
    private final static QName _ComplexMethod1Response_QNAME = new QName("http://demo.client.cxf/", "complexMethod1Response");
    private final static QName _ComplexMethod2_QNAME = new QName("http://demo.client.cxf/", "complexMethod2");
    private final static QName _ComplexMethod1_QNAME = new QName("http://demo.client.cxf/", "complexMethod1");
    private final static QName _ComplexMethod3_QNAME = new QName("http://demo.client.cxf/", "complexMethod3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf.client.demo.complex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComplexMethod1Response }
     * 
     */
    public ComplexMethod1Response createComplexMethod1Response() {
        return new ComplexMethod1Response();
    }

    /**
     * Create an instance of {@link ComplexMethod2 }
     * 
     */
    public ComplexMethod2 createComplexMethod2() {
        return new ComplexMethod2();
    }

    /**
     * Create an instance of {@link ComplexMethod1 }
     * 
     */
    public ComplexMethod1 createComplexMethod1() {
        return new ComplexMethod1();
    }

    /**
     * Create an instance of {@link ComplexMethod3 }
     * 
     */
    public ComplexMethod3 createComplexMethod3() {
        return new ComplexMethod3();
    }

    /**
     * Create an instance of {@link ComplexMethod2Response }
     * 
     */
    public ComplexMethod2Response createComplexMethod2Response() {
        return new ComplexMethod2Response();
    }

    /**
     * Create an instance of {@link ComplexContrivedException }
     * 
     */
    public ComplexContrivedException createComplexContrivedException() {
        return new ComplexContrivedException();
    }

    /**
     * Create an instance of {@link ComplexMethod3Response }
     * 
     */
    public ComplexMethod3Response createComplexMethod3Response() {
        return new ComplexMethod3Response();
    }

    /**
     * Create an instance of {@link ComplexChild }
     * 
     */
    public ComplexChild createComplexChild() {
        return new ComplexChild();
    }

    /**
     * Create an instance of {@link ComplexRequest }
     * 
     */
    public ComplexRequest createComplexRequest() {
        return new ComplexRequest();
    }

    /**
     * Create an instance of {@link ComplexResponse }
     * 
     */
    public ComplexResponse createComplexResponse() {
        return new ComplexResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexContrivedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "ComplexContrivedException")
    public JAXBElement<ComplexContrivedException> createComplexContrivedException(ComplexContrivedException value) {
        return new JAXBElement<ComplexContrivedException>(_ComplexContrivedException_QNAME, ComplexContrivedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexMethod2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "complexMethod2Response")
    public JAXBElement<ComplexMethod2Response> createComplexMethod2Response(ComplexMethod2Response value) {
        return new JAXBElement<ComplexMethod2Response>(_ComplexMethod2Response_QNAME, ComplexMethod2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexMethod3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "complexMethod3Response")
    public JAXBElement<ComplexMethod3Response> createComplexMethod3Response(ComplexMethod3Response value) {
        return new JAXBElement<ComplexMethod3Response>(_ComplexMethod3Response_QNAME, ComplexMethod3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexMethod1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "complexMethod1Response")
    public JAXBElement<ComplexMethod1Response> createComplexMethod1Response(ComplexMethod1Response value) {
        return new JAXBElement<ComplexMethod1Response>(_ComplexMethod1Response_QNAME, ComplexMethod1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexMethod2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "complexMethod2")
    public JAXBElement<ComplexMethod2> createComplexMethod2(ComplexMethod2 value) {
        return new JAXBElement<ComplexMethod2>(_ComplexMethod2_QNAME, ComplexMethod2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexMethod1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "complexMethod1")
    public JAXBElement<ComplexMethod1> createComplexMethod1(ComplexMethod1 value) {
        return new JAXBElement<ComplexMethod1>(_ComplexMethod1_QNAME, ComplexMethod1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexMethod3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.client.cxf/", name = "complexMethod3")
    public JAXBElement<ComplexMethod3> createComplexMethod3(ComplexMethod3 value) {
        return new JAXBElement<ComplexMethod3>(_ComplexMethod3_QNAME, ComplexMethod3 .class, null, value);
    }

}
