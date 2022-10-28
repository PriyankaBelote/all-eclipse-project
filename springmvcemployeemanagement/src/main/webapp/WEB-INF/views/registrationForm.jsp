<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String msg = (String) request.getAttribute("msg");
String errMsg = (String) request.getAttribute("errMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h1 style="color: green"><%=msg%></h1>
	<%
	}
	%>

	<%
	if (errMsg != null && !errMsg.isEmpty()) {
	%>
	<h1 style="color: red"><%=errMsg%></h1>
	<%
	}
	%>
	<fieldset>
		<legend>Employee Registration Form</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td><label>Enter Employee Name:</label></td>
					<td><input type="text" name="empName"></td>
				</tr>

				<tr>
					<td><label>Enter Employee ID</label></td>
					<td><input type="text" name="empId"></td>
				</tr>

				<tr>
					<td><label>Enter Employee Email ID</label></td>
					<td><input type="email" name="empEmail"></td>
				</tr>

				<tr>
					<td><label>Enter Employee Password</label></td>
					<td><input type="password" name="empPassword"></td>
				</tr>
			</table>
			<input type="submit" value="Register">
			<input type="reset"  value="Reset">
		</form>



	</fieldset>

	<a href="./login"> already have ACCount. login..</a>
</body>
</html>