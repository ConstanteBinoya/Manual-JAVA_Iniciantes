package curso_java._I_POO_Introducao_parte1._B_encapsulamento._A_construtores._A_estoque1.entities;

public class Product1 {
    public String name;
    public double price;
    public int quantity;

    //DECLARANDO O CONSTRUTOR DESTA CLASSE:
    /*
    Técnicamente, o construtor é um método especial por isso deve ser alocado logo após
    os atributos e antes dos métodos comuns.
     */
    /*
    Sua estrutura é muito semelhanta a daclasse a que pertence, com alguns detalhes que
    os destingue:
         1) O construtor precisa receber parãmetros da classe para poder "exigí-los";
         2) Os parâmetros são lançados dentro dos seus parenteses;
         3) No corpo do Construtor é feita a referenciação entre "atributo" e "parâmetro".
            Como, por boas práticas, tyanto atributo quanto parâmetro têm o mesmo nome
            distinguimo-os por intermédio da palavra reservada "this" que faz referância
            direta ao atributo da classe (this.atributo), logo, a palavra sem o "this" é
            um parãmetro.
     */
    public Product1(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

}
