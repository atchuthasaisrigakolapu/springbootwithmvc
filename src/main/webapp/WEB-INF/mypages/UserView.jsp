
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
</head>
<body>
<font color = "green">${msg}</font>
<form:form action = "user" method = "post" modelAttribute = "user">
Name: <form:input  path="uname"/><br/>
Email: <form:input  path="email"/><br/>
PhoneNo: <form:input  path="phno"/><br/>
<input type = "submit" value = "submit"/>
</form:form>
</body>
</html