package br.com.senaisp.bauru.richard.test;

import java.sql.SQLException;
import java.util.List;

import br.com.senaisp.bauru.richard.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		try {
			Produto prd = Produto.create("Produto xpto", 5.0, 15.20);
			System.out.println("Produto " + prd.getId());
			//Listando os produtos
			List<Produto> lista = Produto.listarProdutos();
			for (Produto prod: lista) {
				System.out.println(prod.getDescricao() + " - " + prod.getId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
