package curso_java._I_arrays_vetores._C_exercicios_arrays._C_exercicio3_alturas.entities;

public class Pessoa {
    /*
     Atributos privados que representam as características de uma pessoa
     (apenas características necessárias à regra de negócios)
     */
    private String nome;
    private int idade;
    private double altura;

    // Construtor que define o estado inicial do objeto ao ser criado
    public Pessoa(String name, int idade, double altura) {
        this.nome = name;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    // Método toString sobrescrito para representar o objeto como texto
    @Override
    public String toString() {
        return "Nome: " + nome
                + ", Idade: " + idade
                + ", Altura: " + String.format("%.2f", altura);
    }

}
