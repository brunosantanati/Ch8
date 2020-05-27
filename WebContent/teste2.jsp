<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="pessoa" class="me.bruno.model.Pessoa" scope="request" />
Pessoa: <jsp:getProperty name="pessoa" property="nome" />
<jsp:setProperty property="nome" name="pessoa" value="Fred" />
Pessoa: <jsp:getProperty name="pessoa" property="nome" />

</body>
</html>