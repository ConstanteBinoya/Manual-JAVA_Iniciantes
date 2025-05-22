# Guia Prático: Aprofundando o Loop `while` em Java

Bem-vindo(a) ao guia prático sobre o **loop `while` em Java**, elaborado com uma linguagem acessível, exemplos didáticos e dicas valiosas. Este guia foi feito para iniciantes como você, que estão dando os primeiros passos na programação com Java.

---

## 📌 O que é um loop `while`?

O `while` é uma **estrutura de repetição** usada para executar um bloco de código **enquanto** uma determinada condição for verdadeira. Ele é ideal quando **não sabemos previamente** quantas vezes a repetição ocorrerá.

### Sintaxe:

```java
while (condicao) {
    // Bloco de código a ser repetido
}
```

A **condição** é verificada antes de cada execução. Se for `true`, o bloco é executado. Se for `false`, o loop termina.

---

## 🧠 Quando usar `while`?

Use o `while` quando:

* O número de repetições **não é conhecido de antemão**;
* Você precisa **esperar por uma condição** antes de encerrar o loop (ex: leitura do usuário, conexão com servidor etc);
* Quer verificar a condição **antes da primeira execução**.

---

## ✅ Exemplo Simples

Vamos imprimir os números de 1 a 5 com `while`:

```java
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++; // incrementa o contador
        }
    }
}
```

### Saída:

```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

🧠 **Importante**: Se esquecer de incrementar `contador`, o loop será infinito!

---

## ❌ Exemplo de Loop Infinito (cuidado!)

```java
int i = 0;
while (i < 3) {
    System.out.println("Loop eterno!");
    // i++;  // Comentado! Vai rodar pra sempre
}
```

🧠 **Dica**: Sempre garanta que a condição de saída será alcançada.

---

## 🎯 Exemplo com Entrada do Usuário

Vamos fazer um programa que pede a senha até o usuário digitar a correta:

```java
import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "java123";
        String entrada;

        System.out.print("Digite a senha: ");
        entrada = sc.nextLine();

        while (!entrada.equals(senha)) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.print("Digite a senha: ");
            entrada = sc.nextLine();
        }

        System.out.println("Acesso concedido!");
        sc.close();
    }
}
```

### Saída esperada:

```
Digite a senha: admin
Senha incorreta. Tente novamente.
Digite a senha: java123
Acesso concedido!
```

---

## 🧪 Desafio proposto

Crie um programa que:

* Peça números ao usuário;
* Some esses números enquanto o valor digitado **for diferente de zero**;
* Ao digitar zero, o programa mostra o total acumulado e encerra.

💡 Use `while` com entrada do `Scanner` e uma variável `soma`.

---

## 🧰 Boas práticas com `while`

* ⚠️ Evite loops infinitos: sempre tenha uma **condição de parada clara**;
* 🧼 Inicialize suas variáveis fora do loop;
* 🧪 Teste seu código com valores diferentes para validar a lógica.

---

## 📌 Diferença entre `while` e `do-while`

| `while`                      | `do-while`                          |
| ---------------------------- | ----------------------------------- |
| Testa a condição **antes**   | Testa a condição **depois**         |
| Pode **nunca ser executado** | Sempre executa **ao menos uma vez** |

Exemplo com `do-while`:

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## 📚 Conclusão

O `while` é uma ferramenta poderosa que, com prática, se tornará uma de suas principais aliadas na programação. Sempre pense na **condição de saída** e **planeje o fluxo** do loop com clareza.

---

**Bons estudos!**

> "Repetição leva à maestria. Cada linha escrita é um passo rumo ao domínio da lógica."
