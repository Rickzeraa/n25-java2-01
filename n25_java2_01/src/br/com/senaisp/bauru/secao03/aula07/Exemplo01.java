package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 valores: ");
		int vlr01 = sc.nextInt();
		int vlr02 = sc.nextInt();
		int vlr03 = sc.nextInt();
		int soma = vlr01 + vlr02 + vlr03;
		System.out.println("Soma dos 3 valores é: " + soma);
		sc.close();
	}

}
