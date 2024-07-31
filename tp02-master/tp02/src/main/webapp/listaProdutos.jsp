<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard TagLib</title>
<style>
table {
	width: 100%;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid black;
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

.action-links a {
	margin-right: 10px;
}
</style>
</head>
<body>

	<a href="/tp02/novoProduto.jsp">
		<button type="button">Novo Produto</button>
	</a>
	<h2>Lista de produtos:</h2>
	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Descrição</th>
				<th>Quantidade Prevista (mês)</th>
				<th>Preço Máximo Comprado</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${produtos}" var="produto">
				<tr>
					<td>${produto.nome}</td>
					<td>${produto.descricao}</td>
					<td>${produto.qtPrevistoMes}</td>
					<td>${produto.precoMaxComprado}</td>
					<td class="action-links"><a
						href="/tp02/mostraProduto?id=${produto.id}">Editar</a> <a
						href="/tp02/removeProduto?id=${produto.id}">Remover</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
