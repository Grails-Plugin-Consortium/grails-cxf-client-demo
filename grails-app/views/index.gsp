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
    </div>

    <div class="col-xs-6">
        <div class="row">
            <div class="col-xs-12">
                <h5>Service Results</h5>
                <g:if test="${stockQuote}">
                    <BR><BR>
                    <span class="name">${stockQuote?.encodeAsHTML()?.replace("&gt;", "&gt;<br>")}</span><BR>
                </g:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>
