package curso_java._B_entradaDeDados;

import java.util.Locale;
import java.util.Scanner; //Habilita a leitura de dados [ENTRADA via USUÁRIO]

public class EntradaDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		/*
		Só precisa declarar o 'Locale' se quiser que o padão de casas decimais
		sejam EUA (com .),caso contrário será automáticamente com vírgula.
		*/
        Scanner sc = new Scanner(System.in); //Cria o objeto "Sacanner" para ler os dados

        // 1º) Entrada de String (palavras até digitar um "espaço") com o next():
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        /*
        2º) Entrada de Linhas inteiras (tudo o que for digitado, considera espaços)
        com o nextLine():
         */
        sc.nextLine(); // Limpar o BUFFER de leitura [exclusivo para nextLine]
        /*
        Quando você usa um comando de leitura diferente do nextLine() e dá alguma
        quebra de linha (enter, \n, %n...), essa quebra de linha fica "pendente" na
        entrada padrão.
         */
        System.out.println("Digite seu nome completo: ");
        String fullNome = sc.nextLine(); //

        // 3º) Entrada e reconhecimento via índice de um caractere com o next().charAt():
        System.out.println("Digite seu sexo [M/F]: ");
        char sexo = sc.next().charAt(0);
		/*
		"sc.next().charAt(0)" Representa uma entrada de Char [caractere].
		.charAT() é o identificador para recepcionar um caractere e o número
		entre parenteses referencia o indice do caractere que deve ser salvo em memória.
		semelhante a um array; 1º índice (0), 2º (1)... Se for digitado mais de
		um caractere o programa salvará apenas o caractere referente ao índice selecionado.
		 */

        // 4º) Entrada e de números inteiros com o nextInt():
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        // 5º) Entrada e de números reais (ponto flutuante) com o nextDouble():
        System.out.println("Digite sua pretenção salarial: ");
        double salario = sc.nextDouble(); // Entrada de pontos flutuantes

        sc.close(); // comando para finalizar o bloco de entrada de dados

        System.out.println("Cadastro realizado com sucesso:");
        System.out.println("NOME: " + nome);
        System.out.println("NOME COMPLETO: " + fullNome);
        System.out.println("SEXO: " + sexo);
        System.out.println("IDADE: " + idade);
        System.out.printf("SALÁRIO: %.2f %n", salario);

    }

}
