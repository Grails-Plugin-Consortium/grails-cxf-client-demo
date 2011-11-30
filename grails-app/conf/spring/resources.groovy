import com.cxf.demo.logging.CustomLoggingInterceptor
import com.cxf.demo.security.CustomSecurityInterceptor

// Place your Spring DSL code here
beans = {
    myCustomInterceptor(CustomSecurityInterceptor){
        user = "wsuser"
        pass = "secret"
    }

    myCustomLoggingInterceptor(CustomLoggingInterceptor){
        name = "myCustomLoggingInterceptor"
    }
    myCustomLoggingInterceptor2(CustomLoggingInterceptor){
        name = "myCustomLoggingInterceptor2"
    }
}
