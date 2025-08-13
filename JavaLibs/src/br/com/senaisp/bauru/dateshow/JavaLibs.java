package br.com.senaisp.bauru.dateshow;

import javax.swing.JOptionPane;

public class JavaLibs {

	public static void main(String[] args) {
		String titulo, mensagem;
		titulo = "Bem-vindo, participante!";
		mensagem= "Olá, participante, e bem-vindo ao programa de namoro favorito da América! Antes de te enviarmos para um encontro, precisamos fazer 10 perguntas de compatibilidade amorosa. Tudo bem?";
		int resp = JOptionPane.showConfirmDialog(null,mensagem,titulo,JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if (resp == JOptionPane.YES_OPTION) {
			titulo = "Questão 1";
			mensagem= "Qual é seu nome?";
			String q01 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");

			titulo = "Questão 2";
			mensagem= "Complete esta frase: Minha ideia de uma noite romântica envolve ____________.";
			String q02 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");

			titulo = "Questão 3";
			mensagem= "Qual sua comida favorita?";
			String q03 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");

			titulo = "Questão 4";
			mensagem= "Nome de um animal.";
			String q04 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");

			titulo = "Questão 5";
			mensagem= "Qual a melhor palavra para descrever " + q04.toUpperCase() +" ?";
			String q05 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");

			titulo = "Questão 6";
			mensagem= "Nome de uma parte do corpo.";
			String q06 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");
			
			titulo = "Questão 7";
			mensagem= "Qual a melhor palavra para descrever " + q06.toUpperCase() +" ?";
			String q07 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");

			titulo = "Questão 8";
			mensagem= "Escolha um verbo no passado";
			String q08 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"String");
			int qi09 = 0;
			while (true) {
				titulo = "Questão 9";
				mensagem= "Quanto você pretende gastar em um jantar romântico?";
				String q09 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"Int");
				try {
					qi09 = Integer.parseInt(q09);
					break;
				} catch( Exception e) {
					titulo = "O que é um int?";
					mensagem= "Um int é um número inteiro entre -2^31 e 2^31-1.";
					JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.INFORMATION_MESSAGE,null);
				}
			}
			double qi10 = 0;
			while (true) {
				titulo = "Questão 10";
				mensagem= "Qual seu número favorito entre 0 e 1?";
				String q10 = (String) JOptionPane.showInputDialog(null,mensagem,titulo,JOptionPane.QUESTION_MESSAGE,null,null,"Double");
				try {
					qi10 = Double.parseDouble(q10);
					break;
				} catch( Exception e) {
					titulo = "O que é um double?";
					mensagem= "Um double é um número com precisão decimal, como 1,0, 0,4323 ou -3,14.";
					JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.INFORMATION_MESSAGE,null);
				}
			}
			//Resultados
			titulo = "Obrigado!";
			mensagem= "Obrigado, "+q01.toUpperCase()+". Aproveite seu encontro e conversaremos com você mais tarde no programa!";
			JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.INFORMATION_MESSAGE,null);

			titulo = "Bem-vindo de volta!";
			mensagem= "Bem-vindo de volta, "+q01.toUpperCase()+"! Diga-me, como você acha que foi seu encontro? É verdade que as pessoas geralmente ficam felizes depois de namorar você?";
			JOptionPane.showConfirmDialog(null,mensagem,titulo,JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			
			titulo = "Surpresa!";
			mensagem= "Seu par, Alex, está ouvindo nos bastidores e pode discordar de você. Senhoras e senhores, por favor, deem as boas-vindas ao Alex!";
			JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.WARNING_MESSAGE,null);

			titulo = "Uma Noite Romântica!";
			mensagem= "Tenho muito a te contar sobre meu encontro com "+q01.toUpperCase()+"! Primeiro, jantamos.\n"
					+ "Convenci "+q01.toUpperCase()+" de que deveríamos dividir o(a) "+q06.toUpperCase()+" "+q04.toUpperCase()+
					" assado(a).\n"+q01.toUpperCase()+" continuou falando sobre "+q02.toUpperCase()+" e o número "+
					qi10 +" ou algo assim.\nA refeição estava muito "+q07.toUpperCase()+" e eu insisti em deixar "
					+ "uma gorjeta de "+qi10+"!\n"+q01.toUpperCase()+" disse que era apenas "+(qi10/qi09*100)+"% de uma refeição de "+qi09+" Reais.\n\n"+
					"Terminamos a noite com um filme chamado \"Ataque do "+q03.toUpperCase()+"\".\nEu fiquei com o(a) "+q01.toUpperCase()+", e foi aí que eu "
					+ "realmente comecei a apreciar o quão "+q05.toUpperCase()+" o(a) "+q01.toUpperCase()+" era.\nEstou apaixonada(o) e quero que o(a) "
					+ q01.toUpperCase()+" se case comigo!";
			
			JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.WARNING_MESSAGE,null);
				
			
		} else {
			titulo = "Sem Problemas!";
			mensagem= "Que pena. Volte se mudar de ideia.";
			JOptionPane.showMessageDialog(null,mensagem,titulo,JOptionPane.ERROR_MESSAGE,null);
		}
	}

}
