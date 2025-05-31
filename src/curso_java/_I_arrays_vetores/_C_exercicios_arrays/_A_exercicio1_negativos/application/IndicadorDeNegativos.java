package curso_java._I_arrays_vetores._C_exercicios_arrays._A_exercicio1_negativos.application;

import java.util.Scanner;

public class IndicadorDeNegativos {
    public static void main(String[] args) {

        /**
         * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N
         * números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os
         * números negativos lidos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas verificações gostaria de realizar? (máximo 10): ");
        int N = sc.nextInt();

        // Validação para limitar a 10
        do {
            if (N > 10 || N < 1) {
                System.out.println("Valor inválido. Digite um número entre 1 e 10.");
                System.out.println("Quantas verificações godtaria de realiza? (máximo 10): ");
                N = sc.nextInt();
            }
        } while (N > 10 || N < 1);

        int[] verificaveis = new int[N];

        System.out.println("Digite os " + N + " números inteiros para a verificação: ");
        for (int i = 0; i < verificaveis.length; i++) {
            verificaveis[i] = sc.nextInt();
        }

        System.out.println("Os números negativos informados foram: ");
        for (int i = 0; i < verificaveis.length; i++) {
            if (verificaveis[i] < 0) {
                System.out.println(verificaveis[i]);
            }
        }

        sc.close();
    }
}
