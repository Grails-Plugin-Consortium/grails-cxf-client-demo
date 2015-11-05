
package cxf.client.demo.authorization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secureMethodResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secureMethodResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SimpleResponse" type="{http://demo.client.cxf/}simpleResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "secureMethodResponse", propOrder = {
    "simpleResponse"
})
public class SecureMethodResponse {

    @XmlElement(name = "SimpleResponse")
    protected SimpleResponse simpleResponse;

    /**
     * Gets the value of the simpleResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleResponse }
     *     
     */
    public SimpleResponse getSimpleResponse() {
        return simpleResponse;
    }

    /**
     * Sets the value of the simpleResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleResponse }
     *     
     */
    public void setSimpleResponse(SimpleResponse value) {
        this.simpleResponse = value;
    }

}
