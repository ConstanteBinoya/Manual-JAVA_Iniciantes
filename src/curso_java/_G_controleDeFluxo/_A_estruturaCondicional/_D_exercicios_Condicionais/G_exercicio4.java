package curso_java._G_controleDeFluxo._A_estruturaCondicional._D_exercicios_Condicionais;

import java.util.Scanner;

public class G_exercicio4 {

	public static void main(String[] args) {

		// ORIGEM:
		// src/docs/apoio/listaExercicios/03-estrutura-condicional-switch-ternario.pdf
		/*
		 * 4) Desconto no Produto: Se o preço for maior que R$100, aplique um desconto
		 * de 10%, senão, aplique 5%.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço da sua compra e descubra o seu desconto: ");
		Double preco = sc.nextDouble();
		sc.close();
		
		String desconto = (preco > 100) ? "10%" : "5%";
		
		System.out.println("Seu desconto será de " + desconto);

	}

}
