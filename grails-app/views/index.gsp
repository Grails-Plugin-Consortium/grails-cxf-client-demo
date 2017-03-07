<html>
<head>
    <title>CXF CLIENT DEMO</title>
    <meta name="layout" content="main"/>
    <style>
    .example .row {
        padding-bottom: 10px;
        border: 1px solid #ddd;
    }
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
                <g:form action="icd9" controller="demo" name="icd9Demo">
                    <h5>Invoke ICD9 Service</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
                </g:form>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <g:form action="local" controller="demo" name="localDemo">
                    <h5>Invoke Local Service</h5>

                    <div style="width:100%"><g:submitButton name="submitButton" value="Invoke"/></div>
                </g:form>
            </div>
        </div>
        <div class="row"><div class="col-xs-12"><A href="/services">CXF Service</A></div></div>
    </div>

    <div class="col-xs-6">
        <div class="row">
            <div class="col-xs-12">
                <h5>Service Results</h5>
                <g:if test="${icd9}">
                    <BR><BR>
                    <span class="name">${icd9?.replace("&gt;", "&gt;<br>")}</span><BR>
                </g:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>
