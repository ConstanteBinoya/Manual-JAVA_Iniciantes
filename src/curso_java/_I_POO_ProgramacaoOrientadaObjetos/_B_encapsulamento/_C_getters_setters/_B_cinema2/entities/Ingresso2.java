package curso_java._I_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._C_getters_setters._B_cinema2.entities;

public class Ingresso2 {
    private String nameFilme;
    private String horario;
    private double preco;

    public Ingresso2(String nameFilme, String horario) {
        this.nameFilme = nameFilme;
        this.horario = horario;
    }

    public String getNameFilme() {
        return nameFilme;
    }

    public void setNameFilme(String nameFilme) {
        if (nameFilme != null && !nameFilme.trim().isEmpty()) {
            this.nameFilme = nameFilme;
        }
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        if (horario != null && !horario.trim().isEmpty()) {
            this.horario = horario;
        }
    }

    public double getPreco() {
        return preco;
    }

    //Pagamento em Dinheiro:
    public void comprar(double valorPago) {
        preco = 20.0;
        if (valorPago >= preco) {
            double troco = valorPago - preco;
            System.out.println("Ingresso comprado com DINHEIRO.");
            System.out.println("Troco: R$" + troco);
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Bom filme!!!");
        } else {
            System.out.println("Valor insuficiente para compra.");
            System.out.println("Compra cancelada!");
        }
    }

    //Pagamento com Cartão:
    public void comprar(String numeroCartao, String titularCartao, String cvv) {
        System.out.println("Ingresso comprado com CARTÃO.");
        System.out.println("Cartão: " + numeroCartao);
        System.out.println("Titular: " + titularCartao);
        System.out.println("CVV: " + cvv);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("Bom filme!!!");
    }

    //Pagamento com PIX:
    public void comprar(String titularPix, String chavePix) {
        System.out.println("Ingresso comprado com PIX.");
        System.out.println("Titular: " + titularPix);
        System.out.println("Chave: " + chavePix);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("Bom filme!!!");
    }
}
