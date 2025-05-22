package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio6 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 6) Aprovação em uma disciplina: Se a nota for maior ou igual a 7, exibe
		 * "Aprovado", caso contrário, "Reprovado".
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite su nota e descubra se foi aprovado!");
		Double nota = sc.nextDouble();
		sc.close();
		
		String resultado = (nota >= 7) ? "Aprovado!" : "Reprovado!";
		
		System.out.println(resultado);

	}

}
