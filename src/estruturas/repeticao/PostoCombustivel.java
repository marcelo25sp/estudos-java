package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class PostoCombustivel {

	/*
	 * Um posto de combustíveis deseja determinar qual de seus produtos tem a
	 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
	 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
	 * será encerrado quando o código informado for o número 4, devendo então
	 * mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada
	 * combustível. 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Posto de Combustível...");
		System.out.println("--------------------------------");

		// variáveis que serão utilizadas na contagem de cada combustível
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = 0;

		while (codigo != 4) { // estrutura para parar o programa quando o usuário digitar (4) conforme o
								// enunciado
			System.out.print("Informe um código(1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			// estrutura que faz a contagem de cada combustível
			if (codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gasolina++;
			} else if (codigo == 3) {
				diesel++;
			}
		}

		System.out.println();
		System.out.println("Muito obrigado!");
		System.out.println("---------------");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();   

	}

}
