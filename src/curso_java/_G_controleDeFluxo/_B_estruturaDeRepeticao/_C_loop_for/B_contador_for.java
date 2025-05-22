package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for;

import java.util.Scanner;

public class B_contador_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CONTAGEM COM FOR:
        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        /*
        OBS: Se o "i" iniciar com "0", o contador apresentará o número digitado - 1 [N - 1],
        pois a contagem se iniciará do zero e se repetirar por "N" vezes.
        Para uma contagem tradicional iniciado por "1", troque o "0" por "1"
        na inicialização e na condição "<" por "<="
         */
        /*
        for (int i = 0; i < N; i++) {
            System.out.println("Valor de i: " + i);
        }
         */
        for (int i = 1; i <= N; i++) {
            System.out.println("Valor de i: " + i);
        }
        sc.close();
    }
}
