package br.com.senaisp.bauru.secao04.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(OrdemTexto.class
				.getResourceAsStream("palavras.txt"));
		//Definindo variáveis de trabalho
		String maiorTexto, menorTexto;
		//Setando o maior e menor com o primeiro texto
		maiorTexto = sc.nextLine();
		menorTexto = maiorTexto; //Igualando os endereços para o mesmo conteúd
		//Vamos usar o while (já viu no Java1)
		while (sc.hasNextLine()){
			String apoio = sc.nextLine();
			//Comparando os textos - menor
			if (apoio.compareTo(menorTexto)<0) {
				menorTexto = "" + apoio;
			}
			//Comparando os textos - maior
			if (apoio.compareTo(maiorTexto)>0) {
				maiorTexto = "" + apoio;
			}
		}
		System.out.println("Maior texto foi " + maiorTexto);
		System.out.println("Menor texto foi " + menorTexto);
		//fechando o arquivo
		sc.close();
	}

}
