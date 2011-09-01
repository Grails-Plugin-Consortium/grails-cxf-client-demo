package cxf.client.demo

class ComplexService {

    static expose = ['cxf']

    ComplexResponse complexMethod1(ComplexRequest request) {
        ComplexResponse response = new ComplexResponse()
        request?.propagateCount?.times {
            response.children << new ComplexChild(name: "Child$it")
        }
        response.childCount = response?.children?.size() ?: 0
        response.message = "Some message here"
        response
    }

    ComplexResponse complexMethod2(ComplexRequest request) {
        ComplexResponse response = new ComplexResponse()
        request?.propagateCount?.times {
            response.children << new ComplexChild(name: "Child$it")
        }
        request?.propagateCount?.times {
            response.children << new ComplexChild(name: "Child$it")
        }
        response.childCount = response?.children?.size() ?: 0
        response.message = "Oops we propagated twice!"
        response
    }
}
