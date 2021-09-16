<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter Produit</title>
</head>
<body>
<h1>Ajouter Produit</h1>
<form action="produit" method="post">
<table>
<tr>
<td> <input type="text" name="reference" placeholder="reference"> </td>
</tr>
<tr>
<td> <input type="text" name="designation" placeholder="designation"> </td>
</tr>
<tr>
<td> <input type="submit" name="submit" value="Ajouter"> </td>
</tr>
</table>
</form>
<b style="color:red;">
<%
  String message= (String) request.getAttribute("message");
  
  if(message != null){
	  out.print(message);
  }

%>
</body>
</html>