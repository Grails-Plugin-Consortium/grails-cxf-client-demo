<%@ page import="cxf.client.demo.complex.ComplexContrivedException_Exception" %>
<html>
<head>
    <title>CXF CLIENT DEMO</title>
    <meta name="layout" content="main"/>
    <style>
        .example .row { padding-bottom: 10px; border: 1px solid #ddd;}
    </style>
</head>

<body>
<div class="row">
    <div class="col-xs-6 example">

        <div class="row">
            <div class="col-xs-12">
                <h5>Service Settings</h5>
                <span style="font-weight: bold;">Simple Url:</span> ${grailsApplication.config.service.simple.url}<BR>
                <span style="font-weight: bold;">Complex Url:</span> ${grailsApplication.config.service.complex.url}<br>
                <span style="font-weight: bold;">Secure Url:</span> ${grailsApplication.config.service.secure.url}<br><br>
                <input type="button" value="Reset Form"
                       onclick="document.location.href = '${createLink(controller:"demo", action:"index")}'"/>

            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="stockQuoteDemo" controller="demo" name="stockQuoteDemo">
                    <h5>Invoke Stock Quote Service</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="simpleServiceDemo" controller="demo" name="simpleServiceDemo">
                    <h5>Invoke Simple Service</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="simpleServiceInterceptorDemo" controller="demo" name="simpleServiceInterceptorDemo">
                    <h5>Invoke Simple Service With Custom Interceptors (simpleServiceInterceptorDemo)</h5>
                    default interceptors are set to false<br>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="complexServiceDemo" controller="demo" name="complexServiceDemo">
                    <h5>Invoke Complex Service</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="complexServiceFaultDemo" controller="demo" name="complexServiceFaultDemo">
                    <h5>Invoke Complex Service w/Contrived Exception</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="secureServiceDemo" controller="demo" name="secureServiceDemo">
                    <h5>Invoke Secure Service Using Default Interceptor</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">

                <g:form action="customSecureServiceDemo" controller="demo" name="customSecureServiceDemo">
                    <h5>Invoke Secure Service Using Custom Interceptor</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">

                <g:form action="customSecureServiceAuthorizationDemo" controller="demo" name="customSecureServiceAuthorizationDemo">
                    <h5>Invoke Secure Service Using Authorization Policy</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="insecureServiceDemo" controller="demo" name="insecureServiceDemo">
                    <h5>Invoke Secure Service With No Credentials (SoapFault Exception)</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-12">
                <g:form action="customSecureServiceOutDemo" controller="demo" name="customSecureServiceOutDemo">
                    <h5>Invoke Secure Service Using Custom Interceptor and Custom Logging</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>

                </g:form>
            </div>
        </div>
    </div>

    <div class="col-xs-6">
        <div class="row">
            <div class="col-xs-12">
                <h5>Service Results</h5>
                <g:if test="${stockQuote}">
                    <BR><BR>
                    <span class="name">${stockQuote?.encodeAsHTML()?.replace("&gt;", "&gt;<br>")}</span><BR>
                </g:if>
                <g:if test="${serviceException}">
                    <BR><BR>
                    <span style="font-weight: bold;">Exception:</span> <span
                        class="name">${serviceException?.encodeAsHTML()}</span><BR>
                    <span style="font-weight: bold;">Exception Message:</span> <span
                        class="name">${serviceException?.message?.encodeAsHTML()}</span><BR>
                    <span style="font-weight: bold;">Exception Cause:</span> <span
                        class="name">${serviceException?.cause?.encodeAsHTML()}</span><BR>
                    <g:if test="${serviceException instanceof ComplexContrivedException_Exception}">
                        <span style="font-weight: bold;">Exception Contrived Message:</span> <span
                            class="name">${serviceException?.faultInfo.contrivedMessage?.encodeAsHTML()}</span><BR>
                    </g:if>
                </g:if>
                <g:if test="${simpleRequest1}">
                    <BR><BR>
                    <span style="font-weight: bold;">Request 1 Name:</span> <span
                        class="name">${simpleRequest1?.name}</span><BR>
                    <span style="font-weight: bold;">Request 1 Age:</span> ${simpleRequest1?.age}<BR>
                    <span style="font-weight: bold;">Response 1 Is Old:</span> <span
                        class="isOld">${simpleResponse1?.isOld}</span><br>
                    <span style="font-weight: bold;">Response 1 Status:</span> <span
                        class="status">${simpleResponse1?.status}</span><br>
                </g:if>
                <g:if test="${simpleRequest2}">
                    <BR><BR>
                    <span style="font-weight: bold;">Request 1 Name:</span> ${simpleRequest2?.name}<BR>
                    <span style="font-weight: bold;">Request 1 Age:</span> ${simpleRequest2?.age}<BR>
                    <span style="font-weight: bold;">Response 1 Is Old:</span> ${simpleResponse2?.isOld}<br>
                    <span style="font-weight: bold;">Response 1 Status:</span> ${simpleResponse2?.status}<br>
                </g:if>
                <g:if test="${complexRequest1}">
                    <BR><BR>
                    <span style="font-weight: bold;">Request 1 Child:</span> ${complexRequest1?.singleChild}<BR>
                    <span style="font-weight: bold;">Request 1 Propagate:</span> ${complexRequest1?.propagateCount}<BR>
                    <span style="font-weight: bold;">Response 1 Child Count:</span> ${complexResponse1?.childCount}<br>
                    <span style="font-weight: bold;">Response 1 Children:</span> ${complexResponse1?.children}<br>
                    <span style="font-weight: bold;">Response 1 Message:</span> ${complexResponse1?.message}<br>
                </g:if>
                <g:if test="${complexRequest2}">
                    <BR><BR>
                    <span style="font-weight: bold;">Request 2 Child:</span> ${complexRequest2?.singleChild}<BR>
                    <span style="font-weight: bold;">Request 2 Propagate:</span> ${complexRequest2?.propagateCount}<BR>
                    <span style="font-weight: bold;">Response 2 Child Count:</span> ${complexResponse2?.childCount}<br>
                    <span style="font-weight: bold;">Response 2 Children:</span> ${complexResponse2?.children}<br>
                    <span style="font-weight: bold;">Response 2 Message:</span> ${complexResponse2?.message}<br>
                </g:if>

            </div>
        </div>
    </div>
</div>
</body>
</html>
