<%@ page import="java.util.ArrayList"%>
<%@ page import="com.jee.classes.Produit" %>
<%@ page import="com.jee.classes.Operation" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulter Produit</title>
</head>
<body>
<h1>Listes des produits</h1>
<table border="1" cellpadding="5" cellspacing="0">
<tr>
<th>id_produit</th>
<th>reference_produit</th>
<th>designation_produit</th>
<th colspan="2">opération</th>
</tr>
   <%
    ArrayList<Produit> list=new ArrayList();  
    Operation op=new Operation();
    list=op.getAll();
    for(Produit p : list)
    {
    %>
    <tr>
   <td><%=p.getId()%></td>
   <td><%=p.getReference()%></td>
   <td><%=p.getDesignation()%></td>
   
   <td>
   <form action="modifier" method="get">
   <input type="hidden" name="id" value="<%=p.getId() %>">
   <input type="submit" name="submit" value="Modifier">
   </form>
   </td>
   <td>
   <form action="supprimer" method="get">
   <input type="hidden" name="id" value="<%=p.getId() %>">
   <input type="submit" name="submit" value="Supprimer">
   </form>
   
   </td>
   
   </tr>
   <%
   } %> 
  
</table>
</body>
</html>