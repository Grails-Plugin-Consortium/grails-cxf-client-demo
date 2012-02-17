<html>
<head>
  <title>CXF CLIENT DEMO</title>
  <meta name="layout" content="main"/>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.15/jquery-ui.min.js"></script>
</head>

<body>
<table><tr><td width="50%">
<g:jasperForm
        controller="service"
    action="customSecureServiceOutDemoJasper"
    jasper="sample-jasper-plugin" >
Invoke stock quote cxf client method with out interceptor and generate output. Click -><g:jasperButton format="pdf" jasper="jasper-test" text="PDF" class="buttons" />
</g:jasperForm>
&nbsp;
<p>
&nbsp;
<p>
&nbsp;
<g:jasperForm
        controller="service"
    action="stockQuoteDemoJasper"
    jasper="sample-jasper-plugin" >
Invoke stock quote cxf client method and generate output. Click -><g:jasperButton format="pdf" jasper="jasper-test" text="PDF" class="buttons" />
</g:jasperForm>
  </td>
  </tr>
  </table>
</body>
</html>