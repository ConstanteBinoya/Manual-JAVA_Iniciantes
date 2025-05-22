# Guia Java para Iniciantes — Estruturas de Repetição

## 📚 O que são Estruturas de Repetição?

Estruturas de repetição, ou laços de repetição, são blocos de código que se repetem enquanto uma condição for verdadeira. Elas são ótimas para quando você quer executar a mesma instrução várias vezes sem ter que reescrever o código.

### 🔄 Tipos de laços em Java:

1. `while`
2. `do-while`
3. `for`
4. `foreach` (usado principalmente com arrays e coleções)

---

## 1. `while`

Usado quando não sabemos quantas vezes o laço vai se repetir, mas sabemos a condição de parada.

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Valor de contador: " + contador);
    contador++;
}
```

**Explicação:** Enquanto `contador` for menor que 5, o bloco vai continuar executando.

---

## 2. `do-while`

Parecido com o `while`, mas garante que o bloco será executado **ao menos uma vez**.

```java
int numero = 1;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero <= 3);
```

**Diferencial:** Executa primeiro, verifica a condição depois.

---

## 3. `for`

Ótimo quando sabemos exatamente quantas vezes queremos repetir algo.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i vale: " + i);
}
```

**Estrutura:**

* Início: `int i = 0`
* Condição: `i < 5`
* Incremento: `i++`

---

## 4. `foreach` (laço aprimorado)

Usado com arrays e coleções. Muito usado quando você não precisa do índice, apenas do valor.

```java
String[] frutas = {"Maçã", "Banana", "Manga"};
for (String fruta : frutas) {
    System.out.println("Fruta: " + fruta);
}
```

---

## ⚡ Dicas Práticas:

* Cuidado com laços infinitos (`while(true)`) que nunca terminam.
* Use `break` para sair de um laço antes do tempo.
* Use `continue` para pular para a próxima iteração do laço.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // Pula o valor 3
    System.out.println(i);
}
```

```java
for (int i = 1; i <= 5; i++) {
    if (i == 4) break; // Sai do laço ao chegar no 4
    System.out.println(i);
}
```

---

## 🖊️ Exercício Rápido:

**Desafio:** Crie um programa que leia 5 números do usuário e calcule a média deles usando um laço.

```java
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        double media = soma / 5;
        System.out.printf("A média é: %.2f\n", media);
        sc.close();
    }
}
```

---

## 📚 Conclusão

As estruturas de repetição são poderosas para automatizar tarefas. Saber escolher entre `while`, `do-while`, `for` e `foreach` depende da necessidade e da situação. Pratique cada uma com pequenos programas para fixar o aprendizado.
