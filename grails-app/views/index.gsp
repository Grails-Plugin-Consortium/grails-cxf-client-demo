<html>
<head>
  <title>CXF CLIENT DEMO</title>
  <meta name="layout" content="main"/>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.15/jquery-ui.min.js"></script>
</head>

<body>
<table><tr><td width="50%">
  <table style="width:100%">
    <tr><td>
      <span style="font-weight: bold;">SERVICE SETTINGS</span><Br>
      <span style="font-weight: bold;">Simple Url:</span> ${grailsApplication.config.service.simple.url}<BR>
      <span style="font-weight: bold;">Complex Url:</span> ${grailsApplication.config.service.complex.url}
    </td></tr>
  </table>
  <br><br>
  <g:form action="simpleServiceDemo" controller="demo" name="simpleServiceDemo">
    <table style="width:100%">
      <tr><td colspan="2"><g:submitButton name="submitButton" value="Invoke Simple Service"/>&nbsp;&nbsp;<input type="button" style="background-color: #FCFCFC;border: 1px solid #CCCCCC; font: 11px verdana,arial,helvetica,sans-serif; margin: 2px 0; padding: 2px 4px;" value="Reset Form" onclick="document.location.href = '${createLink(controller:"demo", action:"index")}'"/></td>
    </table>
  </g:form>
  <br><br>
  <g:form action="complexServiceDemo" controller="demo" name="complexServiceDemo">
    <table style="width:100%">
      <tr><td colspan="2"><g:submitButton name="submitButton" value="Invoke Complex Service"/>&nbsp;&nbsp;<input type="button" style="background-color: #FCFCFC;border: 1px solid #CCCCCC; font: 11px verdana,arial,helvetica,sans-serif; margin: 2px 0; padding: 2px 4px;" value="Reset Form" onclick="document.location.href = '${createLink(controller:"demo", action:"index")}'"/></td>
    </table>
  </g:form>
</td>
  <td width="50%">
    <table style="width:100%">
      <tr><td>
        <span style="font-weight: bold;">Search Results</span><BR>
        <g:if test="${simpleRequest1}">
          <BR><BR>
          <span style="font-weight: bold;">Request 1 Name:</span> ${simpleRequest1?.name}<BR>
          <span style="font-weight: bold;">Request 1 Age:</span> ${simpleRequest1?.age}<BR>
          <span style="font-weight: bold;">Response 1 Is Old:</span> ${simpleResponse1?.isOld}<br>
          <span style="font-weight: bold;">Response 1 Status:</span> ${simpleResponse1?.status}<br>
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
      </td></tr></table>
  </td>
</tr></table>
</body>
</html>
