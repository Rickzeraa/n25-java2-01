package br.com.senaisp.bauru.secao03.aula05;

public class Exemplo01 {

	public static void main(String[] args) {
		char letra = 65;
		System.out.println(letra);
		letra = 'A';
		System.out.println(letra);
		letra++; //passa para letra B
		System.out.println(letra);
		letra--; //volta para letra A
		System.out.println(letra);
		//cuidados ao imprimir mais de uma letra
		//o exemplo abaixo soma os valores, não concatena
		System.out.println(letra + letra);
		//nesse outro exemplo iremos concatenar
		System.out.println("" + letra + letra);
		
	}

}
