# Guia de Controle de Fluxo em Java

## 📌 O que é Controle de Fluxo?

Controle de fluxo é o conjunto de instruções que define **como o seu programa irá se comportar em diferentes situações**. Com ele, você consegue:

* Tomar decisões (ex: "se for maior de idade, pode entrar")
* Repetir ações (ex: "repita até acertar a senha")
* Escolher entre múltiplos caminhos

---

## 🔀 Estruturas Condicionais (Decisões)

### 1. `if`, `else if`, `else`

```java
int idade = 18;

if (idade < 18) {
    System.out.println("Menor de idade");
} else if (idade == 18) {
    System.out.println("Tem exatamente 18 anos");
} else {
    System.out.println("Maior de idade");
}
```

🧠 *Use quando quiser que o programa tome decisões diferentes dependendo de uma condição.*

---

### 2. `switch` (Escolhas múltiplas)

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

🧠 *Use quando tiver ****várias opções fixas**** para comparar.*

---

## 🔁 Estruturas de Repetição (Laços ou loops)

### 1. `while`

```java
int contador = 0;

while (contador < 3) {
    System.out.println("Contando: " + contador);
    contador++;
}
```

🧠 *Use quando você ****não sabe exatamente**** quantas vezes a repetição vai acontecer.*

---

### 2. `do-while`

```java
int numero = 0;

do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero < 3);
```

🧠 *Garante que o bloco será executado ****pelo menos uma vez****, mesmo que a condição seja falsa.*

---

### 3. `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i = " + i);
}
```

🧠 *Ideal para repetições com ****início, fim e passo bem definidos****.*

---

## ⛔ Palavras-chave de controle

* `break`: Interrompe o loop ou o `switch` imediatamente
* `continue`: Pula para a **próxima repetição** do loop

### Exemplo com `continue` e `break`

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) continue; // pula o 3
    if (i == 7) break;    // para tudo no 7
    System.out.println(i);
}
```

---

## 🎓 Dica do Mentor

> "Controle de fluxo é como o GPS do seu código: ele decide por onde ir, quando virar, e quando parar. Pratique com exemplos do seu dia a dia: idade, senha, tentativas, dias da semana, etc."

---

## ✅ Prática sugerida

1. Faça um programa que:

   * Pergunta a idade da pessoa
   * Diz se ela pode votar
   * Pergunta o turno (M/V/N) e imprime a saudação apropriada ("Bom dia", "Boa tarde", "Boa noite")
2. Crie um contador de 1 a 10 usando os 3 tipos de loop: `while`, `do-while`, `for`

