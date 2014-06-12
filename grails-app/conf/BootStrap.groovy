import com.sample.ws.BasicAuthAuthorizationInterceptor
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor
import org.apache.ws.security.WSConstants
import org.apache.ws.security.WSSecurityEngine
import org.apache.ws.security.WSSecurityException
import org.apache.ws.security.handler.RequestData
import org.apache.ws.security.handler.WSHandlerConstants
import org.apache.ws.security.message.token.UsernameToken
import org.apache.ws.security.validate.UsernameTokenValidator
import org.apache.ws.security.validate.Validator

import javax.xml.namespace.QName
import org.apache.cxf.frontend.ServerFactoryBean

class BootStrap {

    ServerFactoryBean secureServiceFactory
    ServerFactoryBean authorizationServiceFactory

    def init = { servletContext ->

        Map<String, Object> inProps = [:]
        inProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        inProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        Map<QName, Validator> validatorMap = new HashMap<QName, Validator>();
        validatorMap.put(WSSecurityEngine.USERNAME_TOKEN, new UsernameTokenValidator() {

            @Override
            protected void verifyPlaintextPassword(UsernameToken usernameToken, RequestData data) throws WSSecurityException {
                if(data.username == "wsuser" && usernameToken.password != "secret") {
                    throw new WSSecurityException("password mismatch")
                } else {
                    println "user name and password were correct!"
                }
            }
        });
        inProps.put(WSS4JInInterceptor.VALIDATOR_MAP, validatorMap);

        secureServiceFactory.inInterceptors.add(new WSS4JInInterceptor(inProps))
        secureServiceFactory.getProperties(true).put("ws-security.enable.nonce.cache","false")
        secureServiceFactory.getProperties(true).put("ws-security.enable.timestamp.cache","false")

        authorizationServiceFactory.inInterceptors.add(new BasicAuthAuthorizationInterceptor())
        authorizationServiceFactory.getProperties(true).put("ws-security.enable.nonce.cache","false")
        authorizationServiceFactory.getProperties(true).put("ws-security.enable.timestamp.cache","false")
    }

    def destroy = {
    }
}
