package curso_java._G_controleDeFluxo._A_estruturaCondicional._C_Ternaria;

import java.util.Scanner;

public class A_estruturaCondicionalTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//String resultado;
		
		System.out.println("=======================================");
		System.out.println("===   VERIFICADOR DE PAR OU ÍMPAR   ===");
		System.out.println("=======================================");
		System.out.println();
		
		System.out.println("Digite um número INTEIRO:");
		int numero = sc.nextInt();
		System.out.println();
		
		/*
		if (numero % 2 == 0) {
			resultado = "Par";
		}
		else {
			resultado = "Ímpar";
		}
		*/
		
		String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
		
		System.out.println("=======================================");
		System.out.println(numero + " é um número " + resultado + "." );
		System.out.println("=======================================");
		
		sc.close();

	}

}
