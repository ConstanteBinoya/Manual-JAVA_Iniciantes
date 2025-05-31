// CRIAÇÃO DA CLASSE "TRIANGLE":

/*
 * Em Programação Orientada a Objetos (POO), trabalhar com classes permite organizar o
 * códigode forma modular, reutilizável e mais fácil de manter. Classes representam
 * "modelos" de objetosdo mundo real, agrupando dados (atributos) e comportamentos
 * (métodos) em uma estrutura coesa.
 */


package curso_java._J_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    // CRIAÇÃO DO MÉTODO QUE CALCULA A ÁREA DE UM TRIÂNGULO:
    /*
     * Em POO, a classe é responsável por definir todos os métodos que podem ser aplicados
     * aos objetosque ela cria. Isso garante encapsulamento, ou seja, os dados e
     * comportamentos ficam reunidosem um mesmo local, facilitando o controle, a
     * segurança e a reutilização do código.
     */
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
