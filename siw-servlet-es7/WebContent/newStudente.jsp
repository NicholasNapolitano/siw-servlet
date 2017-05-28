<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci studente</title>
</head>
<body>
    <h1>Dati inseriti nella form</h1>
    <ul>
        <li>Codice Fiscale: <b> <% out.println(session.getAttribute("codice_fiscale")); %>      </b></li>
        <li>Password: <b> <% out.println(session.getAttribute("password")); %>              </b></li>
        <li>Linguaggi di Programmazione: <b> <% out.println(session.getAttribute("linguaggio")); %></b></li>
        <li>Corso di Studi: <b> <% out.println(session.getAttribute("corso")); %>          </b></li>
		<li>Esame: <b> <% out.println(session.getAttribute("esame")); %>                   </b></li>
		<li>Commento: <b> <% out.println(session.getAttribute("message")); %>                </b></li>
    </ul>
</body>
</html>