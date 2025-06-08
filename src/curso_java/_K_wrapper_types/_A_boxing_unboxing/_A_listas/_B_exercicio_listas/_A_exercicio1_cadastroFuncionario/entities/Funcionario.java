package curso_java._K_wrapper_types._A_boxing_unboxing._A_listas._B_exercicio_listas._A_exercicio1_cadastroFuncionario.entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    @Override
    public String toString() {
        return id + ", "
                + nome + ", "
                + String.format("%.2f", salario);
    }
}
