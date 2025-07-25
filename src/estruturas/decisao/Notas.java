package estruturas.decisao;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota do usuário: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota do usuário: ");
		double nota2 = sc.nextDouble();

		sc.close();

	}

}
