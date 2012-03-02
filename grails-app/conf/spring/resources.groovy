import com.cxf.demo.logging.CustomLoggingInInterceptor
import com.cxf.demo.logging.VerboseCustomLoggingInInterceptor
import com.cxf.demo.security.CustomSecurityInterceptor
import com.cxf.demo.logging.CustomLoggingOutInterceptor
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPreLogical
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorMarshal
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPostLogical
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPrepareSend
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPreProtocol
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPreStream
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorSetup
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorUserLogical
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorWrite
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPostStream
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorSend
import com.cxf.demo.fault.out.interceptor.CustomFaultOutInterceptorPostProtocol

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
