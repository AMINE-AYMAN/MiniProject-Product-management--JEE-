<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
</head>
<body>
<% if(session.getAttribute("Nom")==null)
	{
	request.getRequestDispatcher("/login.jsp");
	}
%>
<h2>Bienvenue  <c:out value="${sessionScope.Nom }"/></h2>
<c:url value="Consultation.jsp" var="consulter_link"></c:url>
<c:url value="Ajouter.jsp" var="ajoute_link"></c:url>
<c:url value="Chercher.jsp" var="search_link"></c:url>
<c:url value="Logout.jsp" var="logout_link"></c:url>
<a href="${consulter_link }">Consulter</a>&nbsp;&nbsp;
<a href="${ajoute_link }">Ajouter</a>&nbsp;&nbsp;
<a href="${search_link }">Chercher</a>&nbsp;&nbsp;
<a href="${logout_link }">Deconnexion</a>
</body>
</html>