package br.com.senaisp.bauru.secao04.aula09;

import java.util.Scanner;

public class ForcaTeste {

	public static void main(String[] args) {
		Forca fo = new Forca();
		Scanner sc = new Scanner(System.in);
		//System.out.println(fo);
		do {
			System.out.println(fo);
			System.out.println("Digite uma letra: ");
			//
			char letra=sc.nextLine().charAt(0);
			fo.lancarLetra(letra);
		} while(!fo.ehFimDeJogo());
		sc.close();
		if (fo.getErros()>=6) {
			System.out.println("Você foi enforcado! :-(");
		} else {
			System.out.println("Você Venceu! :-)");
		}
		System.out.println("A palavra foi " + fo.getPalavraRevelada());
	}

}
