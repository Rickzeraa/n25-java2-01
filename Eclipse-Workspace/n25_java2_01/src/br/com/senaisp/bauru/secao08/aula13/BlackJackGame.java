package br.com.senaisp.bauru.secao08.aula13;

import java.util.ArrayList;

public class BlackJackGame {
	private Baralho bar;
	private ArrayList<BlackJackPlayer> players;
	private boolean fimJogo;
	private int turnoPlayer;
	//Constructor
	public BlackJackGame() {
		bar = new Baralho();
		players = new ArrayList<BlackJackPlayer>();
		fimJogo = false;
		turnoPlayer = 1;
		//Criando o player Banca
		BlackJackPlayer banca = new BlackJackPlayer();
		banca.setNome("Banca");
		//adicionando a banca na lista de players
		players.add(banca);
		//Sortear 2 cartas para a banca
		banca.getCartas().add(bar.sortearCarta());
		banca.getCartas().add(bar.sortearCarta());
		banca.setParou(true);
	}
	public ArrayList<BlackJackPlayer> getPlayers() {
		return players;
	}
	public boolean isFimJogo() {
		return fimJogo;
	}
	public int getTurnoPlayer() {
		return turnoPlayer;
	}
	public void setTurnoPlayer(int turnoPlayer) {
		this.turnoPlayer = turnoPlayer;
	}
	public void solicitarCarta(int play) {
		if (play < players.size()) {
			players.get(play).getCartas().add(bar.sortearCarta());
			//Checando se há vencedor
			verificarFimJogo();
		}
	}
	public void solicitarParada(int play) {
		if (play < players.size()) {
			players.get(play).setParou(true);
			//Checando se há vencedor
			verificarFimJogo();
		}
	}
	private void verificarFimJogo() {
		boolean haVencedor = false;
		boolean todosPararam = true;
		int maiorCarta = 0;
		for (BlackJackPlayer pl : players) {
			if (pl.getTotalCarta()==21) {
				pl.setGanhador(true);
				haVencedor = true;
			} else if (pl.getTotalCarta()>21) {
				pl.setPerdedor(true);
			}
			//Verificando se todos pararam
			todosPararam = todosPararam && ( pl.isParou() || pl.isPerdedor() );
			//Determinar quem é maior carta abaixo de 21
			if (pl.getTotalCarta()<21 && pl.getTotalCarta()>maiorCarta) {
				maiorCarta = pl.getTotalCarta();
			}
		}

		if (todosPararam || haVencedor)
			fimJogo = true;
		//Setar os vencedores se não tiver 21 e todos pararam
		if (todosPararam && !haVencedor) {
			for (BlackJackPlayer pl : players) {
				if (pl.getTotalCarta()==maiorCarta) {
					pl.setGanhador(true);
				} else {
					pl.setPerdedor(true);
				}
			}
		}
	}
}
