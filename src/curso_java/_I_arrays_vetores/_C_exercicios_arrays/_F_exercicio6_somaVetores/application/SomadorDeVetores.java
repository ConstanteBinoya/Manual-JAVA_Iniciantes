package curso_java._I_arrays_vetores._C_exercicios_arrays._F_exercicio6_somaVetores.application;

import java.util.Scanner;

public class SomadorDeVetores {
    public static void main(String[] args) {

        /**
         * Faça um programa para ler dois vetores A e B, contendo N elementos cada.
         * Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
         * elementos correspondentes de A e B. Imprima o vetor C gerado.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos que cada vetor [A e B] terão: ");
        int N = sc.nextInt();

        int[] vectA = new int[N];
        int[] vectB = new int[N];
        int[] vectC = new int[N];

        System.out.println("\nDigite " + N + " numeros para o vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("\nDigite " + N + " numeros para o vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("\nResultado da soma dos vetores: ");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println("\nA + B na posição " + i + " = " + vectC[i]);
        }

        sc.close();
    }
}
