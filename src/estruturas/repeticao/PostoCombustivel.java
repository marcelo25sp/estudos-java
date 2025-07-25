package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Posto de Combustível...");
		System.out.println("--------------------------------");
		
		int codigo = 0;
		while(codigo != 4) {
			System.out.print("Informe um código(1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
		}

		sc.close();

	}

}
