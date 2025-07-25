package estruturas.decisao;

import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cálculadora de IMC");
		System.out.println("-------------------");

		System.out.print("Entre com o peso(Kg) do usuário: ");
		double peso = sc.nextDouble();
		System.out.print("Entre com a altura do usuário: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);
		System.out.printf("IMC = %.2f%n", imc);

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
