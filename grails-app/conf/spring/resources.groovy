import com.cxf.demo.fault.out.interceptor.*
import com.cxf.demo.logging.CustomLoggingInInterceptor
import com.cxf.demo.logging.CustomLoggingOutInterceptor
import com.cxf.demo.logging.VerboseCustomLoggingInInterceptor
import com.cxf.demo.security.CustomSecurityInterceptor
import org.grails.cxf.client.security.DefaultSecurityOutInterceptor
import org.apache.cxf.configuration.security.AuthorizationPolicy
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy

// Place your Spring DSL code here
beans = {

	myCustomInterceptor(CustomSecurityInterceptor)

	myCustomerSecurityOutInterceptor(DefaultSecurityOutInterceptor){
		username = 'wsuser'
		password = 'password'
	}

	customLoggingInInterceptor(CustomLoggingInInterceptor) {
		name = "customLoggingInInterceptor"
	}

	customFaultOutInterceptorSetup(CustomFaultOutInterceptorSetup)
	customFaultOutInterceptorPreLogical(CustomFaultOutInterceptorPreLogical)
	customFaultOutInterceptorUserLogical(CustomFaultOutInterceptorUserLogical)
	customFaultOutInterceptorPostLogical(CustomFaultOutInterceptorPostLogical)
	customFaultOutInterceptorPrepareSend(CustomFaultOutInterceptorPrepareSend)
	customFaultOutInterceptorPreStream(CustomFaultOutInterceptorPreStream)
	customFaultOutInterceptorPreProtocol(CustomFaultOutInterceptorPreProtocol)
	customFaultOutInterceptorWrite(CustomFaultOutInterceptorWrite)
	customFaultOutInterceptorMarshal(CustomFaultOutInterceptorMarshal)
	customFaultOutInterceptorPreProtocol(CustomFaultOutInterceptorPreProtocol)
	customFaultOutInterceptorPostProtocol(CustomFaultOutInterceptorPostProtocol)
	customFaultOutInterceptorPreStream(CustomFaultOutInterceptorPreStream)
	customFaultOutInterceptorPostStream(CustomFaultOutInterceptorPostStream)
	customFaultOutInterceptorSend(CustomFaultOutInterceptorSend)

	verboseLoggingInInterceptor(VerboseCustomLoggingInInterceptor) {
		name = "verboseLoggingInInterceptor"
	}

	customLoggingOutInterceptor(CustomLoggingOutInterceptor) {
		name = "customLoggingOutInterceptor"
	}

	customHttpClientPolicy(HTTPClientPolicy) {
		connectionTimeout = 30000
		receiveTimeout = 60000
		allowChunking = false
	}

	customAuthorizationPolicy(AuthorizationPolicy) {
		userName = 'wsuser'
		password = 'secret'
		authorizationType = 'Basic'
	}
}
