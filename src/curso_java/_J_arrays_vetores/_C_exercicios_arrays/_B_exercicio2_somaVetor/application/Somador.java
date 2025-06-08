package curso_java._J_arrays_vetores._C_exercicios_arrays._B_exercicio2_somaVetor.application;

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

        int N;

        /*
         VERIFICAÇÃO-1: se o número digitado na primeira requisição será inteiro, caso
         o usuário digite algo que nãi seja um número inteiro o loop o forçará repetir
         até que um inteiro seja digitado.
         */
        do {
            System.out.println("Digite um número inteiro positivo maior que zero [>0] para iniciar: ");

            /*
             sc.hasNextInt() é um método que verifica a existência de um número inteiro
             "int", basicamente, analisa e reporta o resultado da análise.
             */
            if (sc.hasNextInt()) {
                N = sc.nextInt();

                /*
                VERIFICAÇÃO-2: ainda que o usuário tenha digitado um número inteiro,
                precisará ser POSITIVO.
                 */
                if (N > 0) {
                    break; // Entrada válida: sai do loop.
                } else {
                    System.out.println("Número inválido: Digite um número maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");

                /*
                  O hasNextInt() NÃO consome a entrada (apenas verifica se é um inteiro).
                  Se o valor não for inteiro, o Scanner continua "preso" na mesma entrada,
                  causando um loop infinito. Para evitar esse erro, é preciso consumir
                  manualmente o dado inválido. Por isso usamos sc.next() dentro do else,
                  para descartar a entrada inválida e permitir nova tentativa.
                 */
                sc.next();
            }

        } while (true);

        double[] numeros = new double[N];

        // Populando o array:
        System.out.println("Digite os " + N + " números para a soma: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        // Mostrando os elementos do array:
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número na posição: " + i + ": " + numeros[i]);
        }

        // Variável somadora responsável pelo somatório do array numeros[]
        double soma = 0;
        for (int i = 0; i< numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println();
        System.out.println("O somatório dos números digitados é: " + soma);

        // Variável responsável por apresentar a média dos valores do array.
        double media = soma / N;
        System.out.println();
        System.out.printf("A média dos números digitados é: %.2f ", media);

        sc.close();
    }
}
