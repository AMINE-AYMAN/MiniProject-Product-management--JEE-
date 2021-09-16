<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Modification</title>
</head>
<body>
<% String id=(String) request.getAttribute("id"); %>
<h1>Modifier Produit</h1>
<form action="modifier" method=get>
<table>
<tr>
<td> <input type="text" name="id" value="<%=id %>"> </td>
</tr>
<tr>
<td> <input type="text" name="reference" placeholder="reference"> </td>
</tr>
<tr>
<td> <input type="text" name="designation" placeholder="designation"> </td>
</tr>
<tr>
<td> <input type="submit" name="submit" value="Modifier"> </td>
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