package com.cxf.demo.security

import com.grails.cxf.client.CxfClientInterceptor
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor
import org.apache.wss4j.common.ext.WSPasswordCallback
import org.apache.wss4j.dom.handler.WSHandlerConstants

import javax.security.auth.callback.Callback
import javax.security.auth.callback.CallbackHandler
import javax.security.auth.callback.UnsupportedCallbackException

/**
 */
class CustomSecurityInterceptor implements CxfClientInterceptor {

	String pass
	String user

	WSS4JOutInterceptor create() {
		Map<String, Object> outProps = [:]
		outProps.put(WSHandlerConstants.ACTION, org.apache.ws.security.handler.WSHandlerConstants.USERNAME_TOKEN)
		outProps.put(WSHandlerConstants.USER, user)
		outProps.put(WSHandlerConstants.PASSWORD_TYPE, org.apache.ws.security.WSConstants.PW_TEXT)
		outProps.put(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {

			void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
				WSPasswordCallback pc = (WSPasswordCallback) callbacks[0]
				pc.password = pass
				pc.identifier = user
			}
		})

		new WSS4JOutInterceptor(outProps)
	}
}

//    WSS4JOutInterceptor create() {
//        Map<String, Object> outProps = [:]
//        outProps.put(WSHandlerConstants.ACTION,
//                     org.apache.ws.security.handler.WSHandlerConstants.USERNAME_TOKEN + " " +
//                     org.apache.ws.security.handler.WSHandlerConstants.TIMESTAMP + " " +
//                     org.apache.ws.security.handler.WSHandlerConstants.SIGNATURE + " " +
//                     org.apache.ws.security.handler.WSHandlerConstants.ENCRYPT)
//
//        outProps.put(WSHandlerConstants.USER, user)
//        outProps.put(WSHandlerConstants.PASSWORD_TYPE, org.apache.ws.security.WSConstants.PW_DIGEST)
//
//        outProps.put(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {
//
//            void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
//                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0]
//                pc.password = pass
//            }
//        })
//        String WSU_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"
//        outProps.put("signatureParts",
//                     "{Element}{" + WSU_NS + "}Timestamp;" +
//                     "{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body")
//
//        outProps.put(WSHandlerConstants.SIG_PROP_FILE, "client_sign.properties")
//        outProps.put(WSHandlerConstants.ENC_PROP_FILE, "client_sign_key.properties")
//
//        new WSS4JOutInterceptor(outProps)
//    }
//}
