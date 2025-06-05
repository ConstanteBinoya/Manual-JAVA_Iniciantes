package curso_java._I_arrays_vetores._C_exercicios_arrays._H_exercicios8_mediaPares.application;

import java.util.Locale;
import java.util.Scanner;

public class MediaDosPares {
    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar
         * na tela a média aritmética somente dos números pares lidos, com uma casa decimal.
         * Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int N = sc.nextInt();

        int[] numeros = new int[N];

        System.out.println("\nDigite " + N + " numeros inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int somaPares = 0;
        int contPares = 0;

        System.out.println("\nNumeros pares: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
                contPares++;

                // Truncando o número para 1 casa decimal sem arredondar
                // Exemplo: 12.96 vira 12.9 em vez de 13.0
                double numeroTruncado = Math.floor(numero * 10) / 10;
                System.out.printf("%.1f\n", numeroTruncado);
            }
        }

        if (contPares == 0) {
            System.out.println("NENHUM NUMERO É PAR!!!");
        } else {
            double mediaPares = (double) somaPares / contPares;
            System.out.printf("\nMÉDIA DOS PARES = %.1f", mediaPares);
        }

        sc.close();
    }
}
