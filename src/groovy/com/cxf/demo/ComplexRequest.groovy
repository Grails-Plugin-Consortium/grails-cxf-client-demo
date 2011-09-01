package com.cxf.demo

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

/**
 */
@XmlAccessorType(XmlAccessType.FIELD)
class ComplexRequest {
    ComplexChild singleChild
    Integer propagateCount
    String taskName
}
