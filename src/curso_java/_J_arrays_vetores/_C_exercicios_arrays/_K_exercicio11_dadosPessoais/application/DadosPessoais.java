package curso_java._J_arrays_vetores._C_exercicios_arrays._K_exercicio11_dadosPessoais.application;

import curso_java._J_arrays_vetores._C_exercicios_arrays._K_exercicio11_dadosPessoais.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {

        /**
         * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
         * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
         * média de altura das mulheres, e o número de homens.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de passoas para cadastrar: ");
        int N = sc.nextInt();
        sc.nextLine(); // Limpando o buffer para o sc.nextLine();

        Pessoa[] pessoas = new Pessoa[N];

        // Populando o Array:
        System.out.println("\nDigite os dados de " + N + " pessoa(s)");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nDados da " + (i + 1) + "ª pessoa:");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Gênero: ");
            char genero = sc.next().charAt(0);

            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer para o loop

            pessoas[i] = new Pessoa(nome, genero, altura);
        }

        double maisAlto = pessoas[0].getAltura();
        double maisBaixo = pessoas[0].getAltura();
        double somaAlturaF = 0.0;
        double mediaF = 0.0;
        int qtdF = 0;
        int qtdM = 0;

        // Identifica O mais alto e o mais baixo:
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAltura() > maisAlto) {
                maisAlto = pessoa.getAltura();
            }
            if (pessoa.getAltura() < maisBaixo) {
                maisBaixo = pessoa.getAltura();
            }
        }

        // Identifica a quantidade de homens e de mulheres:
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getGenero() == 'M') {
                qtdM++;

            } else if (pessoa.getGenero() == 'F'){
                qtdF++;
                somaAlturaF += pessoa.getAltura();
            }
        }

        // Realiza o cálculo da média das mulheres:
        if (qtdF > 0) {
            mediaF = somaAlturaF / qtdF;
        } else {
            System.out.println("Não há mulheres no cadastro.");
        }

        System.out.printf("\nMaior Altura = %.2f%n", maisAlto);
        System.out.printf("Menor Altura = %.2f%n", maisBaixo);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaF);
        System.out.println("Quantidade de homens = " + qtdM);

        sc.close();
    }
}
