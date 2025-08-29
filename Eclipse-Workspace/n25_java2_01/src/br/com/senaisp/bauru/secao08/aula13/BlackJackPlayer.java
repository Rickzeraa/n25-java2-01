package br.com.senaisp.bauru.secao08.aula13;

import java.util.ArrayList;

import br.com.senaisp.bauru.secao05.aula11.Carta;

public class BlackJackPlayer {
	private String nome;
	private ArrayList<Carta> cartas;
	private boolean perdedor;
	private boolean ganhador;
	private boolean parou;
	//Constructor
	public BlackJackPlayer() {
		cartas = new ArrayList<Carta>();
		perdedor = false;
		ganhador = false;
		parou = false;
		nome = "Sem nome";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isPerdedor() {
		return perdedor;
	}
	public void setPerdedor(boolean perdedor) {
		this.perdedor = perdedor;
	}
	public boolean isGanhador() {
		return ganhador;
	}
	public void setGanhador(boolean ganhador) {
		this.ganhador = ganhador;
	}
	public boolean isParou() {
		return parou;
	}
	public void setParou(boolean parou) {
		this.parou = parou;
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public int getTotalCarta() {
		int tot = 0;
		for(Carta ct : cartas) {
			tot += ct.getValor();
		}
		return tot;
	}
}
