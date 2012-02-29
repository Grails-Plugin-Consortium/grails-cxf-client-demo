import com.cxf.demo.logging.CustomLoggingInInterceptor
import com.cxf.demo.logging.VerboseCustomLoggingInInterceptor
import com.cxf.demo.security.CustomSecurityInterceptor
import com.cxf.demo.logging.CustomLoggingOutInterceptor
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy
import com.cxf.demo.fault.CustomFaultOutInterceptorPreLogical
import com.cxf.demo.fault.CustomFaultOutInterceptorMarshal
import com.cxf.demo.fault.CustomFaultOutInterceptorPostLogical
import com.cxf.demo.fault.CustomFaultOutInterceptorPrepareSend
import com.cxf.demo.fault.CustomFaultOutInterceptorPreProtocol
import com.cxf.demo.fault.CustomFaultOutInterceptorPreStream
import com.cxf.demo.fault.CustomFaultOutInterceptorSetup
import com.cxf.demo.fault.CustomFaultOutInterceptorUserLogical
import com.cxf.demo.fault.CustomFaultOutInterceptorWrite
import com.cxf.demo.fault.CustomFaultOutInterceptorPostStream
import com.cxf.demo.fault.CustomFaultOutInterceptorSend
import com.cxf.demo.fault.CustomFaultOutInterceptorPostProtocol

// Place your Spring DSL code here
beans = {
    myCustomInterceptor(CustomSecurityInterceptor) {
        user = "wsuser"
        pass = "secret"
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

    customHttpClientPolicy(HTTPClientPolicy){
        connectionTimeout = 30000
        receiveTimeout = 60000
        allowChunking = false
    }
}
