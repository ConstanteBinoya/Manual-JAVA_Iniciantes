package curso_java._J_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._F_exercicios_ABCD._A_banco.application;

import curso_java._J_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._F_exercicios_ABCD._A_banco.entities.Conta;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Banco {
    public static void main(String[] args) {
        /**
         * INSTRUÇÕES PARA REALIZAÇÃO DO EXERCÍCIO:
         Em um banco, para se cadastrar uma conta bancária, é necessário informar o número
         da conta, o nome do titular da conta, e o valor de depósito inicial que o titular
         depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional,
         ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta,
         o depósito inicial não será feito e o saldo inicial da conta será, naturalmente,
         zero.Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca
         poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode
         mudar de nome por ocasião de casamento, por exemplo).

         Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um
         mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só
         diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa
         de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
         suficiente para realizar o saque e/ou pagar a taxa.Você deve fazer um programa
         que realize o cadastro de uma conta, dando opção para que seja ou não informado
         o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque,
         sempre mostrando os dados da conta após cada operação.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // GERAR ALEATORIAMENTE O Nº DA CONTA. Ex: (1234-5)
        // Gerar os 4 primeiros dígitos (de 1000 a 9999 para evitar zeros à esquerda)
        int numeroPrincipal = ThreadLocalRandom.current().nextInt(1000, 10000);
        // Gerar o dígito verificador (0 a 9)
        int digitoConta = ThreadLocalRandom.current().nextInt(0, 10);
        String numeroConta = numeroPrincipal + "-" + digitoConta;

        int menu; // Precisou ser iniciado fora do loop, para controlar o switch case

        // Objeto Conta com escopo global. Dá sentido aos casos 2,3 e 4 do switch
        // Para o caso 1 o objeto é instanciado normalmente.
        /*
        Numa visão mais técnica, a classe "Conta" ocupa um espaço de REFERÊNCIA na
        memória "Stack", que geralmente aponta (referencia) o caminho até a memória
        "Heap" que serve aos objetos. Por estratégia de funcionamento lógico, decidi a
        "Stack" não faria, inicialmente, referência a nenhum "Heap", por isso conta
        foi lançada com o valor "null".
         */
        Conta conta = null;

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$           BINA's BANK           $$$$");
        System.out.println("$$$$---------------------------------$$$$");
        System.out.println("$$$$            Bem-vindo            $$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println();

        /*
         Loop com verificação no final, possibilita o usuário decidir quando o programa
         deve ser finalizado.
         */
        do {
            System.out.println("======================");
            System.out.println("|==      Menu      ==|");
            System.out.println("|--------------------|");
            System.out.println("| Abrir Conta:   [1] |");
            System.out.println("| Saldo:         [2] |");
            System.out.println("| Depósito:      [3] |");
            System.out.println("| Saque:         [4] |");
            System.out.println("| Sair:          [0] |");
            System.out.println("======================");
            menu = sc.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.println("Digite seu nome completo: ");
                    sc.nextLine(); // limpa buffer do teclado
                    String nomeTitular = sc.nextLine();

                    System.out.println("O número da sua conta é: " + numeroConta);
                    System.out.println();
                    System.out.println("Deseja realizar o primeiro depósito agora Sim [S] ou Não [N]?");
                    char respDeposito = sc.next().charAt(0);

                    if (Character.toUpperCase(respDeposito) == 'S') {
                        System.out.println("Digite o valor do depósito: ");
                        double depositoAbertura = sc.nextDouble();

                        /*
                         Instanciação do objeto conta com os parãmetros exigidos pelo
                         construtor principal da classe Conta
                         */
                        conta = new Conta(nomeTitular, numeroConta, depositoAbertura);

                    } else {

                        /*
                         Instanciação do objeto conta - sobrecarregado - com os
                         parãmetros exigidos pelo construtor secundário da classe Conta
                         */
                        conta = new Conta(nomeTitular, numeroConta);
                    }
                    System.out.println("Conta criada com sucesso!");
                    System.out.println(conta); // usa toString da Conta
                    break;

                case 2:
                    if (conta != null) {
                        System.out.println(conta);
                    } else {
                        System.out.println("Nenhuma conta cadastrada.");
                    }
                    break;

                case 3:
                    if (conta != null) {
                        System.out.println("Digite o valor do depósito: ");
                        double valor = sc.nextDouble();

                        /*
                        Indica que a classe Conta em seu método "depositar" receberá
                        como parâmetro o conteúdo ca variável valor.
                         */
                        conta.depositar(valor);

                        System.out.println("Depósito realizado!");
                        System.out.println(conta); // Chama o toString formatado
                    }else {
                        System.out.println("Nenhuma conta cadastrada.");
                    }
                    break;

                case 4:
                    if (conta != null) {
                        System.out.println("Digite o valor do saque: ");
                        double valorSaque = sc.nextDouble();

                        /*
                        Indica que a classe Conta em seu método "sacar" receberá
                        como parâmetro o conteúdo ca variável valorSaque.
                         */
                        conta.sacar(valorSaque);

                        System.out.println("Saque realizado! (Taxa de R$5.00 aplicada)");
                        System.out.println(conta);// Chama o toString formatado
                    } else {
                        System.out.println("Nenhuma conta cadastrada.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (menu != 0);

        System.out.println();
        System.out.println("Teste realizado com sucesso!");

        sc.close();
    }
}
