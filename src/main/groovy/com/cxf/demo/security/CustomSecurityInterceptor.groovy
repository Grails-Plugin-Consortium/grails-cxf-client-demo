package com.cxf.demo.security

import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor
import org.apache.wss4j.common.ext.WSPasswordCallback
import org.apache.wss4j.dom.WSConstants
import org.apache.wss4j.dom.handler.WSHandlerConstants

import javax.security.auth.callback.Callback
import javax.security.auth.callback.CallbackHandler
import javax.security.auth.callback.UnsupportedCallbackException


public class CustomSecurityInterceptor extends WSS4JInInterceptor {
	CustomSecurityInterceptor() {
		super([(WSHandlerConstants.ACTION)         : WSHandlerConstants.USERNAME_TOKEN,
			   (WSHandlerConstants.PASSWORD_TYPE)  : WSConstants.PW_TEXT,
			   (WSHandlerConstants.PW_CALLBACK_REF): new UsernamePasswordCallbackHandler()])
	}

	public class UsernamePasswordCallbackHandler implements CallbackHandler {

		private Map<String, String> users = new HashMap<String, String>();

		public UsernamePasswordCallbackHandler() {
			users.put("wsuser", "password");
			users.put("bob", "security");
			users.put("alice", "securityPassword");
		}

		public void handle(Callback[] callbacks)
				throws IOException, UnsupportedCallbackException {
			for (int i = 0; i < callbacks.length; i++) {
				if (callbacks[i] instanceof WSPasswordCallback) {
					WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
					if (pc.getUsage() == WSPasswordCallback.USERNAME_TOKEN) {
						pc.setPassword(users.get(pc.getIdentifier()));
						break;
					}
				} else {
					throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
				}
			}
		}
	}
}