# Guia para Iniciantes em Java: Estruturas Condicionais

## 🧠 Objetivo

Neste guia, vamos aprender sobre **estruturas condicionais** em Java, que são fundamentais para controlar o fluxo do programa com base em decisões (condições).

## 📘 O que são estruturas condicionais?

São blocos de código que permitem que o programa **tome decisões**, ou seja, execute comandos diferentes dependendo de uma condição ser verdadeira (`true`) ou falsa (`false`).

---

## 🛠️ Principais Estruturas

### 1. `if` (se)

```java
if (condição) {
    // código a ser executado se a condição for verdadeira
}
```

📌 Exemplo:

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

### 2. `if...else`

```java
if (condição) {
    // código se for verdadeiro
} else {
    // código se for falso
}
```

📌 Exemplo:

```java
int nota = 6;

if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

### 3. `if...else if...else`

Permite testar **várias condições** em sequência.

```java
if (condição1) {
    // código 1
} else if (condição2) {
    // código 2
} else {
    // código padrão
}
```

📌 Exemplo:

```java
int nota = 8;

if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Bom");
} else {
    System.out.println("Precisa melhorar");
}
```

### 4. `switch` (escolha)

Ideal quando há **múltiplas opções fixas** para testar.

```java
switch (variavel) {
    case valor1:
        // ação
        break;
    case valor2:
        // outra ação
        break;
    default:
        // ação padrão
}
```

📌 Exemplo:

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Outro dia");
}
```

---

## 🧩 Dicas de Ouro

🔹 **Sempre use chaves `{}`** mesmo em `if` de uma linha. Ajuda a evitar erros!

🔹 **Cuidado com `==` em Strings**! Use `.equals()` ou `.equalsIgnoreCase()`:

```java
String nome = "java";
if (nome.equals("java")) {
    System.out.println("Linguagem Java!");
}
```

🔹 O `switch` funciona com:

* `int`, `short`, `byte`, `char`
* `enum`
* `String`
* (A partir do Java 14: `switch` também pode retornar valores com `yield`)

---

## 🎯 Exercício Sugerido

> Crie um programa que peça ao usuário a idade e diga:
>
> * Se for menor de 12: "Criança"
> * Entre 12 e 17: "Adolescente"
> * Entre 18 e 59: "Adulto"
> * 60 ou mais: "Idoso"

---

## ✅ Conclusão

As **estruturas condicionais** permitem **tomadas de decisão automáticas** em um sistema. Com `if`, `else`, `else if` e `switch`, você conseguirá criar programas mais inteligentes e dinâmicos!

> Continue praticando com situações do dia a dia: semáforos, notas escolares, cardápios, etc.
