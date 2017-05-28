<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mostra parametri</title>
</head>
<body>
	<h1>Dati inseriti nella form</h1>
	<ul>
		<li>Nome: <b> <% out.println(session.getAttribute("nome")); %></b></li>
		<li>Matricola: <b> <% out.println(session.getAttribute("matricola")); %></b></li>
	</ul>
</body>
</html>