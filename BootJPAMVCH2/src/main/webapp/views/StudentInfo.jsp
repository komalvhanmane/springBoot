<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentInfo</title>
</head>
<body>
	<h1>Student Information</h1>
	<table>
		<tr>
			<td>Student ID ::</td>
			<td>${obj.id}</td>
		</tr>
		<tr>
			<td>Student First Name ::</td>
			<td>${obj.fname}</td>
		</tr>
		<tr>
			<td>Student Last Name ::</td>
			<td>${obj.lname}</td>
		</tr>
		<tr>
			<td>Student Status ::</td>
			<td>${obj.status}</td>
		</tr>
	</table>
</body>
</html>