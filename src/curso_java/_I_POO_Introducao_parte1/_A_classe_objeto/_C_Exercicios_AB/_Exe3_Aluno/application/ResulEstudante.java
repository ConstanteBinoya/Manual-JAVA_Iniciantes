package curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe3_Aluno.application;

import curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe3_Aluno.entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class ResulEstudante {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digte o nome do aluno: ");
        estudante.name = sc.next();

        System.out.println("Digite as três notas dos trimestes: ");
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.println();
        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60.0) {
            System.out.println("REPROVADO!");
            System.out.printf("Faltam %.2f pontos para passar...%n", estudante.faltaParaPassar());
        }
        else {
            System.out.println("APROVADO PARABÈNS!!!");
        }
        sc.close();
    }
}
