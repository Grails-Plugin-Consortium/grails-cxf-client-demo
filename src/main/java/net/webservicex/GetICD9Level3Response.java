
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
 *         &lt;element name="GetICD9Level3Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getICD9Level3Result"
})
@XmlRootElement(name = "GetICD9Level3Response")
public class GetICD9Level3Response {

    @XmlElement(name = "GetICD9Level3Result")
    protected String getICD9Level3Result;

    /**
     * Gets the value of the getICD9Level3Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetICD9Level3Result() {
        return getICD9Level3Result;
    }

    /**
     * Sets the value of the getICD9Level3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetICD9Level3Result(String value) {
        this.getICD9Level3Result = value;
    }

}
