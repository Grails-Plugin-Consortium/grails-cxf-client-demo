package com.cxf.demo

import cxf.client.demo.secure.SecureServicePortType
import net.webservicex.StockQuoteSoap

//import org.codehaus.groovy.grails.plugins.jasper.JasperController
//import org.codehaus.groovy.grails.plugins.jasper.JasperReportDef
//import org.codehaus.groovy.grails.plugins.jasper.JasperService
//import org.codehaus.groovy.grails.web.servlet.mvc.GrailsParameterMap
class ServiceController { //extends JasperController {

	StockQuoteSoap stockQuoteClient
	SecureServicePortType customSecureServiceOutClient

	def index = {}

//     def customSecureServiceOutDemoJasper(){
//        def serviceException = null
//        cxf.client.demo.simple.SimpleRequest request1 = new cxf.client.demo.simple.SimpleRequest(age: 32, name: "Christian")
//        cxf.client.demo.secure.SimpleResponse response1 = new cxf.client.demo.secure.SimpleResponse()
//        try {
//            response1 = customSecureServiceOutClient.secureMethod()
//        } catch (Exception e) {
//            serviceException = new Exception("Service invocation threw an error")
//        }
//
//         renderJasper(chainModel, (serviceException ?: "Response status: ${response1.status} :: isOld: ${response1.isIsOld()}").toString(), params, request, jasperService)
//     }
//
//
//    def stockQuoteDemoJasper() {
//        String stockQuote
//        try {
//            stockQuote = stockQuoteClient.getQuote("AAPL")
//        } catch(Exception e){
//            stockQuote = e.message
//        }
//
////        renderJasper(chainModel, stockQuote.replace("><",">\n<"), params, request, jasperService)
//    }
//
//     private def renderJasper(Map chainModel, String output, def params, HttpServletRequest request, JasperService jasperService) {
//        def testModel = this.getProperties().containsKey('chainModel') ? chainModel : null
//        params.name = output //inject correct string to param
//        addImagesURIIfHTMLReport(params, request.contextPath)
//        JasperReportDef report = jasperService.buildReportDefinition(params, request.getLocale(), testModel)
//        addJasperPrinterToSession(request.getSession(), report.jasperPrinter)
//        generateResponse(report)
//    }
}
