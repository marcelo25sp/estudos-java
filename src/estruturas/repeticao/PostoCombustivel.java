package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Posto de Combustível...");
		System.out.println("--------------------------------");

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = 0;

		while (codigo != 4) {
			System.out.print("Informe um código(1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
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
