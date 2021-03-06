package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-06T19:45:56.575-06:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "ICD9Soap")
@XmlSeeAlso({ObjectFactory.class})
public interface ICD9Soap {

    /**
     * ICD-9-CM CLASSIFICATION OF DISEASES AND INJURIES by Description
     */
    @WebMethod(operationName = "GetICD9ByDescription", action = "http://www.webserviceX.NET/GetICD9ByDescription")
    @RequestWrapper(localName = "GetICD9ByDescription", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9ByDescription")
    @ResponseWrapper(localName = "GetICD9ByDescriptionResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9ByDescriptionResponse")
    @WebResult(name = "GetICD9ByDescriptionResult", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getICD9ByDescription(
        @WebParam(name = "ICDDescription", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String icdDescription
    );

    /**
     * ICD-9-CM CLASSIFICATION OF DISEASES AND INJURIES - Level2 
     */
    @WebMethod(operationName = "GetICD9Level2", action = "http://www.webserviceX.NET/GetICD9Level2")
    @RequestWrapper(localName = "GetICD9Level2", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level2")
    @ResponseWrapper(localName = "GetICD9Level2Response", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level2Response")
    @WebResult(name = "GetICD9Level2Result", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getICD9Level2(
        @WebParam(name = "ICD9Level1ID", targetNamespace = "http://www.webserviceX.NET")
        int icd9Level1ID
    );

    /**
     * ICD-9-CM CLASSIFICATION OF DISEASES AND INJURIES-Level 1
     */
    @WebMethod(operationName = "GetICD9Level1", action = "http://www.webserviceX.NET/GetICD9Level1")
    @RequestWrapper(localName = "GetICD9Level1", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level1")
    @ResponseWrapper(localName = "GetICD9Level1Response", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level1Response")
    @WebResult(name = "GetICD9Level1Result", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getICD9Level1();

    /**
     * ICD-9-CM CLASSIFICATION OF DISEASES AND INJURIES - Level4
     */
    @WebMethod(operationName = "GetICD9Level4", action = "http://www.webserviceX.NET/GetICD9Level4")
    @RequestWrapper(localName = "GetICD9Level4", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level4")
    @ResponseWrapper(localName = "GetICD9Level4Response", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level4Response")
    @WebResult(name = "GetICD9Level4Result", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getICD9Level4(
        @WebParam(name = "ICDCode", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String icdCode
    );

    /**
     * ICD-9-CM CLASSIFICATION OF DISEASES AND INJURIES - Level3 
     */
    @WebMethod(operationName = "GetICD9Level3", action = "http://www.webserviceX.NET/GetICD9Level3")
    @RequestWrapper(localName = "GetICD9Level3", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level3")
    @ResponseWrapper(localName = "GetICD9Level3Response", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetICD9Level3Response")
    @WebResult(name = "GetICD9Level3Result", targetNamespace = "http://www.webserviceX.NET")
    public java.lang.String getICD9Level3(
        @WebParam(name = "fromICDCode", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String fromICDCode,
        @WebParam(name = "toICDCode", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String toICDCode
    );
}
