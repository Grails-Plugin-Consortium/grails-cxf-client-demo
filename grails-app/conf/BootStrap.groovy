import javax.security.auth.callback.Callback
import javax.security.auth.callback.CallbackHandler
import javax.security.auth.callback.UnsupportedCallbackException
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor
import org.apache.ws.security.WSConstants
import org.apache.ws.security.WSPasswordCallback
import org.apache.ws.security.handler.WSHandlerConstants

class BootStrap {

    def secureServiceFactory
    def authInterceptor

    def init = { servletContext ->

        Map<String, Object> inProps = [:]
        inProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        inProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        inProps.put(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {

            void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0]
                if(pc.identifier == "ususer" && pc.password != "secret") {
                    println "error :: wrong password"
                    throw new IOException("wrong password")
                }
            }
        })
        secureServiceFactory.getInInterceptors().add(new WSS4JInInterceptor(inProps))
    }

    def destroy = {
    }
}
