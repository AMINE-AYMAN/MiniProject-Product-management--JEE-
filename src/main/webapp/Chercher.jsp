<%@page import="java.util.ArrayList"%>
<%@page import="com.jee.classes.Operation" %>
<%@page import="com.jee.classes.Produit" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chercher Produit</title>
</head>
<body>
<form action="produit" method="post">
<table>
<tr>
<td> <input type="text" name="id"></td>
<td> <input type="submit" name=" submit" value="Rechercher" > </td>
</tr>
</table>
</form>
<br>
<table border="1" cellpadding="5" cellspacing="0">
<tr>
<th>id_produit</th>
<th>reference_produit</th>
<th>designation_produit</th>
</tr>
<% 
String id=(String) request.getAttribute("id");
ArrayList<Produit> list =new ArrayList();
Operation newop=new Operation();
if(id!=null){

list=newop.getById(Integer.parseInt(id));
}


for(Produit p:list){%>
<tr>
<td><%=p.getId() %></td>
<td><%=p.getReference() %></td>
<td><%=p.getDesignation() %></td>
</tr>
<%} %>
</table>
<b style="color:red;">
<%
String message = (String) request.getAttribute("message");
if(message!=null)
{
	out.print(message);
}
%>
</b>
</body>
</html>


