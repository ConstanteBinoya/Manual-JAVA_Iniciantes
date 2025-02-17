import java.util.Scanner; /*
                          *O Scanner é necessário para capturar entradas do usuário no terminal:
                          *É responsável por criar um objeto da classe Scanner, que permite a leitura 
                          *de entradas do usuário via teclado (terminal).
                          */

                          /*
                          *Sempre que for criar um programa que solicite dados do usuário, será necessário
                          *Importar a CLASS SCANNER que faz parte do pacote JAVA.UTIL.
                          */

public class BancoTerminal {

    public static void main(String[] args) {

        //TODO: Conhecer e importar a class Scanner;
        //Exibir as mensagens para nosso usuário;
        //Obter pela acanner os valores digitados no terminal;
        //Exibir a mensagem de conta criada.



        

        Scanner scanner = new Scanner(System.in); //Cria um objeto capaz de ler dados do teclado.
        //Decompondo o código:
        //O 1º "Scanner" faz referência  à class do pacote java.util;
        //O 2º "scanner" é o nome da variável (convencionado) presente no objeto do tipo "Scanner";
        //O sinal de "=" indica atribuição (valor) da variável "scanner";
        /*O "new" é um operadior de instanciação (é usado para criar um novo objeto na memória):
        Ele chama o construtor da classe "Scanner"para inicializar um objeto novo.*/
        //O trecho "Scanner(...)" é o construtor da classe Scanner, responsável por iniciar o objeto;
        //O trecho "System.in" Representa a entrada padrão do sistema, ou seja, o teclado.

        System.out.println("|======================================|");
        System.out.println("|==== BINOYA's_INTERNATIONAL_BANK =====|");
        System.out.println("|======================================|");
        System.out.println("|             Seja Bem-vindo!          |");

        // Solicitando e capturando os dados da conta bancária
        System.out.println("----------------------------------------");
        System.out.println("| Por favor, digite o NÚMERO da CONTA: |");
        System.out.println("----------------------------------------");
        int conta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        System.out.println("");

        System.out.println("----------------------------------------");
        System.out.println("|Por favor, digite o NÚMERO da AGÊNCIA:|");
        System.out.println("----------------------------------------");
        String agencia = scanner.nextLine();
        System.out.println("");

        System.out.println("----------------------------------------");
        System.out.println("|Por favor, digite seu NOME:           |");
        System.out.println("----------------------------------------");
        String nomeCliente = scanner.nextLine();
        System.out.println("");
        
        System.out.println("----------------------------------------");
        System.out.println("|Por favor, digite o SALDO INICIAL:    |");
        System.out.println("----------------------------------------");
        double saldo = scanner.nextDouble();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("|======================================|");
        System.out.println("|==== BINOYA's_INTERNATIONAL_BANK =====|");
        System.out.println("|======================================|");
        System.out.println("|            Extrato Bancário          |");
        System.out.println("----------------------------------------");
        System.out.println("CLIENTE: " + nomeCliente + ".");
        System.out.println("----------------------------------------");
        System.out.println("AGÊNCIA: " + agencia + ".");
        System.out.println("----------------------------------------");
        System.out.println("CONTA: " + conta + ".");
        System.out.println("----------------------------------------");
        System.out.println("SALDO: R$" + saldo + ".");
        System.out.println("----------------------------------------");
        System.out.println("|########################################|");
        System.out.println(" Olá " + nomeCliente + ", obrigado por criar \n uma conta em nosso banco! ");
        System.out.println("|########################################|");

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
