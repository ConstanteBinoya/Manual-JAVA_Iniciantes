package curso_java._I_arrays_vetores._C_exercicios_arrays._B_exercicio2_somaVetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Somador {
    public static void main(String[] args) {

        /**
         * Faça um programa que leia N números reais e armazene-os em um vetor.
         * Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a
         * soma e a média dos elementos do vetor
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números para a soma: ");
        int N = sc.nextInt();

        int[] numeros = new int[N];

        // Populando o array:
        System.out.println("Digite os " + N + " números para a soma: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        // Mostrando os elementos do array:
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Númerona posição: " + i + ": " + numeros[i]);
        }

        double soma = 0;
        for (int i = 0; i< numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println();
        System.out.println("O somatório dos números digitados é: " + soma);

        double media = soma / N;
        System.out.println();
        System.out.printf("A média dos números digitados é: %.2f ", media);

        sc.close();
    }
}
