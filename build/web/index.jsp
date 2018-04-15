<%-- 
    Document   : index
    Created on : 13-abr-2018, 21:41:18
    Author     : ingarukal11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicacion de Validaciones con Struts</title>
    </head>
    <body>
        <h1>Validaciones</h1>
        <s:form action="procesa" method="post">
            <s:textfield label="nombre" name="nombre" size="20"></s:textfield>
            <s:textfield label="edad" name="edad" size="2"></s:textfield>
            <s:submit label="Procesar" value="Procesar"></s:submit>
        </s:form>
    </body>
</html>
