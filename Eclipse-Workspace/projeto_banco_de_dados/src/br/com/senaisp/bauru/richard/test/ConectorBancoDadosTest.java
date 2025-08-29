package br.com.senaisp.bauru.richard.test;

import java.sql.SQLException;

import br.com.senaisp.bauru.richard.classes.ConectorBancoDados;

public class ConectorBancoDadosTest {

	public static void main(String[] args) {

		try {
			ConectorBancoDados conn = ConectorBancoDados.getInstancia();
			System.out.println(conn.getConnStr());

			ConectorBancoDados conn2 = ConectorBancoDados.getInstancia();
			System.out.println(conn2.getConnStr());
			
			System.out.println(conn);
			System.out.println(conn2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
