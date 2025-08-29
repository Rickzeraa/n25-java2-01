package br.com.senaisp.bauru.secao03.aula04;

public class Chickens02 {

	public static void main(String[] args) {
		double dailyAverage = 0, monthlyAverage = 0, monthlyProfit = 0;
		int totalEggs = 0;
		//1º dia
		totalEggs = 100;
		//2º dia
		totalEggs += 121;
		//3º dia
		totalEggs += 117;
		//fazendo as contas
		//Não pode ser feito operação entre inteiros nesse caso, se ocorrer
		//trunca (perde) as casas decimais, por isso dividimos por 3.0
		dailyAverage = totalEggs / 3.; 
		monthlyAverage = dailyAverage * 30;
		monthlyProfit = monthlyAverage * 0.18;
		//----
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
	}

}
