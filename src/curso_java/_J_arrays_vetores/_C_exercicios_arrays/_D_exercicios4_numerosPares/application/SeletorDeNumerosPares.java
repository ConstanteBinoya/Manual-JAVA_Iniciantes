package curso_java._J_arrays_vetores._C_exercicios_arrays._D_exercicios4_numerosPares.application;

import java.util.Locale;
import java.util.Scanner;

public class SeletorDeNumerosPares {
    public static void main(String[] args) {

        /**
         * Faça um programa que leia N números inteiros e armazene-os em um vetor.
         * Em seguida, mostre na tela todos os números pares, e também a quantidade
         * de números pares.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja analisar: ");
        int N = sc.nextInt();

        int[] numeros = new int[N];

        // FOR TRADICIONAL: útil quando preciso do índice (posição no vetor)
        System.out.println("Digite " + N + " números para a verificação: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int contador = 0;

        System.out.println("Números pares: ");

        // ENTENDENDO O FOR-EACH:
        /*
        (int numero : numeros) o que este trecho diz é o seguinte:
        Para cada elemento do array "numeros", armazene o valor na variável temporária
        "numero" e execute o bloco de código dentro das chaves {}.

        Esse tipo de loop é útil quando você quer percorrer todos os elementos de forma
        simples, sem precisar do índice (como no for tradicional).
         */
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                contador++;
            }
        }

        System.out.println("\nTotalizando " + contador + " números pares.");

        sc.close();
    }
}
