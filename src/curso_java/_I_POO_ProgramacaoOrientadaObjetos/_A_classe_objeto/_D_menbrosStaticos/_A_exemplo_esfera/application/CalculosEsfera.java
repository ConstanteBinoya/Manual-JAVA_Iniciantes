package curso_java._I_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._D_menbrosStaticos._A_exemplo_esfera.application;

// Importa a classe utilitária EsferaCalc, que contém os métodos e constante estáticos
// responsáveis pelos cálculos matemáticos relacionados à esfera.
import curso_java._I_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._D_menbrosStaticos._A_exemplo_esfera.util.EsferaCalc;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe principal da aplicação.
 * Responsável por interagir com o usuário, coletar dados e exibir os resultados.
 * Aqui utilizamos os métodos estáticos da classe EsferaCalc para fazer os cálculos.
 */
public class CalculosEsfera {

    // Método principal que dá início à execução do programa.
    public static void main(String[] args) {

        // Define a localidade como US para garantir que o ponto seja usado como separador decimal.
        Locale.setDefault(Locale.US);

        // Instancia o objeto Scanner para capturar entrada de dados do usuário via terminal.
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira o valor do raio da esfera.
        System.out.println("Digite o valor do raio: ");
        double radius = sc.nextDouble();  // Lê o valor do raio digitado e armazena na variável 'radius'.

        // Chama o método estático 'circumference' da classe EsferaCalc, passando o raio como argumento.
        double c = EsferaCalc.circumference(radius);

        // Chama o método estático 'volume' da mesma classe para calcular o volume da esfera.
        double v = EsferaCalc.volume(radius);

        // Exibe o valor da circunferência com duas casas decimais.
        System.out.printf("Circunferência: %.2f%n", c);

        // Exibe o valor do volume com duas casas decimais.
        System.out.printf("Volume: %.2f%n", v);

        // Exibe o valor da constante PI diretamente da classe EsferaCalc.
        // Como PI é um membro estático, pode ser acessado sem instanciar a classe.
        System.out.printf("Valor de PI: %.2f%n", EsferaCalc.PI);

        // Encerra o objeto Scanner após o uso, por boa prática de liberação de recursos.
        sc.close();
    }
}
