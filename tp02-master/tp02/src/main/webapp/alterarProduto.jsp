
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/tp02/alteraProduto" method="post">

		Nome: <input type="text" name="nome" value="${produto.nome}" /> <br>
		Unidade Compra: <input type="text" name="unidadeCompra"
			value="${produto.unidadeCompra}" /> <br> Descri��o: <input
			type="text" name="descricao" value="${produto.descricao}" /> <br>
		Quant. previsto M�s: <input type="text" name="qtPrevistoMes"
			value="${produto.qtPrevistoMes}" /> <br> Pre�o m�ximo comprado:
		<input type="text" name="precoMaxComprado"
			value="${produto.precoMaxComprado}" /> <br> <input
			type="hidden" name="id" value="${produto.id}"> <input
			type="submit" />
	</form>

</body>
</html>