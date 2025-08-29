package br.com.senaisp.bauru.secao05.aula11;

public class Carta {
	public static final String[] NAIPES = { "♦", "♠", "♥", "♣" };
	public static final String[] NUMEROS = {"A","2","3","4","5",
										   "6","7","8","9","10",
										   "J","Q","K"};
	//Campos
	private String naipe;
	private String numero;
	private int valor;
	//Constructor
	public Carta(int np, int num) {
		setNaipe(np);
		setNumero(num);
		        // operador ternário
				// teste lógico ? se verdade : se falso
		setValor( num + 1 > 10 ? 10 : num + 1 );
	}
	public String getNaipe() {
		return naipe;
	}
	public String getNumero() {
		return numero;
	}
	public int getValor() {
		return valor;
	}
	private void setNaipe(int naipe) {
		if (naipe<0 || naipe>3) {
			System.out.println("Naipe inválido!");
		} else {
			this.naipe = NAIPES[naipe];
		}
	}
	private void setNumero(int numero) {
		if ( numero < 0 || numero > 12 ) {
			System.out.println("Número de carta inválido!");
		} else {
			this.numero = NUMEROS[numero];
		}
	}
	private void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		            //1234567 ┌─┐│└┘
		String ret = "┌─────┐\n" + //1
		             "│##   │\n" + //2
		             "│  *  │\n" + //3
		             "│   ##│\n" + //4
		             "└─────┘";    //5
		String spc = getNumero().equals("10") ? "" : " ";
		ret = ret.replaceFirst("##", getNumero() + spc);
		ret = ret.replace("*", getNaipe());
		ret = ret.replaceFirst("##", spc + getNumero());
		
		return ret;
	}
}
