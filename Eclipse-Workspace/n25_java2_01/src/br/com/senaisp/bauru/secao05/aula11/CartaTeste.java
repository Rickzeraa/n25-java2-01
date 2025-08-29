package br.com.senaisp.bauru.secao05.aula11;

import java.util.Random;
import java.util.Scanner;

public class CartaTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		Carta ct = null;
		Random rnd = new Random(1L);
		do {
			System.out.println("Menu");
			System.out.println("1 - Escolher a carta");
			System.out.println("2 - Sortear uma carta");
			System.out.println("3 - Sair");
			System.out.println("Digite a opção: ");
			op = sc.nextInt();
			switch(op) {
			case 1: 
				System.out.println("Digite o naipe (1-4): ");
				int np = sc.nextInt();
				
				System.out.println("Digite o número (1-13): ");
				int nm = sc.nextInt();
				
				ct = new Carta(np-1, nm-1); break;
				
			case 2: ct = new Carta(rnd.nextInt(4),rnd.nextInt(13)); break;
			case 3: System.out.println("Bye!!"); break;
			default: System.out.println("Opção Inválida!");
			}
			if (op==1 || op==2) System.out.println(ct);
			System.out.println("=*".repeat(20));
		}while (op!=3);
		sc.close();
	}

}
