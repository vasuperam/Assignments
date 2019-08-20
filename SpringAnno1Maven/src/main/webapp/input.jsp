<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title> Login Form</title>
</head>
<body>
	<form action="calculator/mul">
		<div align="center">
			<table>
				<tr>
					<td>Input value1</td>
					<td><input type="text" name="value1" /></td>
				</tr>
				<tr>
					<td>Input Value2</td>
					<td><input type="text" name="value2" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>


		</div>
	</form>
</body>
</html>