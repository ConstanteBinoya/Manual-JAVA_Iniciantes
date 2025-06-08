package curso_java._J_arrays_vetores._C_exercicios_arrays._L_exercicio12_pensionato.application;

import curso_java._J_arrays_vetores._C_exercicios_arrays._L_exercicio12_pensionato.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class AluguelQuarto {
    public static void main(String[] args) {


        /**
         * A dona de um pensionato possui dez quartos para alugar para estudantes,
         * sendo esses quartos identificados pelos números 0 a 9.
         *
         * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
         * uma quantidade N representando o número de estudantes que vão alugar quartos
         * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
         * Para cada registro de aluguel, informar o nome e email do estudante, bem
         * como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido
         * um quarto vago. Ao final, seu programa deve imprimir um relatório de todas
         * as ocupações do pensionato, por ordem de quarto, conforme exemplo.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante[] quartos = new Estudante[10]; // Quartos de 0 a 9

        System.out.println("Quantos estudantes irão se hospedar (temos 10 vagas disponíveis) ?");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println("\nRegitre o Aluguel do(s) " + N + " estudante(s)");
        for (int i = 0; i < N; i++) {
            System.out.println("\nRegistro do " + (i + 1 ) + "º estudante: ");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("E-mail: ");
            String e_mail = sc.next();

            System.out.println("Número do quarto [0 a 9]: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();

            // Verificando disponibilidade do quarto:
            if (quartos[numeroQuarto] == null) {
                quartos[numeroQuarto] = new Estudante(nome, e_mail, numeroQuarto);
            }
            else {
                System.out.println("Quarto já ocupado! Tente outro número.");
                i--; // repete a iteração
            }
        }

        System.out.println("\nQuartos ocupados: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i]); // Chama o toString
            }
        }

        sc.close();
    }
}
