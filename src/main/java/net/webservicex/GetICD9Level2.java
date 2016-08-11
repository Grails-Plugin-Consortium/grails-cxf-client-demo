
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
 *         &lt;element name="ICD9Level1ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "icd9Level1ID"
})
@XmlRootElement(name = "GetICD9Level2")
public class GetICD9Level2 {

    @XmlElement(name = "ICD9Level1ID")
    protected int icd9Level1ID;

    /**
     * Gets the value of the icd9Level1ID property.
     * 
     */
    public int getICD9Level1ID() {
        return icd9Level1ID;
    }

    /**
     * Sets the value of the icd9Level1ID property.
     * 
     */
    public void setICD9Level1ID(int value) {
        this.icd9Level1ID = value;
    }

}
