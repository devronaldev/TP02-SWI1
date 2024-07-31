
/*
    Ronald Pereira Evangelista CB3020282
    Vinicius Oliveira Rodrigues CBXXXXXX
*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraProdutoServlet
 */
@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlteraProdutoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int paramId = Integer.parseInt(request.getParameter("id"));
		String paramNomeProduto = request.getParameter("nome");
		int paramUnidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
		String paramDescricao = request.getParameter("descricao");
		int paramQtPrevistoMes = Integer.parseInt(request.getParameter("qtPrevistoMes"));
		double paramPrecoMaxComprado = Double.parseDouble(request.getParameter("precoMaxComprado"));

		Banco banco = new Banco();
		Produto produto = banco.findProduto(paramId);
		produto.setNome(paramNomeProduto);
		produto.setUnidadeCompra(paramUnidadeCompra);
		produto.setDescricao(paramDescricao);
		produto.setQtPrevistoMes(paramQtPrevistoMes);
		produto.setPrecoMaxComprado(paramPrecoMaxComprado);

		response.sendRedirect("listaProdutos");
	}

}
