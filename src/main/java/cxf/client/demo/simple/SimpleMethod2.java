
package cxf.client.demo.simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleMethod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleMethod2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simpleRequest" type="{http://demo.client.cxf/}simpleRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleMethod2", propOrder = {
    "simpleRequest"
})
public class SimpleMethod2 {

    protected SimpleRequest simpleRequest;

    /**
     * Gets the value of the simpleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRequest }
     *     
     */
    public SimpleRequest getSimpleRequest() {
        return simpleRequest;
    }

    /**
     * Sets the value of the simpleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRequest }
     *     
     */
    public void setSimpleRequest(SimpleRequest value) {
        this.simpleRequest = value;
    }

}
