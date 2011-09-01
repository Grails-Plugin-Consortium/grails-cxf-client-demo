package com.cxf.demo
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

/**
 */
@XmlAccessorType(XmlAccessType.FIELD)
class ComplexResponse {
    Integer childCount
    List<ComplexChild> children
    String message
}
