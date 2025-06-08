package curso_java._J_arrays_vetores._C_exercicios_arrays._J_exercicio10_aprovados.application;

import curso_java._J_arrays_vetores._C_exercicios_arrays._J_exercicio10_aprovados.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class AvaliadorDeNotas {
    public static void main(String[] args) {

        /**
         * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
         * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações
         * deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos
         * aprovados, considerando aprovados aqueles cuja média das notas seja maior
         * ou igual a 6.0 (seis).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão avaliados? ");
        int N = sc.nextInt();
        sc.nextLine();

        Aluno[] alunos = new Aluno[N];

        System.out.println("\nDigite o(s) nome(s) e nota(s) do(s) " + N + " aluno(s): ");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nDados do " + (i + 1) + "º aluno(a):");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Nota do 1º semestre: ");
            double primeiraNota = sc.nextDouble();

            System.out.println("Nota do 2º semestre: ");
            double segundaNota = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        System.out.println("\nAluno(s) aprovado(s): ");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].calcularMedia() >= alunos[i].getMediaMinima()) {
                System.out.println(alunos[i].getNome()
                        + ", com média: "
                        + alunos[i].calcularMedia());
            }
        }

        sc.close();
    }
}
