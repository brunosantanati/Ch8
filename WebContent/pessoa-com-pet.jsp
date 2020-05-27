<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Nome pessoa: ${pessoaComPet.nome}
Idade pessoa: ${pessoaComPet.idade}
Nome cachorro: ${pessoaComPet.cachorro.nome}

Nome pessoa: ${pessoaComPet["nome"]}
vide game: ${pessoaComPet.videoGames[0]}
vide game: ${pessoaComPet.videoGames[1]}
vide game: ${pessoaComPet.videoGames[2]}
</body>
</html>