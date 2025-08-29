package br.com.senaisp.bauru.secao08.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite o valor de a: ");
			int a = sc.nextInt();

			System.out.println("Digite o valor de b: ");
			int b = sc.nextInt();

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro de divisão por zero!");

		} catch (InputMismatchException e) {
			System.out.println("O valor deve ser inteiro!");
		} catch (Exception e) { //Erro genérico
			System.out.println("Ocorreu um erro diferente:" + 
					e.getMessage());
		}
		System.out.println("Se não der erro eu apareço!!");
		dividirValores(10, 0);
		System.out.println("Não chego aqui");
	}
	
	public static void dividirValores(int a, int b) {
		if (b==0) {
			throw new RuntimeException("O valor de B deve ser"
					+ " maior ou menor que zero!");
		}
		System.out.println(a/b);
	}
}
