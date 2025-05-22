# Guia Prático de Java para Iniciantes

Seja bem-vindo a mais um capítulo da nossa jornada Java!
Neste guia, exploraremos o **loop `for`**, uma das estruturas mais comuns e poderosas para repetições com controle total do início, fim e incremento.

---

## ✨ Visão Geral

O loop `for` é geralmente usado quando **sabemos exatamente quantas vezes** desejamos que o código repita.

```java
for (inicialização; condição; incremento) {
    // Bloco de código a ser repetido
}
```

### Exemplo 1: Contagem de 1 a 5

```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }
    }
}
```

### Explicação:

* **`int i = 1`**: inicializa a variável de controle.
* **`i <= 5`**: repete enquanto a condição for verdadeira.
* **`i++`**: incrementa `i` a cada ciclo.

---

## ✅ Características do `for`

| Característica     | Descrição                                                        |
| ------------------ | ---------------------------------------------------------------- |
| Estrutura Compacta | Tudo acontece em uma linha: inicialização, condição e incremento |
| Uso Clássico       | Ideal para **laços contáveis** (ex: imprimir de 1 a 100)         |
| Flexibilidade      | Pode ser usado com arrays, listas e mais                         |

---

## 🔎 Comparativo: `for` vs `while` vs `do-while`

| Situação                                                             | Escolha Ideal |
| -------------------------------------------------------------------- | ------------- |
| Sabe o número exato de repetições                                    | `for`         |
| Não sabe quantas vezes vai repetir                                   | `while`       |
| Precisa executar pelo menos uma vez, mesmo que a condição seja falsa | `do-while`    |

---

## ✨ Exemplo com `for` Descrescente

```java
for (int i = 10; i >= 1; i--) {
    System.out.println("Contagem: " + i);
}
```

---

## 🔹 Exemplo Avançado: Somar os pares de 1 a 10

```java
public class SomaPares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos pares de 1 a 10: " + soma);
    }
}
```

---

## 🔍 Dicas de Uso:

* Se você vai iterar uma lista ou array com índice, `for` é ideal.
* Use nomes de variáveis significativos em contextos mais complexos.
* Evite aninhamentos profundos de `for` sem necessidade.

---

## 🎮 Desafio Prático

**Objetivo:** Imprima a tabuada de um número escolhido pelo usuário.

### Dica:

Use `Scanner` para ler a entrada do usuário.

```java
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
```

---

## 🎓 Conclusão

O loop `for` é direto, elegante e muito eficaz para laços controlados. Saber quando utilizá-lo, em comparação ao `while` ou `do-while`, torna seu código mais legível e profissional.
