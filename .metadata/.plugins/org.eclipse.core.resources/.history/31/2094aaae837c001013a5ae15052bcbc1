package br.com.senaisp.bauru.secao06.aula12;

import java.util.Scanner;

public class TicTacTest {

	public static void main(String[] args) {
		TicTacToe tc = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		tc.iniciarTabuleiro();
		do {
			tc.mostrarTabuleiro();
			System.out.println("Digite a casa desejada (1-9: ");
			int casa = sc.nextInt();
			if (casa>=1 && casa<=9 && tc.estaDisponivel(casa-1)) {
				tc.lancarJogada(casa-1);
			}
	}while(!tc.ehFimJogo());
		tc.mostrarTabuleiro();
		sc.close();
  }
}