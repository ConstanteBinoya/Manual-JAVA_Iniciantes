package curso_java._J_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._B_sobrecarga.exemplo2_cinema.entities;

public class Ingresso {
    String nameFilme;
    String horario;
    double preco;

    public Ingresso(String nameFilme, String horario) {
        this.nameFilme = nameFilme;
        this.horario = horario;
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
