
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromICDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toICDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fromICDCode",
    "toICDCode"
})
@XmlRootElement(name = "GetICD9Level3")
public class GetICD9Level3 {

    protected String fromICDCode;
    protected String toICDCode;

    /**
     * Gets the value of the fromICDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromICDCode() {
        return fromICDCode;
    }

    /**
     * Sets the value of the fromICDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromICDCode(String value) {
        this.fromICDCode = value;
    }

    /**
     * Gets the value of the toICDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToICDCode() {
        return toICDCode;
    }

    /**
     * Sets the value of the toICDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToICDCode(String value) {
        this.toICDCode = value;
    }

}
