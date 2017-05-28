<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import = "it.uniroma3.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mostra parametri</title>
</head>
<body>
<% Studente stud = (Studente) request.getAttribute("studente"); %>
	<h1>Dati inseriti nella form</h1>
	<ul>
		<li>Nome: <b> <%= stud.getNome() %></b></li>
		<li>Matricola: <b> <%= stud.getMatricola() %></b></li>
	</ul>
</body>
</html>