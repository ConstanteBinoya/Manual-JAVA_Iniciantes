package curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo.application;

import curso_java._I_POO_Introducao_parte1._A_classe_objeto._A_exemplo_triangulo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class CalculadorAreaTriangulo {
    public static void main(String[] args) {

        /*
        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
        (suponha medidas válidas).Em seguida,mostrar o valor das áreas dos dois triângulos e
        dizer qual dos dois triângulos possui a maior área. Afórmula para calcular a
        área de um triângulo apartir das medidas de seus lados a,b e c é a seguinte
        (fórmula de Heron):

        Seja um triângulo com lados a, b e c. Primeiro, calcula-se o semi-perímetro (p):

        p = (a + b + c) / 2

        Depois, a área (A) do triângulo é dada por:

        A = √[s * (s - a) * (s - b) * (s - c)]
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // No comentário abaixo contém a versão do programa sem uso de CLASSES OU OBJETOS
        /*
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Insira as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo X área: %.4f%n", areaX);
        System.out.printf("Triangulo Y área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }
         */

        Triangle x, y; // Criadas as variáveis "x" e "y" do tipo "Triangle"

        // Instanciando o objeto para que exista na aplicação.
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangulo X área: %.4f%n", areaX);
        System.out.printf("Triangulo Y área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}
