package br.com.senaisp.bauru.secao08.aula13;

import java.util.Random;

import br.com.senaisp.bauru.secao05.aula11.Carta;

public class Baralho {
	private Carta[] cartas;
	private Random rnd;
	private byte[] disponiveis;
	//Constructor
	public Baralho() {
		cartas = new Carta[Carta.NAIPES.length * Carta.NUMEROS.length];
		rnd = new Random();
		disponiveis = new byte[cartas.length];
		//Criando as cartas
		for (int i=0; i<cartas.length; i++) {
			cartas[i] = new Carta( i / 13, i % 13);
			//guardando os índices disponíveis
			disponiveis[i] = (byte) i;
		}
	}
	public Carta sortearCarta() {
		Carta ret = null;
		if (disponiveis.length>0) {
			int idx = rnd.nextInt(disponiveis.length);
			ret = cartas[disponiveis[idx]];
			atualizarDisponiveis(idx);
		}
		return ret;
	}
	private void atualizarDisponiveis(int idx) {
		byte[] apoio = disponiveis; //copiando o endereço do vetor
		disponiveis = new byte[apoio.length - 1]; //diminuo 1
		for(int i=0, j=0; i<apoio.length; i++) {
			if (i!=idx) {
				disponiveis[j++] = apoio[i];
			}
		}
	}
}
