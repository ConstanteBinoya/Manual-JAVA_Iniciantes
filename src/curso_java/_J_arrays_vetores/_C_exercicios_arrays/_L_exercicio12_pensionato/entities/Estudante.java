package curso_java._J_arrays_vetores._C_exercicios_arrays._L_exercicio12_pensionato.entities;

public class Estudante {
    private String nome;
    private  String e_mail;
    private int numeroQuarto;

    public Estudante(String nome, String e_mail, int numeroQuarto) {
        this.nome = nome;
        this.e_mail = e_mail;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getQuarto() {
        return numeroQuarto;
    }

    public void setQuarto(int quarto) {
        this.numeroQuarto = quarto;
    }

    @Override
    public String toString() {
        return numeroQuarto + ": " + nome + ", " + e_mail;
    }
}
