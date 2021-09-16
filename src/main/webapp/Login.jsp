<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Page login</h1>
<form action="loginservlet" method="post">
<table>
<tr><td><input type="text" name="username"></td></tr>

<tr><td><input type="text" name="password"></td></tr> 
<tr> <td><input type="submit" name="submit" value="Login"></td>
</tr>
</table>
</form>

</body>
</html>