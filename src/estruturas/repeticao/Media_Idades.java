package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Media_Idades {

	/*
	 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
	 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
	 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
	 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
	 * mensagem "Impossível calcular."
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cálculo da média das idades");
		System.out.println("---------------------------");

		// entrada de dados
		System.out.println("Digite as idades:");
		double idade = sc.nextDouble();

		// as variaveis contador e soma serão utilizadas para o cálculo da média
		int contador = 0;
		double soma = 0;

		/*
		 * Esse bloco abaixo garante a mensagem de erro que caso o usuário digite um
		 * número negativo na primeira vez. As variáveis soma e contador serão
		 * utilizadas para o cálculo posterior da média das idades.
		 */
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
