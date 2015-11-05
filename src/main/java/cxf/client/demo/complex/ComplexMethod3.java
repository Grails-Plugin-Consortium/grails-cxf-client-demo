
package cxf.client.demo.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexMethod3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexMethod3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="complexRequest" type="{http://demo.client.cxf/}complexRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexMethod3", propOrder = {
    "complexRequest"
})
public class ComplexMethod3 {

    protected ComplexRequest complexRequest;

    /**
     * Gets the value of the complexRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexRequest }
     *     
     */
    public ComplexRequest getComplexRequest() {
        return complexRequest;
    }

    /**
     * Sets the value of the complexRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexRequest }
     *     
     */
    public void setComplexRequest(ComplexRequest value) {
        this.complexRequest = value;
    }

}
