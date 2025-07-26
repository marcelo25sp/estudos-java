package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Atletas...");
		System.out.println("-------------------");

		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		
		double somaPeso = 0;
		double maiorAltura = 0.0;
		String maiorAtleta = null;
		
		for (int i = 0; i < n; i++) {
			sc.nextLine(); //limpando o buffer
			System.out.println("Digite os dados do atleta número " + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Sexo: ");
			char genero = sc.next().charAt(0);
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			if(altura > maiorAltura) {
				maiorAltura = altura;
				maiorAtleta = nome;
			}
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			somaPeso += peso;			
		}
		
		double mediaPeso = somaPeso/n;
		System.out.printf("Peso médio dos atletas = %.2f kg%n", mediaPeso);
		
		System.out.println("Maior atleta: " + maiorAtleta);

		sc.close();

	}

}
