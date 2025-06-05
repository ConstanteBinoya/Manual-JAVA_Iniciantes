package curso_java._I_arrays_vetores._C_exercicios_arrays._J_exercicio10_aprovados.entities;

public class Aluno {
    private String nome;
    private double primeiraNota;
    private double segundaNota;
    private static final double MEDIA_MINIMA = 6.0;

    public Aluno(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public double getMediaMinima() {
        return MEDIA_MINIMA;
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }
}
