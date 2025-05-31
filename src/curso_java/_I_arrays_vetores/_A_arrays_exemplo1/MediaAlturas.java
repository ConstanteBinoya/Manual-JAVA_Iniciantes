package curso_java._I_arrays_vetores._A_arrays_exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlturas {
    public static void main(String[] args) {

        /**
        Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene
        as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número pessoas participarão do cálculo: ");
        int N = sc.nextInt();

        // Declaração/Instanciação do Array (vetor)
        /*
        Traduzindo: "crie um array (vetor) do tipo double, chamado vect que será
        capaz de armazenar "N" elementos do tipo double também.

        Neste momento, o array é alocado na memória com "N" posições, todas inicialmente
        com o valor padrão 0.0 (por ser do tipo double).
         */
        double[] altura = new double[N];

        System.out.println("Digite a altura dos " + N + " participantes: ");

        // Lógica básica de um loop que se sabe exatamente o número de repetições.
        for (int i = 0; i < altura.length; i++) {
            /*
             o array "vect" em sua posição "i" - que é dinâmica - receberá os valores
             digitados pelo usuário, de acordo com o valor de "i" (i = 0; i = 1; i = 2...).
             Isso garante que o for percorra e preencha corretamente cada posição do array.
             */
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < altura.length; i++) {
            /*
            Neste momento o array já está populado com os dados fornecidos pelo usuário,
            de forma que a variável "soma" somará todos os valores contidos no array:
            iniciada com o valor 0.0 + o valor da 1ª posição do array, depois pela 2ª,
            3ª... e assim até finalizar o loop.
            Ao final teremos o somatório dos valores de cada índice do array.
             */
            soma += altura[i];
        }

        // Lógica básica para o cálculo de uma média.
        double media = soma / N;

        System.out.printf("A altura média dos participantes é: %.4f%n", media);

        sc.close();
    }
}
