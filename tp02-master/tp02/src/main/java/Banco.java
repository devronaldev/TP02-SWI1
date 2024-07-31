/*
    Alisson de Sousa Vieira CB3020568
    Leonardo de Fontes Nunes CB3020567
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer sequencial = 1;

	static {

		Produto produto1 = new Produto();
		produto1.setId(sequencial++);
		produto1.setNome("MACARRÃO PENNE");
		produto1.setUnidadeCompra(2);
		produto1.setDescricao("Macarrão Penne 500g");
		produto1.setQtPrevistoMes(6);
		produto1.setPrecoMaxComprado(8.50);

		Produto produto2 = new Produto();
		produto2.setId(sequencial++);
		produto2.setNome("AZEITE DE OLIVA");
		produto2.setUnidadeCompra(1);
		produto2.setDescricao("Azeite de Oliva Extra Virgem 500ml");
		produto2.setQtPrevistoMes(3);
		produto2.setPrecoMaxComprado(25.00);

		lista.add(produto1);
		lista.add(produto2);

	}

	public void adiciona(Produto produto) {
		produto.setId(Banco.sequencial++);
		Banco.lista.add(produto);
	}

	public List<Produto> getProdutos() {

		return Banco.lista;
	}

	public void removeProduto(Integer id) {

		Iterator<Produto> it = lista.iterator();

		while (it.hasNext()) {
			Produto prod = it.next();

			if (prod.getId() == id) {

				it.remove();

			}

		}

	}

	public Produto findProduto(Integer id) {

		for (Produto produto : lista) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		return null;

	}

}