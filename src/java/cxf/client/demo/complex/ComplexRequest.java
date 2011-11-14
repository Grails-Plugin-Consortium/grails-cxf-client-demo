
package cxf.client.demo.complex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleChild" type="{http://demo.client.cxf/}complexChild" minOccurs="0"/>
 *         &lt;element name="propagateCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexRequest", propOrder = {
    "singleChild",
    "propagateCount",
    "taskName"
})
public class ComplexRequest {

    protected ComplexChild singleChild;
    protected Integer propagateCount;
    protected String taskName;

    /**
     * Gets the value of the singleChild property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexChild }
     *     
     */
    public ComplexChild getSingleChild() {
        return singleChild;
    }

    /**
     * Sets the value of the singleChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexChild }
     *     
     */
    public void setSingleChild(ComplexChild value) {
        this.singleChild = value;
    }

    /**
     * Gets the value of the propagateCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropagateCount() {
        return propagateCount;
    }

    /**
     * Sets the value of the propagateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropagateCount(Integer value) {
        this.propagateCount = value;
    }

    /**
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

}
