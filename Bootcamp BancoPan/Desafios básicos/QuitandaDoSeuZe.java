package aplicacao;

import java.util.Scanner;

public class QuitandaDoSeuZe {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int morangos = input.nextInt();
		int macas = input.nextInt();

		// TODO: Implemente as condições necessárias para retornar o preço a ser pago
		// pelo cliente, conforme a tabela de preços do seu Zé:

		System.out.println(pagamento(morangos, macas));
	
	}
	
	public static double pagamento(int morangos, int macas) {
		double valorTotal = 0;
		int kilos = morangos + macas;
		
		if (morangos <= 5 && macas <= 5 && kilos < 8) {
			double valorMo = morangos * 2.50;
			double valorMa = macas * 1.80;
			valorTotal = valorMo + valorMa;
			return(valorTotal);
		}

		if (kilos > 8 || valorTotal > 25) {
			double valorMo = morangos * 2.50;
			double valorMa = macas * 1.80;

			valorTotal = valorMo + valorMa;
			valorTotal = valorTotal - (valorTotal * 0.10);
			return(valorTotal);
		}
		
		if (kilos <= 8) {
			if (morangos > 5 && macas > 5) {
				double valorMo = morangos * 2.20;
				double valorMa = macas * 1.50;
				
				valorTotal = valorMo + valorMa;
				return(valorTotal);
			}
		}
		
		return valorTotal;
	}
}
