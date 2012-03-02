
package cxf.client.demo.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexContrivedException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexContrivedException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contrivedMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexContrivedException", propOrder = {
    "contrivedMessage"
})
public class ComplexContrivedException {

    @XmlElement(required = true, nillable = true)
    protected String contrivedMessage;

    /**
     * Gets the value of the contrivedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrivedMessage() {
        return contrivedMessage;
    }

    /**
     * Sets the value of the contrivedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrivedMessage(String value) {
        this.contrivedMessage = value;
    }

}
