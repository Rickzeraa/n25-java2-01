package br.com.senaisp.bauru.richard.classes;

public class ConectorBancoDados {
	private static ConectorBancoDados instancia = null;
	private String connStr;
	private ConectorBancoDados() {
		connStr = "Sou a string de conexão";
	}
	//Isso é chamado pattern Singleton
	public static ConectorBancoDados getInstancia() {
		if (instancia == null) {
			instancia =  new ConectorBancoDados();
		}
		return instancia;
	}
	public String getConnStr() {
		return connStr;
	}
}
