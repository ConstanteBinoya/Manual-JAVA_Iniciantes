package curso_java._J_POO_ProgramacaoOrientadaObjetos._A_classe_objeto._A_exemplo_triangulo._D_menbrosStaticos._A_exemplo_esfera.util;

/**
 * Classe utilitária para cálculos relacionados a esferas.
 *
 * Nesta classe, todos os membros são estáticos, ou seja, pertencem à própria classe
 * e não exigem a criação de objetos para serem acessados.
 */
public class EsferaCalc {

    /**
     * Constante que representa o valor de PI, usado em cálculos geométricos.
     *
     * A palavra-chave 'final' torna esse valor IMUTÁVEL após sua atribuição.
     *
     * A palavra-chave 'static' indica que esse valor pertence à CLASSE e não a um
     * objeto específico.

     * Por boa prática, constantes são escritas em CAIXA ALTA.
     */
    public static final double PI = 3.14159;

    /**
     * Método estático que calcula a circunferência de uma esfera com base no raio fornecido.
     *
     * Por ser um cálculo genérico e independente do estado de um objeto,
     * o método é declarado como 'static', permitindo que seja chamado diretamente via classe.
     *
     * @param radius Raio da esfera
     * @return Circunferência calculada: 2 * PI * raio
     */
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    /**
     * Método estático que calcula o volume de uma esfera com base no raio fornecido.
     *
     * Assim como o método anterior, este também é 'static' por não depender
     * de atributos internos ou instâncias da classe.
     *
     * @param radius Raio da esfera
     * @return Volume calculado: (4/3) * PI * raio³
     */
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}

