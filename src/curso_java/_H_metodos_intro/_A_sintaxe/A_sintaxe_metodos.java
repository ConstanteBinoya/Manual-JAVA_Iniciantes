package curso_java._H_metodos_intro._A_sintaxe;

import java.util.Scanner;

public class A_sintaxe_metodos {
    public static int dobrar(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int N = sc.nextInt();

        int resultado = dobrar(N);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
