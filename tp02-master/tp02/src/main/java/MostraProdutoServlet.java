/*
    Alisson de Sousa Vieira CB3020568
    Leonardo de Fontes Nunes CB3020567
*/

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraProdutoServlet
 */
@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MostraProdutoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();

		Produto produto = banco.findProduto(id);

		System.out.println(produto.getNome());

		request.setAttribute("produto", produto);

		RequestDispatcher rd = request.getRequestDispatcher("/alterarProduto.jsp");
		rd.forward(request, response);

	}

}
