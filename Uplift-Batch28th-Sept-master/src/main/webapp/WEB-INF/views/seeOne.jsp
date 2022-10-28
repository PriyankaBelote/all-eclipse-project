<%@page import="com.te.empmanagementsystem.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%Employee employee=(Employee)request.getAttribute("name");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="text" name="empId" value="<%=employee.getEmpId()%>">
<input type="text" name="empName" value="<%=employee.getEmpName()%>">
<input type="text" name="emailId" value="<%=employee.getEmailId()%>">
</body>
</html>