<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<link href="stile-prodotto.css" rel="stylesheet" type="text/css" name="stile-prodotto.css">
<title>Lista Prodotti</title>
</head>
<body>
    <h1>Catalogo Prodotti:</h1>
	<ul>
		<c:forEach var="prodotto" items="${prodotti}">
			<li><a href="prodotto?id=${prodotto.id}"> ${prodotto.nome} </a></li>
       <!-- <li><a href="prodotto?delete=${prodotto.id}">CancellaGET</a></li> -->
			<form action="prodotto" method="post">
			 	<input type="hidden" value="${prodotto.id}" name="id"/>
			 	<input type="submit" value="cancella" name="cancellaPOST"/>   <!-- CancellaPOST -->
			</form>
		</c:forEach>
	</ul>
</body>
</html>