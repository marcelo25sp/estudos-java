package estruturas.decisao;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	/*
	 * Fazer um programa para calcular o troco no processo de pagamento de um
	 * produto de uma mercearia. O programa deve ler o preço unitário do produto, a
	 * quantidade de unidades compradas deste produto, e o valor em dinheiro dado
	 * pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido ao
	 * cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma
	 * mensagem informando o valor restante
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Iniciando o programa Troco Verificado...");

		System.out.println();
		System.out.print("Preço unitário do produto: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		double valorRecebido = sc.nextDouble();
		
		double valorTotal = preco*quantidade;
		double troco = valorRecebido - valorTotal;

		sc.close();

	}

}
