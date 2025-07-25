package estruturas.decisao;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
	
	/* Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
	uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
	ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
	mensagem "REPROVADO" */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota do usuário: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota do usuário: ");
		double nota2 = sc.nextDouble();

		double notaFinal = nota1 + nota2;
		System.out.printf("Nota Final = %.1f%n", notaFinal);

		if (notaFinal < 60.0) {
			System.out.println("Reprovado!");
		}

		sc.close();

	}

}
