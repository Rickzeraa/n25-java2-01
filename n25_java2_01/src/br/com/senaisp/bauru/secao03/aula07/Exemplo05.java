package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exemplo05.class
				.getResourceAsStream("cadastros.csv"));
		//Trocando o token do scanner
		sc.useDelimiter(",");
		//Imprimir o cabeçalho
		for(int i=0;i<4;i++) {
			//cuidado que é print e não println
			System.out.print(sc.next().replace("\"", "") + "\t");
		}
		System.out.println(); //pulando a linha
		while(sc.hasNext()) {
			System.out.print(Integer.parseInt(sc.next().replace("\r\n","")));
			System.out.print("\t"+sc.next().replace("\"", ""));//nome
			System.out.print("\t"+sc.nextInt()); //idade
			System.out.println("\t"+sc.next().replace("\"", ""));//cidade
		}
		sc.close();
	}

}
