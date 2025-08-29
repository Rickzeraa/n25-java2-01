package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, 
				"Olá, participante, e bem vindo "
				+ "ao programa "
				+ "de namoro favorito da América!", 
				"Bem-vindo, participante!", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
		String questao01 = (String)JOptionPane.showInputDialog(null,
                "Qual é seu nome?",
                "Questão 1",
                JOptionPane.QUESTION_MESSAGE, //tipo de mensagem
                null,//Ícone
                null,//Opções de escolha
                "String"); //opção default
		//Solicitar para o usuário
		//Seu time favorito
		//Deve selecionar de uma lista de times
		//Essa lista deve ter pelo menos 5 nomes
		//Sugestão: Corinthians, São Paulo, Santos,
		//Noroeste, Palmeiras, Vasco, ...
		String[] opcoes = {"Corinthians","São Paulo","Palmeiras","Santos","Vasco"};
		String questao02 = (String)JOptionPane.showInputDialog(null,
				"Qual é seu time favorito?",
				"Questão 2",
				JOptionPane.QUESTION_MESSAGE, //tipo de mensagem
				null,//Ícone
				opcoes,//Opções de escolha
				opcoes[0]); //opção default
	}

}
