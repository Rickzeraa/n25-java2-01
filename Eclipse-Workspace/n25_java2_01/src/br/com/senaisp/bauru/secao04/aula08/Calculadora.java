package br.com.senaisp.bauru.secao04.aula08;

public class Calculadora {
	//Propriedades - Campos
	private double imposto;
	private double comissao;
	private double grandeTotal;
	//Constructor
	public Calculadora() {
		imposto = 5;
		comissao = 15;
		grandeTotal = 0;
	}
	//Comportamentos - Getters e Setters
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getGrandeTotal() {
		return grandeTotal;
	}
	private void addGrandeTotal(double valor) {
		this.grandeTotal += valor;
	}
	public void zerarGrandeTotal() {
		this.grandeTotal = 0;
	}
	public double calcularTotal(String nome, 
			double valorGasto) {
		double ret = Math.round(
				valorGasto * (
				1 + getImposto() / 100 + 
				getComissao() / 100)*100)/100.;
		addGrandeTotal(ret); //Adicionando o valor ao total
		System.out.println(nome + ": R$ " + ret);
		return ret;
	}
	public double dividirValor(int qtdPagantes) {
		double ret = 0;
		if (qtdPagantes>0) {
			ret = Math.round(getGrandeTotal() / 
				    qtdPagantes * 100) / 100.0;
		}
		return ret;
	}
}
