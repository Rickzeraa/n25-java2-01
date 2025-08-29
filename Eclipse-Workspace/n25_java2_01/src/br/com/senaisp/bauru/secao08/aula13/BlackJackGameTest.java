package br.com.senaisp.bauru.secao08.aula13;

import java.util.Scanner;

import br.com.senaisp.bauru.secao05.aula11.Carta;

public class BlackJackGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BlackJackGame gam = new BlackJackGame();
		String nomeJogador;
		do {
			System.out.println("Digite o nome do player (sair p/terminar):");
			nomeJogador = sc.nextLine();
			if (!nomeJogador.toLowerCase().equals("sair")) {
				BlackJackPlayer pla = new BlackJackPlayer();
				pla.setNome(nomeJogador);
				gam.getPlayers().add(pla); //adicionando ao jogo
				//Lançando 2 cartas para o player
				gam.solicitarCarta(gam.getPlayers().size()-1);
				gam.solicitarCarta(gam.getPlayers().size()-1);
			}
		} while (!nomeJogador.equals("sair") && 
				 gam.getPlayers().size()<9);
		//Aqui começa o jogo....
		//mostrando as cartas de todos
		do {
			for(BlackJackPlayer pl : gam.getPlayers()) {
				System.out.println("Cartas do(a) " + pl.getNome());
				for (Carta ct : pl.getCartas()) {
					System.out.println(ct); //Imprimindo a carta do player
				}
			}
			//Rodada de players
			System.out.println("=".repeat(50));
			for (int i=1; i<gam.getPlayers().size(); i++) {
				BlackJackPlayer pl = gam.getPlayers().get(i);
				if (!pl.isParou() && !pl.isPerdedor()) {
					System.out.println("Vez do player " + pl.getNome());
					for (Carta ct : pl.getCartas()) {
						System.out.println(ct);
					}
					System.out.println("Seu total de cartas é " + pl.getTotalCarta());
					do { // <---- novo
						System.out.println("Deseja mais uma carta? (S/N): ");
						String resp = sc.nextLine().substring(0,1).toUpperCase();
						
						if (resp.equals("S")) {
							gam.solicitarCarta(i);
							break; //<--- novo
						} //if se quer solicitar cartas
						
						if (resp.equals("N")) {
							gam.solicitarParada(i);
							break; //<--- novo
						} //if se quer solicitar parada
						
					} while(true); //<--- novo
				} //If parou ou perdeu
			} //For dos Players para solicitar e mostrar as cartas
		} while (!gam.isFimJogo());
		//Mostrar os resultados
		System.out.println("=".repeat(50));
		System.out.println("Resultados");
		System.out.println("=".repeat(50));
		for (BlackJackPlayer pl : gam.getPlayers()) {
			System.out.println("Player " + pl.getNome() + 
							   (pl.isGanhador() ? " é um ganhador" : " perdeu") + 
							   " com a pontuação: " + pl.getTotalCarta()
							   );
		}
		sc.close();
	}
}
