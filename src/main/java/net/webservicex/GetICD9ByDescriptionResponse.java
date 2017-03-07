
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetICD9ByDescriptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getICD9ByDescriptionResult"
})
@XmlRootElement(name = "GetICD9ByDescriptionResponse")
public class GetICD9ByDescriptionResponse {

    @XmlElement(name = "GetICD9ByDescriptionResult")
    protected String getICD9ByDescriptionResult;

    /**
     * Gets the value of the getICD9ByDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetICD9ByDescriptionResult() {
        return getICD9ByDescriptionResult;
    }

    /**
     * Sets the value of the getICD9ByDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetICD9ByDescriptionResult(String value) {
        this.getICD9ByDescriptionResult = value;
    }

}
