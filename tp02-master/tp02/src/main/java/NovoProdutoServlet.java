/*
    Ronald Pereira Evangelista CB3020282
    Vinicius Oliveira Rodrigues CBXXXXXXX
*/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoProdutoServlet
 */
@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NovoProdutoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeProduto = request.getParameter("nome");
		int unidadeCompra = Integer.parseInt(request.getParameter("unidadeCompra"));
		String descricao = request.getParameter("descricao");
		int qtPrevistoMes = Integer.parseInt(request.getParameter("qtPrevistoMes"));
		double precoMaxComprado = Double.parseDouble(request.getParameter("precoMaxComprado"));

		Produto produto = new Produto();
		produto.setNome(nomeProduto);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setDescricao(descricao);
		produto.setQtPrevistoMes(qtPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);

		Banco banco = new Banco();
		banco.adiciona(produto);

		request.setAttribute("produto", produto.getNome());
		response.sendRedirect("listaProdutos");

	}

}
