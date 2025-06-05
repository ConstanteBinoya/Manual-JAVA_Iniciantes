package curso_java._I_arrays_vetores._C_exercicios_arrays._E_exercicio5_maiorPosicao.application;

import java.util.Locale;
import java.util.Scanner;

public class SeletorDeMaiorValor {
    public static void main(String[] args) {

        /**
         * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
         * mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também
         * a posição do maior elemento, considerando a primeira posição como 0 (zero).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números para a verificação: ");
        int N = sc.nextInt();

        double[] numeros = new double[N];

        System.out.println("\nDigite " + N + " números reais [0.0]: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        // Inicializa com o primeiro valor do vetor
        double maiorValor = numeros[0];
        int posicaoMaior = 0;
        //double contador = 0.0;

        // Não cabe for-each, pois o índice [i] é relevante para o raciocínio
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("\nMaior valor: %.2f\n", maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaior);

        sc.close();
    }
}
