// Place your Spring DSL code here
beans = {

    simpleServiceClient(com.grails.cxf.client.DynamicWebServiceClient) {
        clientInterface = cxf.client.demo.simple.SimpleServicePortType
        serviceName = "simpleServiceClient"
        serviceEndpointAddress = "http://localhost:8080/cxf-client-demo/services/simple"
        secured = false
    }

    complexServiceClient(com.grails.cxf.client.DynamicWebServiceClient) {
        clientInterface = cxf.client.demo.complex.ComplexServicePortType
        serviceName = "complexServiceClient"
        serviceEndpointAddress = "http://localhost:8080/cxf-client-demo/services/complex"
        secured = false
    }
}
