<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="p" class="me.bruno.model.Pessoa">
	<jsp:setProperty name="p" property="*" />
</jsp:useBean>

<jsp:getProperty name="p" property="nome" />
<jsp:getProperty name="p" property="idade" />

</body>
</html>