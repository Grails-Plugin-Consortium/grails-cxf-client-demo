import com.grails.cxf.client.WebServiceClientFactoryImpl
import org.codehaus.groovy.grails.commons.ConfigurationHolder

// Place your Spring DSL code here
beans = {

    //webServiceClientFactory(WebServiceClientFactoryImpl)

    simpleServiceClient(com.grails.cxf.client.DynamicWebServiceClient) {
        //webServiceClientFactory = ref("webServiceClientFactory")
        clientInterface = cxf.client.demo.simple.SimpleServicePortType
        serviceName = "simpleServiceClient"
        serviceEndpointAddress = ConfigurationHolder.config.service.simple.url
        secured = false
    }

    complexServiceClient(com.grails.cxf.client.DynamicWebServiceClient) {
        //webServiceClientFactory = ref("webServiceClientFactory")
        clientInterface = cxf.client.demo.complex.ComplexServicePortType
        serviceName = "complexServiceClient"
        serviceEndpointAddress = ConfigurationHolder.config.service.complex.url
        secured = false
    }
}
