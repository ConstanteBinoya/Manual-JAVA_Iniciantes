package curso_java._I_arrays_vetores._C_exercicios_arrays._C_exercicio3_alturas.application;

import curso_java._I_arrays_vetores._C_exercicios_arrays._C_exercicio3_alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class CalculadorMedias {
    public static void main(String[] args) {

        /**
         * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
         * Depois, mostrar na tela a altura média das pessoas, e mostrar também a
         * porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas
         * caso houver.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int N = sc.nextInt();

        // INSTANCIA um array de objetos "Pessoa" com TAMANHO "N"
        Pessoa[] pessoas = new Pessoa[N];

        //Populando o array com o loop "for"
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i + 1);

            //coleta de dados para cada objeto "pessoas"
            /*
            sc.nextLine(); consome o caractere de quebra de linha deixado pelo nextInt() anterior,
            evitando que nextLine() pule a entrada."
             */
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            /*
             CRIA um novo objeto diferente do anterior a cada volta que o loop efetuar
             (com os dados fornecidos peplo usuário) e insere no vetor.
             */
            pessoas[i] = new Pessoa(nome, idade, altura);
        }


        double somaAltura = 0.0;
        int countMenores = 0;

        /*
         Para cada objeto "Pessoa" chamado "p" na coleção/array "pessoas", execute o
         bloco de código dentro das chaves {}.
         */
        for (Pessoa p : pessoas) {
            somaAltura += p.getAltura();
            if (p.getIdade() < 16) {
                countMenores++;
            }
        }

        //Cálaculo da média
        double mediaAlturas = somaAltura / pessoas.length;

        // Cálculo de um percentual
        /*
         * (double) counMenores: como a variável "counMenores"é do tipo int é preciso usar
         * um "casting" que transforma int em double para evitar conflitos no ato da
         * divisão apresentar "resto". Isso é necessário para evitar um problema de
         * divisão inteira.
         */
        double porcentagemMenores = ((double) countMenores / pessoas.length) * 100.0;

        System.out.printf("\nAltura média: %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores);

        for (Pessoa p : pessoas) {
            if (p.getIdade() < 16) {
                System.out.println(p.getNome());
            }
        }
        sc.close();
    }
}
