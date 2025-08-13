package br.com.senaisp.bauru.secao04.aula08;

import javax.swing.JOptionPane;

public class NameMaker {

	public static void main(String[] args) {
		//Solicitar o nome, nome do meio e sobrenome separadamente
		//Mostrar o nome completo ao término
		//pode usar o Scanner ou JoptionPane para solicitar ao usuário
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String nomeMeio = JOptionPane.showInputDialog("Agora nome do meio: ");
		String sobrenome = JOptionPane.showInputDialog("Agora sobrenome: ");
		String nomeCompleto = nome + " " + nomeMeio + " " + sobrenome;
		JOptionPane.showMessageDialog(null, "Seu nome completo é " + nomeCompleto);
	}

}
