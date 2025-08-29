package br.com.senaisp.bauru.secao06.aula12;

import java.util.Random;

public class TicTacToe {
	private char[] tab; //tabuleiro
	private String nomePlayer;
	private byte[] posDisp;
	private Random rnd;
	private String vencedor;
	//Constructor
	public TicTacToe() {
		tab = new char[9]; //criando o vetor de 9 posições
		rnd = new Random();
		posDisp = new byte[9];
		vencedor = "";
		//inicializar com indices disponíveis
		for(int i=0;i<9;i++) {
			posDisp[i]=(byte) i;
		}
	}
	public String getVencedor() {
		return vencedor;
	}
	public String getNomePlayer() {
		return nomePlayer;
	}
	public void setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
	}
	public void iniciarTabuleiro() {
		for(int i=0; i<9; i++) {
			tab[i] = '_';
		}
		tab[4] = 'X';
		atualizarPosLivre(4);
	}
	private void atualizarPosLivre(int i) {
		byte[] ap = posDisp; //guardo a referencia do vetor
		posDisp = new byte[ap.length - 1]; //crio um novo vetor
		for (int j=0,k=0;j<ap.length;j++) {
			if (ap[j]!=i) {
				posDisp[k++] = ap[j]; 
			}
		}
	}
	public void mostrarTabuleiro() {
		System.out.println(tab[0]+ " | " + tab[1]+ " | " + tab[2]);
		System.out.println(tab[3]+ " | " + tab[4]+ " | " + tab[5]);
		System.out.println(tab[6]+ " | " + tab[7]+ " | " + tab[8]);
		System.out.println();
	}
	public boolean estaDisponivel(int id) {
		for (int i=0;i<posDisp.length;i++) {
			if (posDisp[i]==id) {
				return true;
			}
		}
		return false;
	}
	public void lancarJogada(int id) {
		tab[id] = 'O';
		atualizarPosLivre(id);
		vencedor = "Sem Vencedor";
		if (ehFimJogo())
			vencedor = "Empate";
		if (posDisp.length>0 && ehFimJogo())
			vencedor = getNomePlayer();
		if (posDisp.length>0 && !ehFimJogo()) {
			int idx = rnd.nextInt(posDisp.length);
			tab[posDisp[idx]] = 'X';
			atualizarPosLivre(posDisp[idx]);
			if (posDisp.length>0 && ehFimJogo())
				vencedor = "Computador";
			if (posDisp.length==0 && ehFimJogo()) {
				vencedor = "Empate";
				//verificar se ocorreu uma trinca do computador
				//Verificando as linhas
				boolean teste =  tab[0]=='X' && tab[1]=='X' && tab[2]=='X';
				teste = teste || tab[3]=='X' && tab[4]=='X' && tab[5]=='X';
				teste = teste || tab[6]=='X' && tab[7]=='X' && tab[8]=='X';
				//verificando as colunas
				teste = teste || tab[0]=='X' && tab[3]=='X' && tab[6]=='X';
				teste = teste || tab[1]=='X' && tab[4]=='X' && tab[7]=='X';
				teste = teste || tab[2]=='X' && tab[5]=='X' && tab[8]=='X';
				//verificando as diagonais
				teste = teste || tab[0]=='X' && tab[4]=='X' && tab[8]=='X';
				teste = teste || tab[2]=='X' && tab[4]=='X' && tab[6]=='X';
				//Se teste for verdadeiro, então computador ganhou
				if (teste)
					vencedor = "Computador";
			}
		}
	}
	public boolean ehFimJogo() {
		boolean ret = posDisp.length == 0;
		//Testando fileiras para trinca
		ret = ret || (tab[0]!='_' && tab[0]==tab[1] && tab[1]==tab[2]);
		ret = ret || (tab[3]!='_' && tab[3]==tab[4] && tab[4]==tab[5]);
		ret = ret || (tab[6]!='_' && tab[6]==tab[7] && tab[7]==tab[8]);
		//Testando colunas para trinca
		ret = ret || (tab[0]!='_' && tab[0]==tab[3] && tab[3]==tab[6]);
		ret = ret || (tab[1]!='_' && tab[1]==tab[4] && tab[4]==tab[7]);
		ret = ret || (tab[2]!='_' && tab[2]==tab[5] && tab[5]==tab[8]);
		//Testando diagonais
		ret = ret || (tab[0]!='_' && tab[0]==tab[4] && tab[4]==tab[8]);
		ret = ret || (tab[2]!='_' && tab[2]==tab[4] && tab[4]==tab[6]);
		return ret;
	}
}
