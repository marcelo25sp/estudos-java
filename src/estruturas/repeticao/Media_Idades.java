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
		while(idade >= 0) {
			idade = sc.nextDouble();
		}

		sc.close();

	}

}
