package curso_java._J_arrays_vetores._B_arrays_exemplo2.application;

import curso_java._J_arrays_vetores._B_arrays_exemplo2.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        /**
         *  Fazer um programa para ler um número inteiro N e os dados (nome e preço)
         *  de N Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o
         *  preço médio dos produtos.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos que deseja cadastrar: ");
        int N = sc.nextInt();

        Produto[] produtos = new Produto[N];

        System.out.println("Digite nome e preço dos " + N + " produtos a cadastrar: ");
        for (int i = 0; i < produtos.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        double soma = 0.0;

        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }

        double media = soma / produtos.length;

        System.out.printf("O preço médio dos produtos cadastrados é %.2f%n", media);

        sc.close();
    }
}
