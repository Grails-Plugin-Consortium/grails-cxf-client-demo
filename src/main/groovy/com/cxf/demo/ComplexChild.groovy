package com.cxf.demo

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

/**
 */
@XmlAccessorType(XmlAccessType.NONE)
class ComplexChild {
    @XmlElement
    String name
}
