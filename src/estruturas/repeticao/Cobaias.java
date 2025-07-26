package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Cobaias {

	/*
	 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
	 * precisa de sua ajuda para organizar os experimentos de um laboratório do qual
	 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
	 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
	 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
	 * coelhos. Para obter estas informações, ela sabe exatamente o número de
	 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
	 * de cobaias utilizadas em cada experimento. Faça um programa que leia um valor
	 * inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de
	 * teste contém um inteiro que representa a quantidade de cobaias utilizadas e
	 * uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo
	 * C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
	 * cobaia utilizada e o percentual de cada uma em relação ao total de cobaias
	 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
	 * o ponto.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Iniciando programa Cobaias...");
		System.out.println("-----------------------------");

		System.out.print("Quantos casos de testes serão digitados? ");
		int n = sc.nextInt();

		int cobaias = 0;
		int somaCobaias = 0;
		char tipoCobaias;
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			cobaias = sc.nextInt();
			somaCobaias += cobaias;
			System.out.print("Tipo de cobaias: ");
			tipoCobaias = sc.next().charAt(0);
			if (tipoCobaias == 'C') {
				coelhos += cobaias;
			} else if (tipoCobaias == 'R') {
				ratos += cobaias;
			} else if (tipoCobaias == 'S') {
				sapos += cobaias;
			}
		}

		System.out.println();
		System.out.println("RELATÓRIO FINAL");
		System.out.println("---------------");
		System.out.println("Total de cobaias = " + somaCobaias);
		System.out.println("Total de coelhos = " + coelhos);
		System.out.println("Total de ratos = " + ratos);
		System.out.println("Total de sapos = " + sapos);

		double percentualCoelhos = coelhos * 100 / somaCobaias;
		double percentualRatos = ratos * 100 / somaCobaias;
		double percentualSapos = sapos * 100 / somaCobaias;

		System.out.printf("Percentual de coelhos = %.2f%%%n", percentualCoelhos);
		System.out.printf("Percentual de ratos = %.2f%%%n", percentualRatos);
		System.out.printf("Percentual de sapos = %.2f%%%n", percentualSapos);

		sc.close();

	}

}
