package com.cxf.demo.security

import com.grails.cxf.client.security.SecurityInterceptor
import javax.security.auth.callback.Callback
import javax.security.auth.callback.CallbackHandler
import javax.security.auth.callback.UnsupportedCallbackException
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor
import org.apache.ws.security.WSPasswordCallback
import org.apache.ws.security.handler.WSHandlerConstants

/**
 */
class CustomSecurityInterceptor implements SecurityInterceptor {

    def pass
    def user

    WSS4JOutInterceptor create() {
        Map<String, Object> outProps = [:]
        outProps.put(WSHandlerConstants.ACTION, org.apache.ws.security.handler.WSHandlerConstants.USERNAME_TOKEN)
        outProps.put(WSHandlerConstants.USER, user)
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, org.apache.ws.security.WSConstants.PW_TEXT)
        outProps.put(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {

            void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0]
                pc.password = pass
            }
        })

        new WSS4JOutInterceptor(outProps)
    }
}
