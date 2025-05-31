# 🧠 Guia Prático: Arrays (Vetores) em Java

## 📌 O que são Arrays?

 > Arrays (ou vetores) são **estruturas de dados** que armazenam **múltiplos valores do mesmo tipo** em uma única variável.
  > * É como se fosse um "conjunto de variáveis".

Imagine um **estojo com 5 canetas**:

 * Em vez de criar 5 variáveis (`caneta1`, `caneta2`, ...), usamos um array de canetas!

### 📦 Declaração de um Array

```java
int[] numeros = new int[5];
// int >>> tipo;
// [] >>> indicador de que se trata de um array;
// numeros >>> nome da array;
// new >>> intanciador do array enquanto objeto;
// int[5] >>> Tipo e quantidade de itens que o array comportará.
```
👉 Aqui, criamos um array chamado `numeros` com **5 espaços**, todos do tipo `int`.

 > 💡 OBS: O tipo à esquerda é uma redundância (sintática obrigatória) do tipo que será armazenado no array.
 
* ✅ **Sim, é uma redundância proposital, exigida pela tipagem estática e explícita do Java.**
   * Mesmo que o tipo já esteja implícito na parte direita (new String[N]), o compilador exige que você o diga também à esquerda, como forma de segurança e clareza.

---

### 🛠️ Inicialização de um Array

```java
int[] notas = {8, 7, 9, 10, 6};
```

👉 Criamos e já preenchemos o array `notas` com 5 valores.

---

### 🎯 Acessando Elementos

Os índices começam em **0** (isso quer dizer que o primeiro elemento de um array estará no índice {posição} "0"):

```java
int[] notas = {8, 7, 9, 10, 6};

System.out.println(notas[0]); // Mostra 8
System.out.println(notas[3]); // Mostra 10
```

---

### ✍️ Modificando Elementos

```java
int[] notas = {8, 7, 9, 10, 6};

notas[1] = 10; // Substitui o 7 por 10
```

---


### 📏 Tamanho de um Array

```java
System.out.println(notas.length); // Mostra 5
```

---

## 🧠 Qual é a relação entre `for` e `arrays`?

 > O `for` é um instrumento de repetição, e o `array` é uma estrutura com múltiplos elementos acessíveis por índice.
 > 👉 A união dos dois permite iterar (repetir ações) sobre cada item do `array` de maneira automática e controlada.

### 🎯 Por que o `for` é tão usado com `arrays`?

Imagine que você tenha um `array` com 100 números:
```java
int[] numeros = new int[100];
```
❌ Você não vai fazer:
```java
System.out.println(numeros[0]);
System.out.println(numeros[1]);
System.out.println(numeros[2]);
// ...
```
🤯 Seria inviável!

 > 💡 Em vez disso, usamos um loop `for` para percorrer todos os elementos de forma elegante e automática.


### 🔁 Percorrendo um `Array` com `for`

```java
for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota: " + notas[i]);
}
```
 > 📌 Aqui, o i é o índice que usamos para acessar cada posição do array.

 ---

 ## 🎯 **`for-each`**: versão simplificada do `for` tradicional (mais elegante)

 ## 🔁 Estrutura geral do `for-each`
 ```java
for (tipo variavel : array) {
    // corpo do loop
}
```

### 🧩 Vamos decompor parte por parte:
```java
for (int nota : notas) {
    System.out.println("Nota: " + nota);
}
```
**Agora entenda cada pedacinho:**

### 🔹 `for`

**Palavra-chave que inicia o laço de repetição.**
É o mesmo `for` que já conhecemos, mas com uma sintaxe especial para coleções (como arrays, `ArraysList`, etc).

---

### 🔹 `(int nota : notas)`  
Essa parte é a alma do `for-each`, e se divide em:

| Parte | Explicação |
|-------|------------|
| `int` | Tipo de dado do **elemento do array**. Neste caso, `notas` é `int[]`. |
| `nota` | Nome da **variável temporária** que vai receber, a cada volta, um valor. |
| `:` | Lê-se como **"para cada"**. |
| `notas` | O **array (ou coleção)** que está sendo percorrido. |

🧠 **Lê-se assim**:  
> “Para cada `int nota` em `notas`, execute o que estiver no bloco do `for`.”

---

### 🔹 { ... }
O bloco de código que será executado a cada volta do laço (iterações).
Aqui você escreve o que fazer com cada elemento (exibir, somar, etc.).

---

### 🛠 Exemplo completo comentado
```java
public class ExemploForEach {
    public static void main(String[] args) {
        int[] notas = {8, 9, 7, 10};

        // Para cada nota dentro do array 'notas'
        for (int nota : notas) {
            // Exibe o valor da nota atual
            System.out.println("Nota: " + nota);
        }
    }
}
```
📥 **Fluxo de execução:**
1. nota recebe 8 → imprime
2. nota recebe 9 → imprime
3. nota recebe 7 → imprime
4. nota recebe 10 → imprime

---

### 🔁 Percorrendo com for-each 
```java
for (int nota : notas) {
    System.out.println("Nota: " + nota);
}
```

### 💡 Exemplo prático: Média de notas

```java
public class MediaNotas {
    public static void main(String[] args) {
        int[] notas = {8, 7, 9, 10, 6};

        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;
        System.out.println("Média: " + media);
    }
}
```

### 🎯 Quando usar `for-each`:
| Situação                             | Use `for-each`?                           |
| ------------------------------------ | ----------------------------------------- |
| Quer apenas os **valores**           | ✅ Sim                                     |
| Precisa do **índice (posição)**      | ❌ Não (use `for` tradicional)             |
| Vai **modificar** elementos do array | ❌ Evite (modificações precisam de índice) |

---

### ⚠️ Limitações do for-each

1. ❌ Não permite alterar o valor diretamente no array:
```java
for (int nota : notas) {
    nota = 0; // isso NÃO altera o array original
}
```
2. ❌ Não acessa o índice (posição atual) como o for (int i = 0...).

---

### 🧠 Dica extra: for-each com outros tipos
Funciona com arrays de qualquer tipo:
```java
String[] nomes = {"Ana", "Bruno", "Carlos"};

for (String nome : nomes) {
    System.out.println("Olá, " + nome + "!");
}
```

---

### 📦 Resumo final:

| Elemento           | Função                                                  |
| ------------------ | ------------------------------------------------------- |
| `for`              | Início do laço                                          |
| `(tipo var : arr)` | Para cada elemento do array, com tipo e nome temporário |
| `{ ... }`          | Bloco de código a ser executado a cada volta            |

---

## ⚔️ `for` tradicional vs. `for-each` em Java

| Critério                          | `for` tradicional                           | `for-each`                                       |
| --------------------------------- | ------------------------------------------- | ------------------------------------------------ |
| ✅ **Acesso ao índice**            | Sim (`i`, `i+1`, `i-1`, etc.)               | ❌ Não tem acesso ao índice                       |
| ✅ **Controle total do loop**      | Sim (pode pular, retroceder, alterar passo) | ❌ Laço sequencial fixo (sempre do início ao fim) |
| ✅ **Alteração de valores**        | Sim (acessando via índice)                  | ❌ Só leitura dos valores                         |
| ✅ **Trabalha com parte do array** | Sim (ex: de 2 a 5)                          | ❌ Sempre percorre o array inteiro                |
| ✅ **Performance**                 | Levemente melhor em situações complexas     | Ótima para leitura simples                       |
| ✅ **Leitura**                     | Um pouco mais verboso                       | Muito mais limpo e legível                       |

---

### 🧠 Conclusão prática

 * 🔧 Use **for tradicional** quando precisar de:
   * Índice
   * Modificar elementos
   * Fazer controle refinado do fluxo (pular posições, inverter, filtrar, etc.)

* ✨ Use **for-each** quando:
  * Só precisa ler os valores
  * Quer uma sintaxe mais simples e limpa
  * Não precisa alterar nem acessar posição

---

### 💬 Então... o `for` tradicional é mais efetivo?
🟡 Sim, em termos de flexibilidade e controle.   
🟢 Mas o `for-each` é mais elegante e legível para tarefas simples e frequentes.

🧠 Ou seja:

 > “O `for` tradicional é mais poderoso; o `for-each` é mais prático.”

---

### 🧮 `Arrays` no dia a dia

* 📅 Dias da semana = array de 7 strings: `"Segunda", "Terça"...`
* 🎒 Mochila de itens = array de objetos (ex: livros)
* 🛒 Carrinho de compras = array de produtos

### ⚠️ Cuidados com Arrays

* ❌ `ArrayIndexOutOfBoundsException`: acessar um índice que não existe.
* Arrays têm **tamanho fixo** depois de criados.

### 🧰 Dicas bônus

* Para arrays dinâmicos, use `ArrayList` (veremos depois!)
* Arrays de objetos também são possíveis:

```java
String[] nomes = new String[]{"Ana", "Bruno", "Carlos"};
```

---

### 📚 Exercícios sugeridos

1. Criar um array de 10 inteiros e exibir todos os elementos.
2. Calcular a média dos valores de um array.
3. Encontrar o maior e o menor número em um array.
4. Contar quantos números pares há em um array.
5. Inverter os elementos de um array.

