package estruturas.decisao;

import java.util.Locale;
import java.util.Scanner;

public class BalancoFinanceiro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Balanço Financeiro");
		System.out.println("------------------");
		
		System.out.print("Entre com o valor ganho no mês(em R$): ");
		double receita = sc.nextDouble();
		System.out.print("Entre com o valor total de despesas no mês(em R$): ");
		double despesas = sc.nextDouble();
		
		sc.close();

	}

}
