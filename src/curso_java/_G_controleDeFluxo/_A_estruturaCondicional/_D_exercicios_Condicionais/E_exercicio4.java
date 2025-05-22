package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class E_exercicio4 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/02-exercicios2-estrutura-condicional.pdf
		/*
		 * 4) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
		 * do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Scanner sc = new Scanner(System.in);

		int duracao;

		System.out.println("=========================================");
		System.out.println("|=====          MULTIPLOS          =====|");
		System.out.println("|_______________________________________|");
		System.out.println();

		System.out.println("Digite a hora inicial da partida: ");
		int horaInicial = sc.nextInt();

		System.out.println("Digite a hora final da partida: ");
		int horaFinal = sc.nextInt();

		sc.close();

		if (horaFinal < horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println();
		System.out.println("A partida durou " + duracao + " hora(s).");

		System.out.println();
		System.out.println("=========================================");
		System.out.println("====     OBRIGADO POR PARTICIPAR!    ====");
		System.out.println("=========================================");

	}

}
