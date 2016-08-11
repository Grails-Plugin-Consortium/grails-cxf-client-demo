
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
 *         &lt;element name="GetICD9Level4Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getICD9Level4Result"
})
@XmlRootElement(name = "GetICD9Level4Response")
public class GetICD9Level4Response {

    @XmlElement(name = "GetICD9Level4Result")
    protected String getICD9Level4Result;

    /**
     * Gets the value of the getICD9Level4Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetICD9Level4Result() {
        return getICD9Level4Result;
    }

    /**
     * Sets the value of the getICD9Level4Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetICD9Level4Result(String value) {
        this.getICD9Level4Result = value;
    }

}
