<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="navbar.jsp"%>

<%
String empId = (String) request.getAttribute("empEmpId");
%>
<%
String empName = (String) request.getAttribute("empEmpName");
%>
<%
String empEmail = (String) request.getAttribute("empEmailId");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
	<form action="./update1" method="post">
		<table>
			<tr>
				<td><label>Update Employee ID:</label></td>
				<td><input type="text" value="<%=empId%>" disabled="disabled"
					name="empId"></td>
			</tr>
			<tr>
				<td><label>Update Employee Name:</label></td>
				<td><input type="text" name="empName" value="<%=empName%>" ></td>
			</tr>
			<tr>
				<td><label>Update email address :</label></td>
				<td><input type="email" name="emailId" value="<%=empEmail%>" ></td>
			</tr>
			<tr>
				<td><label>Update your password:</label></td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input type="submit" value="Update">
	</form>
</body>
</html>