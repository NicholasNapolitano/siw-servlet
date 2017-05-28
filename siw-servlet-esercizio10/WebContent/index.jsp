<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<link href="stile-prodotto.css" rel="stylesheet" type="text/css" name="stile-prodotto.css">
	<title>Nuovo Prodotto</title>
</head>
<body>
	<form action="prodotto" method="post">
	<h1>Inserisci Prodotto</h1>
	<div>Nome*: <input type="text" name="nome" value="${prodotto.nome}"/> ${errNome} </div>
	<div>Descrizione*: <input type="text" name="descrizione" value="${prodotto.descrizione}"/> ${errDescrizione} </div>
	<div>Prezzo*: <input type="text" name="prezzo" value="${prodotto.prezzo}"/> ${errPrezzo} </div>
	<div>Data scadenza*: <input type="text" name="dataScadenza" value="${prodotto.dataScadenza}" placeholder="es. 01/01/2001"/> ${errDataScadenza} </div>
	<div>
	*Campo obbligatorio
	</div>
		<input type="submit" name="sumbit" value="invia"/>
	</form>
	<a href="prodotto">Lista Prodotti</a>
</body>
</html>
