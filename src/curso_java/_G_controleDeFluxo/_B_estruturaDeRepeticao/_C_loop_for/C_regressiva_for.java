package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for;

import java.util.Scanner;

public class C_regressiva_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CONTAGEM REGRESSIVA COM FOR:
        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        for (int i = N; i >= 0; i--) {
            System.out.println("Valor de i: " + i);
        }
        sc.close();
    }
}
