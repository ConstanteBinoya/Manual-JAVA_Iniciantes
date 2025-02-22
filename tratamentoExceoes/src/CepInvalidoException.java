public class CepInvalidoException extends Exception {

}
// Qual a necessidade das duas classes para exemplificar a personalização de
// exceptions?

/*
 * A criação de uma exceção personalizada (CepInvalidoException) e do método que
 * a utiliza (formatarCep()) são partes complementares de um exemplo de exceção
 * personalizada.
 */

// Classe CepInvalidoException:
     // #Define uma nova exceção que herda de Exception, tornando-a Checked Exception;
     // #Isso obriga quem chama o método formatarCep() a tratar a exceção com try-catch ou throws.

// Classe FormatadorCepExemplo:
     // #Define o método formatarCep(String cep), que pode lançar a exceção personalizada.;
     // #Mostra como capturar e tratar a exceção no try-catch.

// Conclusão:
/*
 * A exceção personalizada precisa existir como uma classe separada
 * (CepInvalidoException), e um método deve utilizá-la para lançá-la
 * (formatarCep).
 */