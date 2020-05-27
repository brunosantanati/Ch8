<%@ page import="me.bruno.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <%= request.getAttribute("pessoa") %> --%>

<% Pessoa p = (Pessoa) request.getAttribute("pessoa"); %>
Pessoa: <%= p.getNome() %>

<br>

Pessoa: <%= ((Pessoa) request.getAttribute("pessoa")).getNome() %>

</body>
</html>