package curso_java._E_exercicios_ABCD;

import java.util.Locale;
import java.util.Scanner;

public class Ex6_ABC {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios1-estrutura-sequencial.pdf
		/*
		 * 5) Fazer um programa para ler o código , a quantidade, o
		 * valor unitário de dois produtos distintos e em seguida calcular e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total1;
		double total2;
		double somaTotal;

		System.out.println("==============================================");
		System.out.println("======       CARRINHO de COMPRAS        ======");
		System.out.println("==============================================");
		System.out.println();
		
		System.out.println("Digite o código do produto 01: ");
		String codigo1 = sc.next();
		System.out.println();

		System.out.println("Digite a quantidade de unidades do produto 01: ");
		int unidades1 = sc.nextInt();
		System.out.println();

		System.out.println("Digite o valor unitário do produto 01: ");
		double valorUn1 = sc.nextDouble();
		System.out.println();
		
		total1 = valorUn1 * unidades1;
		
		System.out.println("Digite o código do produto 02: ");
		String codigo2 = sc.next();
		System.out.println();

		System.out.println("Digite a quantidade de unidades do produto 02: ");
		int unidades2 = sc.nextInt();
		System.out.println();

		System.out.println("Digite o valor unitário do produto 02: ");
		double valorUn2 = sc.nextDouble();
		System.out.println();
		sc.close();
		
		total2 = valorUn2 * unidades2;
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$          PRODUTO 01          $$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		System.out.println("Código: " + codigo1 + ";");
		System.out.println("Quantidade: " + unidades1 + ";");
		System.out.println("Preço unitário: R$" + valorUn1 + ";");
		System.out.println("Custo total: R$" + total1 + ".");
		System.out.println("____________________________________");
		System.out.println();
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$          PRODUTO 02          $$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		System.out.println("Código: " + codigo2 + ";");
		System.out.println("Quantidade: " + unidades2 + ";");
		System.out.println("Preço unitário: R$" + valorUn2 + ";");
		System.out.println("Custo total: R$" + total2 + ".");
		System.out.println("____________________________________");
		System.out.println();
		
		somaTotal = total1 + total2;

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$         TOTAL A PAGAR        $$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		System.out.println("R$" + somaTotal);
		System.out.println("____________________________________");
		System.out.println();
		
		System.out.println("==============================================");
		System.out.println("======     OBRIGADO POR PARTICIPAR!     ======");
		System.out.println("==============================================");
		
		
	}

}
