# Guia de Programação em Java: Loop `do-while`

> **Nível:** Iniciante → Intermediário

---

## 📂 Capítulo: Estrutura de Repetição `do-while`

---

### ✨ Objetivo do Capítulo

* Entender a sintaxe e a finalidade do loop `do-while`.
* Comparar `do-while` com `while`.
* Aplicar esse tipo de estrutura em cenários onde a execução mínima da tarefa é garantida.

---

## ❓ O que é o `do-while`?

O `do-while` é uma estrutura de repetição (loop) em Java que **executa um bloco de código ao menos uma vez**, e depois repete esse bloco **enquanto** uma condição for verdadeira.

### 🔄 Sintaxe:

```java
do {
    // bloco de código que será executado ao menos uma vez
} while (condicao);
```

### ⚡ Exemplo Básico:

```java
int contador = 1;
do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador <= 5);
```

### 📅 Saída:

```
Contador: 1
Contador: 2
Contador: 3
Contador: 4
Contador: 5
```

---

## 🔍 Comparando `while` e `do-while`

| Característica        | `while`                       | `do-while`                        |
| --------------------- | ----------------------------- | --------------------------------- |
| Verifica a condição   | Antes de executar o bloco     | Depois de executar o bloco        |
| Executa pelo menos 1x | Não (pode não executar nunca) | Sim (sempre executa ao menos uma) |
| Uso comum             | Repetição condicional         | Menu, senhas, validação inicial   |

---

## 🚀 Quando usar `do-while`?

Use `do-while` quando:

* **Você precisa garantir que o bloco seja executado pelo menos uma vez**.
* Situações onde a entrada do usuário é avaliada **após** mostrar um menu ou instruções.

### 🎮 Exemplo: Menu de opções

```java
import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Ajuda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: System.out.println("Iniciando..."); break;
                case 2: System.out.println("Ajuda: escolha 1 ou 0."); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
```

---

## 🔧 Dicas de mestre:

1. **Use `do-while` quando quiser testar primeiro e validar depois.**
2. **Sempre inclua uma condição de parada.** Loops infinitos consomem recursos desnecessariamente.
3. **Evite abusar da execução garantida.** Certifique-se de que a execução inicial não causará problemas lógicos.

---

## 💼 Desafio para Praticar

Crie um programa que:

* Peça ao usuário para digitar uma senha.
* A senha correta é "java123".
* Enquanto a senha estiver incorreta, o programa deve pedir novamente.
* Quando o usuário acertar, deve mostrar "Acesso liberado!"

---

## 📆 Resumo Rápido

* `do-while` executa **pelo menos uma vez**.
* A verificação ocorre **após** a primeira execução.
* Ideal para menus e validações.
* Cuidado com **loops infinitos**.
