# 🧠 Guia de Métodos (Funções) em Java 

## O que são métodos (ou funções)? 🤔

Em Java, **métodos** também conhecidos como funções. Eles são blocos de código reutilizáveis que executam uma tarefa específica. Você pode invocar (chamar) um método sempre que precisar daquela tarefa executada.

### Para que servem os métodos? 🎯

* **Organização**: separam lógicas distintas em blocos claros.
* **Reutilização**: podem ser chamados várias vezes sem reescrever código.
* **Manutenção**: facilitam leitura e modificação do código.
* **Evita repetição**: o famoso princípio DRY - *Don't Repeat Yourself* (Não se repita).

### Anatomia de um método 🧩

```java
[modificador] tipoDeRetorno nomeDoMetodo([parametros]) {
    // corpo do método, a lógica, o que ele faz...
    return valor; // se tiver retorno (tipo de saída: o que foi processado no método).
}
```

### Exemplo 1: método que imprime uma mensagem 🗣️

```java
public class ExemploMetodoSimples {
    public static void digaOla() {
        System.out.println("Olá, mundo!");
    }

    public static void main(String[] args) {
        digaOla();
    }
}
```

### Exemplo 2: método com retorno 🔁

```java
import java.util.Scanner;

public class ExemploMetodoComRetorno {
    public static int dobrar(int numero) {
        return numero * 2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int N = sc.nextInt();

        int resultado = dobrar(N);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
```

### Exemplo 3: método com múltiplos parâmetros 🧾

```java
import java.util.Scanner;

public class ExemploMetodoComParametros {
    public static void saudacaoPersonalizada(String nome, int idade) {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        saudacaoPersonalizada(nome, idade);

        sc.close();
    }
}
```

### Palavra-chave `return` ⬅️

É usada para:

* Indicar o valor que o método está devolvendo.
* Encerrar a execução do método.

### Tipos de métodos 🧪

| Tipo               | Retorno                           | Exemplo                        |
| ------------------ | --------------------------------- | ------------------------------ |
| Void (sem retorno) | Nenhum                            | `public static void digaOla()` |
| Com retorno        | Qualquer tipo (int, String, etc.) | `public static int somar()`    |

### Boas práticas 🧼

* Dê nomes **significativos** e **verbais** aos métodos: `calcularMedia`, `enviarEmail`, `validarCPF`.
* Um método deve fazer apenas **uma coisa**.
* Evite métodos muito longos.
* Use parâmetros quando precisar de dados externos.

### Exemplo prático da vida real 🛒

Imagine um sistema de supermercado:

* `calcularDesconto(double preco, double percentual)` → retorna o valor com desconto.
* `imprimirNotaFiscal()` → imprime os dados da compra.
* `verificarEstoque(String produto)` → retorna se o produto está disponível.

### Dica de Mestre 👨‍🏫

> "Métodos são como receitas de bolo: você escreve uma vez, segue sempre que quiser o mesmo resultado. Só muda os ingredientes (parâmetros), e pronto! 🎂"

