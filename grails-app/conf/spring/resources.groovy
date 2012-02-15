import com.cxf.demo.logging.CustomLoggingInInterceptor
import com.cxf.demo.logging.VerboseCustomLoggingInInterceptor
import com.cxf.demo.security.CustomSecurityInterceptor
import com.cxf.demo.logging.CustomLoggingOutInterceptor
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy

// Place your Spring DSL code here
beans = {
    myCustomInterceptor(CustomSecurityInterceptor) {
        user = "wsuser"
        pass = "secret"
    }

    customLoggingInInterceptor(CustomLoggingInInterceptor) {
        name = "customLoggingInInterceptor"
    }

    verboseLoggingInInterceptor(VerboseCustomLoggingInInterceptor) {
        name = "verboseLoggingInInterceptor"
    }

     customLoggingOutInterceptor(CustomLoggingOutInterceptor) {
        name = "customLoggingOutInterceptor"
    }

    customHttpClientPolicy(HTTPClientPolicy){
        connectionTimeout = 30000
        receiveTimeout = 60000
        allowChunking = false
    }
}
