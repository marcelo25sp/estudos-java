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

		sc.close();

	}

}
