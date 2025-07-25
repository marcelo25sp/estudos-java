package estruturas.decisao;

import java.util.Locale;
import java.util.Scanner;

public class Imc {

	/*
	 * Desafio IMC (Índice de Massa Corporal) Faça um programa que leia o peso (em
	 * kg) e a altura (em metros) de uma pessoa, calcule o IMC e mostre uma mensagem
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // o método Locale sendo usado para garantir o ponto como separador decimal
		Scanner sc = new Scanner(System.in); 

		System.out.println("Cálculadora de IMC");
		System.out.println("-------------------");

		// entrada de dados
		System.out.print("Entre com o peso(Kg) do usuário: ");
		double peso = sc.nextDouble();
		System.out.print("Entre com a altura (em metros) do usuário: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);
		System.out.printf("IMC = %.2f%n", imc);

		// implementando a estrutura condicional e exibindo a mensagem ao usuário
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideai");
		} else if (imc < 25.0) {
			System.out.println("Peso ideal");
		} else if (imc < 30.0) {
			System.out.println("Sobrepeso");
		} else if (imc < 40.0) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Obesidade grave");
		}

		sc.close();

	}

}
