package curso_java._E_exercicios_ABCD;

import java.util.Locale;
import java.util.Scanner;

public class Ex5_ABC {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios1-estrutura-sequencial.pdf
		/*
		 * 4) Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double salario;
		
		System.out.println("==============================================");
		System.out.println("======     REGISTRO DE FUNCIONÁRIOS     ======");
		System.out.println("==============================================");
		System.out.println();
		
		System.out.println("Digite seu código interno: ");
	    String codigo = sc.next(); // No futuro opte por String para códigos que não serão calculados.
	    System.out.println();
	    System.out.println("Digite suas horas trabalhadas: ");
	    double horas = sc.nextDouble();
	    System.out.println();
	    System.out.println("Digite o valor da sua hora de trabalho: ");
	    double valorHora = sc.nextDouble();
	    System.out.println();
	    sc.close();
	    
	    salario = valorHora * horas;
	    
	    System.out.println("======================================================");
	    System.out.println("Seu código de inscrição é: " + codigo + ";");
	    System.out.println();
	    System.out.println("Você recebe: R$ " + valorHora + " por hora trabalhada;");
	    System.out.println();
	    System.out.printf("E seu salário por produção será de: R$%.2f%n", salario);
	    System.out.println();
	    
		System.out.println("======================================================");
		System.out.println("======         OBRIGADO POR PARTICIPAR!         ======");
		System.out.println("======================================================");
		
	}

}
