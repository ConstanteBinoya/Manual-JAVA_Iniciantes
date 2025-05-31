package curso_java._J_POO_ProgramacaoOrientadaObjetos._B_encapsulamento._F_exercicios_ABCD._A_banco.entities;

public class Conta {

    // ATRIBUTOS:
    private String nomeTitular;
    private final String numero; // número da conta não deve mudar
    private double saldo;
    private final double taxaSaque = 5.0; // constante, fixa

    //CONSTRUTORES:
    // CONSTRUTOR PRINCIPAL:
    /*
    Construtor para possibilidade do usuário abrir a conta e já efetuar seu primeiro
    depósito.
     */
    /*

     */
    public Conta(String nomeTitular, String numero, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // CONSTRUTOR DE SOBRECARGA (ALTERNATIVO):
    /*
    Essa versão do construtor é usada quando o usuário ainda não quer (ou não pode)
    fazer um depósito inicial ao criar a conta. Ao invés de repetir a lógica do
    primeiro construtor (código duplicado), usamos o "this(...)" para **reaproveitar**
    o construtor principal e passamos um valor padrão (0.0) para o saldo inicial.

    Essa prática se chama encadeamento de construtores (constructor chaining)

    Isso torna o código mais limpo, reutilizável e fácil de manter.
     */
    public Conta(String nomeTitular, String numero) {
        this(nomeTitular, numero, 0.0);   //?????
    }

    // GETTERS e SETTERS:
    /*
     Permite a visualização da TaxaSaque() no main:
       > Não recebe nenhum parâmetro externo à sua classe de origem (Conta);
       > Retorna o valor da taxa de saque (double) para fora da classe (Conta)
     */
    public double getTaxaSaque() {
        return taxaSaque;
    }

    /*
     Permite a visualização do NomeTitular() no main:
       > Não recebe nenhum parâmetro externo à sua classe de origem (Conta);
       > Retorna uma String para fora da classe (Conta)
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /*
     Permite a edição do NomeTitular() no main:
       > Recebe parâmetros externos (String nomeTitular);
       > Não retorna nada para fora da classe (Conta), por isso é VOID;
       > O atributo NomeTitular() recebe os valores do parâmetro nomeTitular
         a diferênça entre os dpis é feita pela palavra this. que se refere ao objeto.
     */
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    /*
     Permite a visualização do Numero() no main:
       > Não recebe nenhum parâmetro externo à sua classe de origem (Conta);
       > Retorna uma String para fora da classe (Conta)
     */
    public String getNumero() {
        return numero;
    }

    /*
     Permite a visualização da getSaldo() no main:
       > Não recebe nenhum parâmetro externo à sua classe de origem (Conta);
       > Retorna o saldo (double) para fora da classe (Conta)
     */
    public double getSaldo() {
        return saldo;
    }

    // MÉTODOS:

    /*
    Este método recebe parâmetro externo, processa-o, altera internamente o atributo
    ou variável e não precisa retornar nada diretamente (devido ao VOID), mas isso não
    impede que o seu resultado seja acessado fora da classe (devido ao PUBLIC).
     */
    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
        }
    }

    /*
    Este método recebe parâmetro externo, processa-o, altera internamente o atributo
    ou variável e não precisa retornar nada diretamente (devido ao VOID), mas isso não
    impede que o seu resultado seja acessado fora da classe (devido ao PUBLIC).
     */
    public void sacar(double saque) {
        saldo -= (saque + taxaSaque); // Aplicar a taxa para saque
    }

    /*
     * Sobrescreve o método toString() "@Override" da classe Object para retornar
     * uma representação textual legível da conta.
     *
     * Isso permite que, ao imprimir o objeto Conta, sejam exibidos
     * dados úteis como número da conta, titular e saldo formatado,
     * em vez do padrão "Conta@123abc".
     *
     * Útil para depuração, logs e apresentação ao usuário.
     */
    public  String toString() {
        return "Conta: " + numero
                + "\nTitular: " + nomeTitular
                + String.format("\nSaldo: R$ %.2f", saldo);
    }
}
