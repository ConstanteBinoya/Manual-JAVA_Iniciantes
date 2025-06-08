# 📚 Guia Didático: Listas em Java

## 🧾 O que é uma Lista?

Uma **lista** é uma estrutura de dados que armazena uma coleção ordenada de elementos. Em Java, a interface `List` é usada para representar listas e está no pacote `java.util`.

> A principal implementação de `List` é a `ArrayList` — uma lista baseada em arrays redimensionáveis.

## ✅ Listas em Java sempre trabalham com **objetos**, nunca com tipos primitivos diretamente.

### 🔍 Por que isso acontece?
A interface `List<T>` em Java faz parte do framework de coleções, que é baseado em objetos. Como tipos primitivos (`int`, `double`, `char`, etc.) não são objetos, eles não podem ser usados diretamente em listas.

### 🧠 Lista é uma estrutura de dados:
 * Homogênea (dados do mesmo tipo)
 * Ordenada (elementos acessados por meio de posições)
 * Inicia vazia, e seus elementos são alocados sob demanda
 * Cada elemento ocupa um "nó" (ou nodo) da lista

---

### 🧪 Exemplo Básico com `ArrayList`

```java
import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");

        System.out.println(nomes); // [Maria, João, Ana]
    }
}
```

### 🔍 Como declarar uma lista em Java?

Para declarar uma lista corretamente em Java, seguimos esta estrutura:

```java
List<Tipo> nomeDaLista = new ArrayList<>();
```

🔎 Vamos entender cada parte:

| Parte do código     | Explicação                                                     |
| ------------------- | -------------------------------------------------------------- |
| `List<String>`      | Interface que representa uma lista de objetos do tipo `String` |
| `nomeDaLista`       | Nome da variável que representa a lista                        |
| `new ArrayList<>()` | Cria uma nova instância (objeto) da classe `ArrayList`         |

➡️ O uso da **interface `List`** do lado esquerdo promove boas práticas, pois permite trocar facilmente a implementação (`ArrayList`, `LinkedList`, etc.) se necessário no futuro.

🧠 Exemplos com outros tipos:

```java
List<Integer> numeros = new ArrayList<>(); // Lista de inteiros
List<Double> notas = new ArrayList<>();    // Lista de decimais
List<Boolean> flags = new ArrayList<>();   // Lista de valores booleanos
```

---

### 🧠 Por que usar `List` ao invés de arrays?

| Arrays           | Listas (ArrayList)                |
| ---------------- | --------------------------------- |
| Tamanho fixo     | Tamanho dinâmico                  |
| Menos métodos    | Métodos prontos p/ manipulação    |
| Tipos primitivos | Wrapper (ex: `Integer`, `Double`) |

---

### 🧰 Principais métodos da interface `List`

| Método                                              | Ação                                                                 |
|-----------------------------------------------------|----------------------------------------------------------------------|
| `size()`                                            | Retorna o tamanho da lista                                           |
| `get(index)`                                        | Retorna o elemento da posição especificada                          |
| `set(index, obj)`      | Substitui o valor na posição   |
| `add(obj)`                                          | Adiciona elemento ao final da lista                                 |
| `add(index, obj)`                                   | Insere elemento na posição específica                               |
| `remove(obj)`                                       | Remove a primeira ocorrência do elemento especificado               |
| `remove(index)`                                     | Remove o elemento da posição especificada                           |
| `removeIf(Predicate)`                               | Remove todos os elementos que satisfazem uma condição               |
| `indexOf(obj)`                                      | Retorna o índice da primeira ocorrência do elemento                 |
| `lastIndexOf(obj)`                                  | Retorna o índice da última ocorrência do elemento                   |
| `list.stream().filter(x -> x > 4).collect(...)`     | Filtra a lista com base em uma condição e retorna nova lista       |
| `list.stream().filter(x -> x > 4).findFirst()`      | Encontra a primeira ocorrência com base em uma condição             |
| `contains(obj)`        | Verifica se o elemento existe  |
| `clear()`              | Esvazia a lista                |


---

## 🔁 Iterando sobre uma Lista

### 🔹 Usando `for-each`

```java
for (String nome : nomes) {
    System.out.println(nome);
}
```

### 🔹 Usando índice

```java
for (int i = 0; i < nomes.size(); i++) {
    System.out.println(nomes.get(i));
}
```

---

## 🎯 Exemplo prático: cadastro de produtos

```java
import java.util.*;

public class CadastroProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> produtos = new ArrayList<>();

        System.out.println("Quantos produtos deseja cadastrar?");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            produtos.add(sc.nextLine());
        }

        System.out.println("\nProdutos cadastrados:");
        for (String p : produtos) {
            System.out.println("- " + p);
        }

        sc.close();
    }
}
```

---

## 💡 Boas práticas

* Prefira `List<tipo>` ao invés de arrays quando:

    * você não souber quantos elementos terá
    * precisar adicionar/remover elementos com frequência
* Sempre use wrappers com `List` (`Integer`, `Double`, etc)
* Utilize a interface `List` no lugar da implementação concreta (`ArrayList`) no lado esquerdo:

  ```java
  List<String> nomes = new ArrayList<>();
  ```

---

## ❓ Na declaração de uma lista, sempre utilizarei o `ArrayList`?

**Não obrigatoriamente.** Embora `ArrayList` seja a implementação mais comum, **existem outras implementações** da interface `List` em Java, cada uma com características e usos específicos.

---

### ⚙️ Por que usamos `List` no lado esquerdo?

```java
List<String> nomes = new ArrayList<>();
```

✅ Isso é uma **boa prática de programação** chamada **programar para a interface, não para a implementação**.
Ou seja:

* **`List`** define o **contrato**: o que a lista pode fazer (`add`, `remove`, `get`, etc.)
* **`ArrayList`** é uma forma específica de fazer (usa array dinâmico internamente)

➡️ Se no futuro você quiser trocar `ArrayList` por outra implementação como `LinkedList`, não precisará alterar o restante do código, apenas o `new`:

```java
List<String> nomes = new LinkedList<>();
```

---

### 🧰 Outras implementações comuns de `List`

| Implementação | Características principais                                     |
| ------------- | -------------------------------------------------------------- |
| `ArrayList`   | Rápido acesso por índice, ideal para leitura e adição ao final |
| `LinkedList`  | Melhora performance em inserções/remoções no meio da lista     |
| `Vector`      | Versão antiga sincronizada (pouco usada atualmente)            |
| `Stack`       | Pilha baseada em lista (métodos `push`, `pop`)                 |

---

### ✅ Quando usar `ArrayList`?

Use `ArrayList` quando:

* você precisa de **acesso rápido por índice**
* vai **adicionar elementos principalmente ao final**
* **não há necessidade de inserir/remover frequentemente** no meio da lista

---

### ✅ Quando usar `LinkedList`?

Use `LinkedList` quando:

* você precisa **inserir ou remover frequentemente no meio ou início** da lista
* **não precisa acessar por índice com frequência** (é mais lento nesse caso)

---

### 📌 Observação sobre tipos primitivos

Listas **não funcionam com tipos primitivos** (`int`, `double`, etc). Para usá-los, você precisa usar as **wrapper classes**:

```java
List<Integer> numeros = new ArrayList<>();
numeros.add(10); // Autoboxing em ação!
```

---

### ✅ Resumo

* `List` é uma interface para coleções ordenadas.
* `ArrayList` é a implementação mais usada.
* Oferece vários métodos práticos para manipulação.
* Requer objetos (não funciona com tipos primitivos diretamente).

---

## 🔍 Complementos úteis

### 🔎 Busca em uma lista com `.contains()`

```java
List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Carlos");
nomes.add("Bianca");

if (nomes.contains("Carlos")) {
    System.out.println("Carlos está na lista!");
}
```

---

### 📊 Ordenação com `Collections.sort()`

O `Collections.sort()` usa como critério principal a ordem natural dos elementos da lista — ou seja, ele depende de que os elementos implementem a interface `Comparable<T>`.

✅ **Ordem natural: o que significa?**   
A ordem natural é o critério padrão de comparação entre objetos definido pelo método `compareTo()` da interface `Comparable`.

| Tipo de dado     | Ordem natural usada por `Collections.sort()` |
| ---------------- | -------------------------------------------- |
| `Integer`        | Ordem crescente numérica (`1, 2, 3...`)      |
| `String`         | Ordem alfabética (lexicográfica)             |
| `Double`         | Ordem crescente decimal (`1.2, 1.5, 2.0...`) |
| Objetos próprios | Precisa implementar `Comparable<T>`          |

Veja os exemplos:

```java
import java.util.*;

List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Carlos");
nomes.add("Bianca");

Collections.sort(nomes);
System.out.println(nomes); // [Ana, Bianca, Carlos]
```
```java
import java.util.*;

public class ExemploNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(9, 3, 7, 1);
        Collections.sort(numeros);
        System.out.println(numeros); // [1, 3, 7, 9]
    }
}
```

---

### ❌ Remoção condicional com `removeIf`

```java
List<String> nomes = new ArrayList<>();
nomes.add("Pedro");
nomes.add("Paula");
nomes.add("Ana");

nomes.removeIf(nome -> nome.startsWith("P"));
System.out.println(nomes); // [Ana]
```

### 🧱 Lista de objetos (ex: `Produto`)

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 80.00));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
```

 > Esse uso é muito comum em sistemas reais como: carrinhos de compras, listagens de alunos, inventários etc.

## 😉 Sugestão de estudo adicional: 
* Ordenações de objetos (`Comparator`);   
* Filtros com `Stream`;   
* Mapas (`Map<K, V>`). 

