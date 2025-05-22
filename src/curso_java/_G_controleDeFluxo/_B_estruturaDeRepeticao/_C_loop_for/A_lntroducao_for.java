package curso_java._G_controleDeFluxo._B_estruturaDeRepeticao._C_loop_for;

import java.util.Scanner;

public class A_lntroducao_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Introdução ao loop for:
        System.out.println("Digite quantas vezes o loop deve repetir-se: ");
        int N = sc.nextInt(); // "N" significa "N vezes", relativo a quantidade

        System.out.println("Digite " + N + " números: ");

        int soma = 0;
        /*
        a variável "i" é uma convenção da comunidade. poseria ser qualquer outro nome que
        faça sentido à lógica do programa. Mas, por convenção geral, mantenha o "i".
         */
        // int i = 0; >>> é o inicializador do loop
        // i < N; >>> é a condição de saída do loop; e
        // i = i + 1; ou i++; é o incremento que possibilitará a saída do loop.
        for (int i = 0; i < N; i = i + 1) {
            int x = sc.nextInt(); // "x" significa uma incognita qualquer  "O x da questão"
            soma = soma + x;
        }
        System.out.println("O somatório dos números digitados é: " + soma);

        sc.close();
    }
}
