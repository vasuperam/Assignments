<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title> Student Details</title>

</head>


<body>
	<h2>Student Details</h2>	
	<table>
		<tr>
			<td>FirstName </td><td></td><td>LastName</td><td></td><td>EmpId</td><td></td>
		</tr>
		
			<tr>
			<td>${student.firstName}</td><td></td>
			<td>${student.lastName}</td><td></td>
			<td>${student.empId}</td>
	
			</tr>
		
	</table>
	
</body>
</html>
