package curso_java._K_wrapper_types._A_boxing_unboxing._A_listas._B_exercicio_listas._B_exercicio2_controleEstoque.entities;

public class Produto {
    private final Integer CODIGO;
    private String nome;
    private Integer quantidade;

    public Produto(Integer codigo, String nome, Integer quantidade) {
        this.CODIGO = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return CODIGO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + CODIGO + ", "
                + "Nome: " + nome + ", "
                + "QTD: " + quantidade;
    }
}
