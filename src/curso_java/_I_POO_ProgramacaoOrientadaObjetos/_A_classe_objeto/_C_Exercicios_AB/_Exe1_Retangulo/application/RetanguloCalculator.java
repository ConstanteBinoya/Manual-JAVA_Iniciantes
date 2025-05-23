package curso_java._I_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe1_Retangulo.application;

import curso_java._I_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._C_Exercicios_AB._Exe1_Retangulo.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloCalculator {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite os valores de Base e altura de um retangulo: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("ÁREA = %.2f%n", retangulo.arearetangulo());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetroRetangulo());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonalRetangulo());
        sc.close();
    }
}
