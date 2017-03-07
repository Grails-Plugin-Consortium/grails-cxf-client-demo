
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
 *         &lt;element name="GetICD9Level1Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getICD9Level1Result"
})
@XmlRootElement(name = "GetICD9Level1Response")
public class GetICD9Level1Response {

    @XmlElement(name = "GetICD9Level1Result")
    protected String getICD9Level1Result;

    /**
     * Gets the value of the getICD9Level1Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetICD9Level1Result() {
        return getICD9Level1Result;
    }

    /**
     * Sets the value of the getICD9Level1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetICD9Level1Result(String value) {
        this.getICD9Level1Result = value;
    }

}
