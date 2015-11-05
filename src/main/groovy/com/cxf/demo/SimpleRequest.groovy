package com.cxf.demo

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

/**
 */
@XmlAccessorType(XmlAccessType.NONE)
class SimpleRequest {

    @XmlElement
    String name

    @XmlElement
    Integer age
}
