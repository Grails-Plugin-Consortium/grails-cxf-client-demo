
package cxf.client.demo.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexMethod1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexMethod1Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComplexResponse" type="{http://demo.client.cxf/}complexResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexMethod1Response", propOrder = {
    "complexResponse"
})
public class ComplexMethod1Response {

    @XmlElement(name = "ComplexResponse")
    protected ComplexResponse complexResponse;

    /**
     * Gets the value of the complexResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexResponse }
     *     
     */
    public ComplexResponse getComplexResponse() {
        return complexResponse;
    }

    /**
     * Sets the value of the complexResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexResponse }
     *     
     */
    public void setComplexResponse(ComplexResponse value) {
        this.complexResponse = value;
    }

}
