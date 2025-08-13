package br.com.senaisp.bauru.dateshow;

import javax.swing.JOptionPane;

public class DateShow {

	public static void main(String[] args) {
		int ret = JOptionPane.showConfirmDialog(null, "Olá, participante, e bem-vindo ao programa de namoro favorito da América! Antes de te enviarmos para um encontro, precisamos fazer 10 perguntas de compatibilidade amorosa. Tudo bem?", 
									"Bem-vindo, participante!", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if (ret == JOptionPane.YES_OPTION) {
			String qt01 =(String) JOptionPane.showInputDialog(null,"Qual o seu nome?", "Questão 1",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt02 =(String) JOptionPane.showInputDialog(null,"Complete esta frase: Minha ideia de uma noite romântica envolve__________________.", "Questão 2",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt03 =(String) JOptionPane.showInputDialog(null,"Qual sua comida favorita?", "Questão 3",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt04 =(String) JOptionPane.showInputDialog(null,"Nome de um animal.", "Questão 4",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt05 =(String) JOptionPane.showInputDialog(null,"Qual a melhora palavra para descrever o(a)"+qt04+".", "Questão 5",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt06 =(String) JOptionPane.showInputDialog(null,"Nome de uma parte do corpo.", "Questão 6",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt07 =(String) JOptionPane.showInputDialog(null,"Qual a melhora palavra para descrever o(a)"+qt06+".", "Questão 7",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt08 =(String) JOptionPane.showInputDialog(null,"Escolha um verbo no passado.", "Questão 8",JOptionPane.QUESTION_MESSAGE,null,null,"String");
			String qt09 =(String) JOptionPane.showInputDialog(null,"Quanto você gastaria em um jantar romântico?", "Questão 9",JOptionPane.QUESTION_MESSAGE,null,null,"Int");
			String qt10 =(String) JOptionPane.showInputDialog(null,"Qual seu número favorito entre 0 e 1?", "Questão 10",JOptionPane.QUESTION_MESSAGE,null,null,"Double");
			//Obrigado!! - Obrigado, STRING. Aproveite seu encontro e conversaremos com você mais tarde no programa!
			//Bem-vindo de volta! - Bem-vindo de volta, STRING! Diga-me, como você acha que foi seu encontro? É verdade que as pessoas geralmente ficam felizes depois de namorar você?
		} else
			JOptionPane.showMessageDialog(null, 
					"Que pena. Volte se mudar de ideia.", 
					"Não está certo", JOptionPane.ERROR_MESSAGE);
	}

}
