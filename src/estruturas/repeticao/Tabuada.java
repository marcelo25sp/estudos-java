package estruturas.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	/*
	 * Programa "tabuada"...
	 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 0 a 10.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Tabuada...");
		System.out.println("--------------------");

		System.out.print("Deseja calcular qual valor da tabuada? ");
		int n = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (i * n));
		}

		sc.close();

	}

}
