package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class F_exercicio8 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 8) Código de Produto: O usuário informa um código numérico, e o programa
		 * retorna o nome do produto correspondente.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println("===    PESQUISE SEU PRODUTO AQUI   ===");
		System.out.println("======================================");
		System.out.println();
		System.out.println("Informe o código numérico do produto de 1 a 10:");
		int codigo = sc.nextInt();
		System.out.println();
		
		switch (codigo) {
		case 1:
			System.out.println("DragonBall-Z.");
			break;
		case 2:
			System.out.println("Yu-Gi-Oh!");
			break;
		case 3:
			System.out.println("Yu-yu-hakusho.");
			break;	
		case 4:
			System.out.println("Os Herculóides.");
			break;
		case 5:
			System.out.println("SiverHawks.");
			break;	
		case 6:
			System.out.println("Cavalo de Fogo.");
			break;	
		case 7:
			System.out.println("Corrida Maluca.");
			break;	
		case 8:
			System.out.println("Street Figthers-II [VICTORY].");
			break;
		case 9:
			System.out.println("Black Kame-Raider.");
			break;	
		case 10:
			System.out.println("Emanuelle.");
			break;	
		default:
			System.out.println("Opção inválida!");		
		}
		
		System.out.println();
		System.out.println("Obrigado por Participar!");
		
		sc.close();

	}

}
