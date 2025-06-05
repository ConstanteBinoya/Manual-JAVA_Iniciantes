package curso_java._I_arrays_vetores._C_exercicios_arrays._I_exercicio9_maisVelho.application;

import curso_java._I_arrays_vetores._C_exercicios_arrays._I_exercicio9_maisVelho.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class IdentificadorDeMaisVelho {
    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
         * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
         * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas para cadastro: ");
        int N = sc.nextInt();
        sc.nextLine(); // Limpando o buffer para o NextLine em seguida.

        // Criando um vetor que irá armazenar objetos do tipo Pessoa
        Pessoa[] pessoas = new Pessoa[N];

        // Populando o array "pessoas"
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpa o buffer para o próximo loop

            // De fato, criando o objeto Pessoa com seus devidoos parâmetros
            pessoas[i] = new Pessoa(nome, idade);
        }

        // Inicializando com a primeira pessoa como a mais velha
        int indexMaisVelho = 0;

        /*
        Percorre o vetor comparando as idades para encontrar o índice da pessoa mais velha
         */
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > pessoas[indexMaisVelho].getIdade()) {
                indexMaisVelho = i;
            }
        }

        System.out.println("\nPESSOA MAIS VELHA:");
        System.out.println(pessoas[indexMaisVelho].getNome() + ", com " +
                pessoas[indexMaisVelho].getIdade() + " anos.");

        sc.close();
    }
}
