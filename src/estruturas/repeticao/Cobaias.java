package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Cobaias {

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

		sc.close();

	}

}
