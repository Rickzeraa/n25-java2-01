package br.com.senaisp.bauru.secao08.aula13;

import br.com.senaisp.bauru.secao05.aula11.Carta;

public class BaralhoTest {

	public static void main(String[] args) {
		//Criando o Baralho
		Baralho br = new Baralho();
		Carta ct = null;
		do {
			ct = br.sortearCarta();
			if (ct!=null) {
				System.out.println(ct);
			}
		}while(ct!=null);
	}

}
