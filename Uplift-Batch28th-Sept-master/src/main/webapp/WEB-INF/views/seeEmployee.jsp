<%@page import="java.util.List"%>
<%@page import="com.te.empmanagementsystem.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
List<Employee> listEmp = (List<Employee>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	for (Employee employee : listEmp) {
	%>
	<br>
	<%=employee.getEmpId()%>
	<br>
	<%=employee.getEmpName()%>
	<br>
	<%=employee.getEmailId()%>
	<br>
	<%
	}
	%>

</body>
</html>