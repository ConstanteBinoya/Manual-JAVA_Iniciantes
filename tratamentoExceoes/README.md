# ⚠️ Exceções e Tratamento de Erros em Java 🚀

## 📌 O que são Exceções?

Uma **exceção** em Java é um evento inesperado que ocorre durante a execução do programa e interrompe seu fluxo normal. As exceções podem acontecer por vários motivos, como:

- Tentativa de divisão por zero ➗
- Acesso a uma posição inválida em um array 📊
- Operações em objetos `null` 🚫
- Falhas na leitura de arquivos 📂

---

## 🔥 A Hierarquia das Exceções em Java

Em Java, todas as exceções são derivadas da classe `Throwable`.
A classe `Throwable` em Java é a superclasse de todas as exceções e erros. Ela possui duas subclasses diretas principais:

1. `Exception` – Representa exceções que podem ser tratadas (checked exceptions e unchecked exceptions),erros que podem ser previstos e tratados no código.  

- **`RuntimeException`**: Exceções que ocorrem em tempo de execução.  

2. `Error` – Representa erros do sistema que normalmente não podem ser tratados pelo programa As principais subclasses são:

### 📌 `Exception` (Checked Exceptions - Exceções Verificadas)
As exceções que herdam diretamente de `Exception`, mas não de `RuntimeException`, são chamadas de Checked Exceptions.
Elas devem ser tratadas obrigatoriamente no código com `try-catch` ou declaradas no método com `throws`.
Caso contrário, o código não compila.

- 🚫 As `Checked Exceptions` são verificadas pelo compilador, ou seja, **se o código puder gerar uma dessas exceções, o programador é obrigado a tratá-las com try-catch ou declará-las com throws**, caso contrário, o código não compila.

### ✅ Características das Checked Exceptions:  
- O compilador obriga que você trate a exceção ou a propague.  
- Normalmente, indicam problemas previstos que podem ocorrer durante a execução do programa.  
- Exemplos comuns: Falhas de entrada/saída, problemas em banco de dados, problemas de rede, etc.

📌 Exemplo de Checked Exception

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("arquivo.txt")); // Pode lançar FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
        }
    }
}
```

🔹 Sem o try-catch ou throws, o código não compila!
---

### ❌ `RuntimeException` (Unchecked Exceptions - Exceções Não Verificadas)

As exceções que herdam de `RuntimeException` são chamadas de Unchecked Exceptions.
O compilador NÃO obriga que você as trate com `try-catch` ou `throws`.

- As `Unchecked Exceptions` não são verificadas pelo compilador, ou seja, **o programador não é obrigado, pelo compilador, a tratá-las**.
- Essas exceções ocorrem devido a erros de lógica ou falhas do programador.

### 🔍 **Por que o compilador não obriga o tratamento de Unchecked Exceptions?**

1. **São erros do programador** → Normalmente, acontecem devido a descuidos no código, como tentar acessar um índice inexistente de um array ou chamar um método em um objeto `null`;  
2. **Corrigir é melhor do que tratar** → Em vez de capturar a exceção com `try-catch`, a melhor abordagem é garantir que o **erro** não ocorra;  
3. **Melhora a legibilidade do código** → Se tivéssemos que envolver cada potencial `NullPointerException` ou `ArrayIndexOutOfBoundsException` em `try-catch`, o código ficaria desnecessariamente complexo;  
4. **Execução mais rápida** → O tratamento excessivo de exceções pode impactar o desempenho.


### ⚠️ Características das Unchecked Exceptions:

- Ocorrências inesperadas causadas por erros do programador.  
- O compilador não exige tratamento.  
- Normalmente, indicam problemas lógicos ou falhas no código.  
- Exemplos comuns: Acessar uma posição inválida em um array, tentar acessar um objeto null, divisão por zero, etc.

### 📌 Exemplo de Unchecked Exception

```java
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException
    }
}
```
## 🚨 O código compila normalmente, mas gera um erro em tempo de execução.

### 🔍 Diferença Resumida

| Característica       | Exception (Checked)                       | RuntimeException (Unchecked)           |
|----------------------|-------------------------------------------|----------------------------------------|
| Obrigação de tratar  | Sim (`try-catch` ou `throws`)             | Não obrigatório                        |
| Tipo de erro        | Problemas externos previsíveis | Erros de lógica do programador  |
| Quando ocorre?      | Durante compilação (caso não seja tratada) | Apenas em tempo de execução |
| Exemplos           | `IOException`, `SQLException`, `FileNotFoundException` | `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException` |

### 🛠️ **Quando usar cada uma?**

- **Checked Exceptions** → Use para situações que o programa pode prever e recuperar (ex: arquivo não encontrado, erro de rede).
- **Unchecked Exceptions** → Use quando o erro deveria ter sido evitado pelo programador (ex: acessar índice inválido de array, divisão por zero).

## 🌳 Estrutura da Hierarquia Completa de `Throwable`:

Throwable  
├── Exception  (Exceções verificadas e não verificadas)  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── IOException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── FileNotFoundException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── EOFException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── UnknownHostException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── SocketException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── BindException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ConnectException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NoRouteToHostException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── PortUnreachableException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── SQLException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── RuntimeException  (Exceções não verificadas - unchecked exceptions)  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ArithmeticException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NullPointerException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ArrayIndexOutOfBoundsException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ClassCastException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── IllegalArgumentException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NumberFormatException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── IllegalStateException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── IndexOutOfBoundsException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── StringIndexOutOfBoundsException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── UnsupportedOperationException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ConcurrentModificationException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── InputMismatchException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── MissingResourceException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NoSuchElementException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── InterruptedException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── CloneNotSupportedException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ReflectiveOperationException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ClassNotFoundException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NoSuchMethodException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NoSuchFieldException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── InstantiationException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── IllegalAccessException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── InvocationTargetException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── TimeoutException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ExecutionException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── MalformedURLException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── URISyntaxException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ParseException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── PrinterException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── AWTException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── TransformerException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── XPathExpressionException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── SAXException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── SAXParseException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── JAXBException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── KeyStoreException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── CertificateException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── UnrecoverableKeyException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── GeneralSecurityException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NoSuchAlgorithmException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── KeyManagementException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── SignatureException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── TimeoutException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── DataFormatException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── PrinterException  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── MidiUnavailableException  
│  
├── Error (Erros graves que geralmente não devem ser tratados)  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── VirtualMachineError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── StackOverflowError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── OutOfMemoryError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── InternalError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── UnknownError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── LinkageError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ClassCircularityError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ClassFormatError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── NoClassDefFoundError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── UnsatisfiedLinkError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── VerifyError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── AssertionError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── BootstrapMethodError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ServiceConfigurationError  
│   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── ThreadDeath  

### 💡 **OBS:**
📌 **Não precisa decorar tudo isso!**
* Cada um desses itens podem ocorrer a depender do projeto, regra de negócios, estilo de código e até mesmo falha humana. São inumeras possibilidades de ocorrer algum tipo de `Exception` e ao menos que a sua regra de negócio exija, não é interessante decorar todas ela: o ideal é ir tratando conforme forem surgindo, dessa forma adiquire experiência na páratica e de forma eficaz.

---

## ⚙️ Tratamento de Exceções: `try`, `catch` e `finally`

### 🔹 `try` e `catch`
O bloco `try` contém o código que pode gerar uma exceção. Se uma exceção ocorrer, o `catch` captura e trata o erro.

```java
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso gerará uma ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida! ❌");
        } 
    }
}
```

🔹 `finally`

O bloco `finally` é opcional e sempre será executado, independentemente de a exceção ocorrer ou não. É útil para liberar recursos como arquivos e conexões com banco de dados.

```java
public class ExemploFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Index inválido!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array! ⚠️");
        } finally {
            System.out.println("Finalizando execução do bloco try/catch ✅");
        }
    }
}
```
---
### 🛠️ **Lançando Exceções com `throw`**

Podemos forçar uma exceção manualmente usando `throw`.

```java
public class ExemploThrow {
    static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade insuficiente para acesso! 🚫");
        }
        System.out.println("Acesso permitido! ✅");
    }

    public static void main(String[] args) {
        verificarIdade(16); // Vai lançar uma exceção
    }
}
```
---

### 🏗️ **Criando Exceções Personalizadas**

Podemos criar nossas próprias exceções estendendo a classe Exception.

```java
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public class ExemploExcecaoCustomizada {
    static void validar(int numero) throws MinhaExcecao {
        if (numero < 0) {
            throw new MinhaExcecao("Número negativo não permitido! ⚠️");
        }
    }

    public static void main(String[] args) {
        try {
            validar(-5);
        } catch (MinhaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```
---
### 📝 Resumo Final 🎯

✅ Exceções são eventos inesperados que interrompem o fluxo normal do programa.  
✅ Hierarquia de exceções: Throwable → Exception e Error.  
✅ try/catch/finally: Mecanismo de tratamento para capturar e gerenciar exceções.  
✅ throw: Lança exceções manualmente.  
✅ Exceções personalizadas: Criadas para necessidades específicas.

Agora você está pronto para lidar com exceções em Java de forma eficiente!🚀💡