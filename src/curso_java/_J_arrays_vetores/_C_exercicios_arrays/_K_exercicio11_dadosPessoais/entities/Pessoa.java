package curso_java._J_arrays_vetores._C_exercicios_arrays._K_exercicio11_dadosPessoais.entities;

public class Pessoa {
    private String nome;
    private char genero;
    private double altura;

    public Pessoa(String nome, char genero, double altura) {
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

}
