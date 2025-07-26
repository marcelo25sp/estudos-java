package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	/*
	 *  Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os
	 * dados de N atletas (nome, sexo, altura, peso). Depois, mostrar um relatório
	 * contendo:  Peso médio dos atletas  Nome do atleta mais alto  Porcentagem
	 * de homens  Altura média das mulheres Caso não sejam digitadas mulheres, a
	 * altura média não poderá ser calculada (pois divisão por zero não existe).
	 * Neste caso, apenas mostrar a mensagem "Não há mulheres cadastradas".
	 *  Fazer validações de dados para altura e peso, não permitindo digitar valores não
	 * positivos para esses dados. Faça também a validação do sexo, não permitindo
	 * valores diferentes de F e M. Dica: para validar o sexo, a lógica é: tem que
	 * pedir para o usuário digitar novamente enquanto o valor digitado for
	 * diferente de "F" E diferente de "M".
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // define o ponto como separador decimal
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Atletas...");
		System.out.println("-------------------");

		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();

		// variáveis para calculos e verificadas
		double somaPeso = 0;
		double maiorAltura = 0.0;
		String maiorAtleta = null;
		int contadorHomens = 0;
		int contadorMulheres = 0;
		double somaAltura = 0.0;

		// loop principal para ler dados de cada atleta
		for (int i = 0; i < n; i++) {
			sc.nextLine(); // limpando o buffer antes de ler o nome,(evita pular linha)

			System.out.println("Digite os dados do atleta número " + (i + 1) + ":");

			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sexo: ");
			char genero = sc.next().charAt(0);

			// validação do genero (garante que será digitado 'M' ou 'F'
			while (genero != 'M' && genero != 'F') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				genero = sc.next().charAt(0);
			}
			if (genero == 'M') {
				contadorHomens++;
			}

			// validação da altura (garante que será digitado um valor positivo)
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			while (altura <= 0.0) {
				System.out.print("Valor inválido! Digite um valor positivo: ");
				altura = sc.nextDouble();
			}

			// verifica se é a maior altura registrada e armazena na variável
			if (altura > maiorAltura) {
				maiorAltura = altura;
				maiorAtleta = nome;
			}

			// conta e soma a altura das mulheres para o cálculo posterior da média
			if (genero == 'F') {
				contadorMulheres++;
				somaAltura += altura;
			}

			// validação do peso (garante que será digitado um valor positivo)
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			while (peso <= 0.0) {
				System.out.print("Valor inválido! Digite um valor positivo: ");
				peso = sc.nextDouble();
			}
			somaPeso += peso;
		}

		// imprime o relatório final
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("----------");

		double mediaPeso = somaPeso / n;
		System.out.printf("Peso médio dos atletas = %.2f kg%n", mediaPeso);

		System.out.println("Maior atleta: " + maiorAtleta);

		double percentualHomens = (double) contadorHomens * 100 / n;
		System.out.printf("Percentual de homens: %.2f%%%n", percentualHomens);

		double alturaMediaMulheres = (double) somaAltura / contadorMulheres;
		if (contadorMulheres > 0) {
			System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
		} else {
			System.out.println("Não há mulheres cadastradas!");
		}

		sc.close();

	}

}
