import org.codehaus.groovy.grails.commons.ConfigurationHolder

// Place your Spring DSL code here
beans = {

    simpleServiceClient(com.grails.cxf.client.DynamicWebServiceClient) {
        //todo: need to get this working with auto injection from the plugin
        webServiceClientFactory = ref("webServiceClientFactory")
        clientInterface = cxf.client.demo.simple.SimpleServicePortType
        serviceName = "simpleServiceClient"
        serviceEndpointAddress = ConfigurationHolder.config.service.simple.url
        secured = false
    }

    complexServiceClient(com.grails.cxf.client.DynamicWebServiceClient) {
        //todo: need to get this working with auto injection from the plugin
        webServiceClientFactory = ref("webServiceClientFactory")
        clientInterface = cxf.client.demo.complex.ComplexServicePortType
        serviceName = "complexServiceClient"
        serviceEndpointAddress = ConfigurationHolder.config.service.complex.url
        secured = false
    }
}
