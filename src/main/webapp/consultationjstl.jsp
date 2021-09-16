<%@ page import="java.util.ArrayList"%>
<%@ page import="com.jee.classes.Produit" %>
<%@ page import="com.jee.classes.Operation" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulter Produit</title>
</head>
<body>

<form action="jstltraitement" method="post">
<table>
<tr>
<td><input type="text" name="id"></td>
<td><input type="submit" value="Rechercher"></td>
</tr>
</table>
</form>
<h1>Listes des produits</h1>
<table border="1" cellpadding="5" cellspacing="0">
<tr>
<th>id_produit</th>
<th>reference_produit</th>
<th>designation_produit</th>
<th colspan="2">Action</th>
</tr>
    <c:forEach items="${requestScope.produits }" var="i" >
    <tr>
   <td><c:out value="${i.id }" /></td>
   <td><c:out value="${i.reference }" /></td>
   <td><c:out value="${i.designation }" /></td>
   <td><input type="submit" value="Modifier" ></td>
   <td><input type="submit" value="Supprimer" ></td>
   </tr>
   </c:forEach>
  
</table>
</body>
</html>