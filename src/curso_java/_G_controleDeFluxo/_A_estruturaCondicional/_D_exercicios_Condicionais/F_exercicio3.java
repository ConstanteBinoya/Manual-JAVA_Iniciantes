package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio3 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 3) Mês do Ano: O usuário informa um número de 1 a 12, e o programa exibe o
		 * nome do mês correspondente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite um número de 1 a 12: ");
		int mes = sc.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Feveiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Opção inválida!");		
		}
		
		System.out.println();
		System.out.println("Obrigado por participar!");
		
		sc.close();

	}

}
