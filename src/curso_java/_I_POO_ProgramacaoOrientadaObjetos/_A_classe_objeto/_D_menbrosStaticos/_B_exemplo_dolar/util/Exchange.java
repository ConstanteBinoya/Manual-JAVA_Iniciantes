package curso_java._I_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._D_menbrosStaticos._B_exemplo_dolar.util;

public class Exchange {

    public static double cambio(double cotacao, double qtdDolar) {
        // Calcula o valor em reais sem IOF
        double brlSemIOF = qtdDolar * cotacao;

        // Aplica a taxa de IOF de 6% sobre o valor convertido
        double brlComIOF = brlSemIOF + (brlSemIOF * 0.06);

        // Retorna o valor final a ser pago em reais, com IOF incluído
        return brlComIOF;
    }
}
