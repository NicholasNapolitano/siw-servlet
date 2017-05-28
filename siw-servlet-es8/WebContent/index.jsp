<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import = "it.uniroma3.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserimento Studente</title>
</head>
<body>
<% Studente stud = (Studente) request.getAttribute("studente"); %>
<form method="get" action="processaDati">
	<p>Matricola <input type="text" name="matricola" maxlength="6"
	value="${matricola}" />
	${errMatricola}</p>
	<p> 
	Nome <input type="text" name="nome" size="9" maxlength="32"
	value="${nome}" />
	${errName} 
	</p>
	<input type="reset" value="Reimposta" />
	<input type="submit" name="inviaDati" value="Invia" />
</form>

</body>
</html>