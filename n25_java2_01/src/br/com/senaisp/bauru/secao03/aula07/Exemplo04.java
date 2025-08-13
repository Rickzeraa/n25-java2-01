package br.com.senaisp.bauru.secao03.aula07;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exemplo04.class
				.getResourceAsStream("teste_arquivo.txt"))
				.useLocale(Locale.US); //indicando que será usado o padrão americano
		/*
		while (sc.hasNext()) {
			String linha = sc.next();
			System.out.println(linha);
		}
		*/
		System.out.println(sc.nextLine()); //primeira linha
		
		System.out.println(sc.nextInt()); //segunda linha primeira parte
		System.out.println(sc.nextInt()); //segunda linha segunda parte
		System.out.println(sc.nextInt()); //segunda linha terceira parte

		System.out.println(sc.nextDouble()); //terceira linha primeira parte
		System.out.println(sc.nextDouble()); //terceira linha segunda parte
		System.out.println(sc.nextDouble()); //terceira linha terceira parte
		sc.nextLine(); //por conta do nextDouble
		System.out.println(sc.nextLine()); //ultima linha
		
		sc.close();
	}

}
