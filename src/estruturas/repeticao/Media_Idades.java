package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Media_Idades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cálculo da média das idades");
		System.out.println("---------------------------");

		System.out.println("Digite as idades:");
		double idade = sc.nextDouble();
		int contador = 0;
		double soma = 0;
		if (idade < 0) {
			System.out.println("Impossível calcular!");
		} else {
			while (idade >= 0) {
				soma += idade;
				contador++;
				idade = sc.nextDouble();
			}
			double media = (double) soma / contador;
			System.out.printf("Média das idades = %.2f%n", media);
		}

		sc.close();

	}

}
