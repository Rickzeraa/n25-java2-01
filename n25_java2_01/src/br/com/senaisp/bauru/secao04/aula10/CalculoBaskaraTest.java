package br.com.senaisp.bauru.secao04.aula10;

import java.util.Scanner;

public class CalculoBaskaraTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoBaskara ca = new CalculoBaskara();
		
		System.out.println("Digite o lado A: ");
		ca.setLadoA(sc.nextDouble());

		System.out.println("Digite o lado B: ");
		ca.setLadoB(sc.nextDouble());

		System.out.println("Digite o lado C: ");
		ca.setLadoC(sc.nextDouble());
		//calcular delta
		ca.calcularDelta();
		//mostrando x1 e x2
		System.out.println("O valor de x1 = " + ca.getX1());
		System.out.println("O valor de x2 = " + ca.getX2());
		//Fechando scanner
		sc.close();
	}

}
