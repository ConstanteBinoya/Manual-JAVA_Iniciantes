package curso_java._I_POO_Introducao_parte1._B_encapsulamento._C_getters_setters._A_estoque2.entities;

// Atributos privados: acesso externo direto não é permitido
public class Product2 {
    private String name;
    private double price;
    private int quantity;

    // Construtor permite inicializar os atributos no momento da criação do objeto
    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //ÁREA DE GETTERS E SETERS (logo após os construtores)

    // Getter (getPrice): permite LER o valor do atributo privado 'price' de forma segura
    public double getPrice() {
        return price;
    }

    // Getter (getName): permite LER o nome do produto de forma controlada
    public String getName() {
        return name;
    }

    // Getter (getQuantity): permite acessar a quantidade em estoque
    public int getQuantity() {
        return quantity;
    }

    // Setter (setName): permite ALTERAR o nome, desde que seja válido (não nulo ou vazio)
    // Evita entrada de dados incorretos — controle total pela própria classe
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    // Setter (setPrice): permite alterar o preço, validando se é um valor positivo
    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    // Demais métodos operacionais (não relacionados diretamente a getters/setters)
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Método toString — representa o estado atual do objeto em formato legível
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
