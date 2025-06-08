# 🧠 Guia Didático: Wrapper Classes (Types) em Java

## 📌 O que são Wrapper Classes?

As **Wrapper Classes** em Java são classes que encapsulam ("embrulham") os tipos primitivos (`int`, `double`, `char`, etc.) em **objetos**. Isso é útil porque muitos recursos da linguagem Java funcionam apenas com objetos (como coleções `List`, `Set`, etc).
 > São classes equivalentes aos tipos primitivos;

> ✅ **Motivo principal**: tipos primitivos **não possuem métodos**, já as **Wrapper Classes sim, possuem métodos**.

---

## 🧩 Tabela de Equivalência entre Wrapper Classes e Tipos Primitivos:

| Tipo Primitivo | Wrapper Class |
| -------------- | ------------- |
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `char`         | `Character`   |
| `boolean`      | `Boolean`     |

---

## 🛠 Exemplo prático

```java
int x = 10;                // "x" é do tipo primitivo
Integer y = x;             // Boxing: primitivo -> objeto
int z = y;                 // Unboxing: objeto -> primitivo

System.out.println(y);     // imprime 10 (objeto Integer)
System.out.println(z + 5); // imprime 15
```

### 🔁 Boxing e Unboxing

* **Boxing**: conversão automática de um tipo primitivo para um objeto wrapper.
* **Unboxing**: conversão automática de um wrapper para tipo primitivo.

> Em Java moderno (5+), isso acontece automaticamente (Autoboxing e Auto-unboxing).

---

## 💡 Por que usar?

### ✅ Exemplo real com `List`

```java
import java.util.*;

public class ExemploWrapper {
    public static void main(String[] args) {
        // Criando uma lista de números inteiros.
        // OBS: List aceita apenas OBJETOS, por isso usamos Integer em vez de int.
        List<Integer> numeros = new ArrayList<>();

        // Aqui acontece o "autoboxing":
        // Java converte automaticamente o valor 10 (int) em um objeto Integer.
        numeros.add(10);   // int -> Integer
        numeros.add(20);   // int -> Integer

        // Quando pegamos os elementos da lista, eles ainda são objetos (Integer).
        // Porém, na operação de soma, Java faz "auto-unboxing":
        // Converte Integer -> int automaticamente para permitir a soma.
        int soma = numeros.get(0) + numeros.get(1); // Integer -> int (auto-unboxing)

        System.out.println("Soma: " + soma); // imprime 30
    }
}

```
### ❓ Mas por que preciso usar `Integer` em vez de `int`?
Porque a interface `List` e suas implementações (`ArrayList`, `LinkedList`, etc.) só trabalham com objetos — e não com tipos primitivos como `int`, `double`, `char` etc.


### 🧠 Sem wrapper:

```java
List<int> lista = new ArrayList<>(); // ERRO: tipos primitivos não são permitidos
```
 > A grande utilidade de Wrapper Classes é permitir que tipos primitivos sejam usados como objetos, especialmente quando você precisa usar estruturas como `List`, `Map`, ou APIs modernas de Java que exigem objetos.

---

## 🎯 Métodos úteis das Wrappers

```java
Integer x = Integer.parseInt("123"); // String -> int
Double d = Double.valueOf("10.5");    // String -> Double

System.out.println(x + 1);   // 124
System.out.println(d * 2);   // 21.0
```

> ℹ️ Dica: `valueOf()` retorna um objeto wrapper, enquanto `parseInt()` retorna o tipo primitivo.

---

## 🔐 Boas práticas

* Prefira **tipos primitivos** sempre que não precisar usar coleções ou métodos de objeto (economia de memória).
* Use **wrappers** quando:

  * Trabalhar com listas (`List<Integer>`)
  * Usar APIs genéricas que exigem objetos
  * Precisar de métodos utilitários (ex: `Integer.parseInt()`)

---

## 🧪 Exercício proposto

Crie um programa que:

1. Leia uma lista de números digitados pelo usuário.
2. Guarde os números em uma `List<Integer>`.
3. Some todos os números e mostre o resultado.

```java
import java.util.*;

public class SomaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Quantos números deseja digitar?");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        int soma = 0;
        for (Integer num : numeros) {
            soma += num; // Auto-unboxing
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
```

---

## 🧭 Conclusão

As **Wrapper Classes** são essenciais quando precisamos tratar dados primitivos como objetos. Elas oferecem métodos úteis e permitem a integração com as APIs modernas de Java (como `List`, `Stream`, etc.). Saber quando e como usá-las é parte importante do caminho para uma programação Java mais profissional ✨.
