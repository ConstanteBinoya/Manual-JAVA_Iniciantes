
# 📘 Guia de Variáveis e Operadores em Java


## 📌 Sumário

1. [O que são variáveis?](#1-o-que-são-variáveis)
2. [Tipos de variáveis em Java](#2-tipos-de-variáveis-em-java)
3. [Regras para nomear variáveis](#3-regras-para-nomear-variáveis)
4. [Operadores em Java](#4-operadores-em-java)
    - Aritméticos
    - Atribuição
    - Comparação
    - Lógicos
    - Unários
5. [Exemplos práticos](#5-exemplos-práticos)
6. [Dicas de boas práticas](#6-dicas-de-boas-práticas)

---

## 1. O que são variáveis?

Variáveis são **espaços reservados na memória** do computador que armazenam dados temporariamente.

🧠 *Pense numa variável como uma “caixinha” com um nome, onde você guarda algo para usar depois.*

```java
int idade = 25;
```

Aqui:
- `int` → tipo da variável (número inteiro)
- `idade` → nome da variável
- `25` → valor armazenado

---

## 2. Tipos de variáveis em Java

| Tipo       | Significado             | Exemplo          |
|------------|-------------------------|------------------|
| `int`      | Número inteiro          | `int idade = 30;` |
| `double`   | Número decimal          | `double peso = 65.5;` |
| `char`     | Um caractere            | `char letra = 'A';` |
| `boolean`  | Verdadeiro ou falso     | `boolean ligado = true;` |
| `String`   | Texto (sequência de caracteres) | `String nome = "João";` |

---

## 3. Regras para nomear variáveis

✔️ Pode:
- Usar letras, números e underline (`_`)
- Começar com letra ou `_`
- Ser em camelCase: `minhaIdade`, `pesoAtual`

❌ Não pode:
- Começar com número: `2idade` ❌
- Usar espaço: `minha idade` ❌
- Usar palavras reservadas de Java (`int`, `class`, etc.)

---

## 4. Operadores em Java

### ➕ Operadores Aritméticos

| Operador | Significado | Exemplo        |
|----------|-------------|----------------|
| `+`      | Soma        | `x + y`        |
| `-`      | Subtração   | `x - y`        |
| `*`      | Multiplicação | `x * y`      |
| `/`      | Divisão     | `x / y`        |
| `%`      | Resto da divisão (módulo) | `x % y` |

---

### 🟩 Operadores de Atribuição

| Operador | Exemplo        | Equivalente           |
|----------|----------------|------------------------|
| `=`      | `x = 10`       | Atribui valor          |
| `+=`     | `x += 5`       | `x = x + 5`            |
| `-=`     | `x -= 2`       | `x = x - 2`            |
| `*=`     | `x *= 3`       | `x = x * 3`            |

---

### ⚖️ Operadores de Comparação

| Operador | Significado       | Exemplo        |
|----------|-------------------|----------------|
| `==`     | Igual a           | `x == y`       |
| `!=`     | Diferente de      | `x != y`       |
| `>`      | Maior que         | `x > y`        |
| `<`      | Menor que         | `x < y`        |
| `>=`     | Maior ou igual    | `x >= y`       |
| `<=`     | Menor ou igual    | `x <= y`       |

---

### 🔁 Operadores Lógicos

| Operador | Nome        | Exemplo           |
|----------|-------------|-------------------|
| `&&`     | E (and)     | `cond1 && cond2`  |
| `I`     | OU (or)     | `cond1 II  cond2`  |
| `!`      | NÃO (not)   | `!condicao`       |

---

### 🔄 Operadores Unários

| Operador | Significado     | Exemplo |
|----------|-----------------|---------|
| `++`     | Incrementa 1    | `x++`   |
| `--`     | Decrementa 1    | `x--`   |

---

## 5. Exemplos práticos

```java
public class VariaveisOperadores {
    public static void main(String[] args) {
        int idade = 25;
        double salario = 3200.50;
        String nome = "Constante";
        boolean ativo = true;

        System.out.println(nome + " tem " + idade + " anos.");
        System.out.println("Salário: R$ " + salario);
        System.out.println("Está ativo no sistema? " + ativo);

        int bonus = 500;
        salario += bonus;

        System.out.println("Salário atualizado: R$ " + salario);
    }
}
```

---

## 6. Dicas de boas práticas

✅ Use nomes significativos para as variáveis: `salarioBruto`, `quantidadeProdutos`  
✅ Sempre inicialize suas variáveis  
✅ Comente seu código se algo parecer complexo  
✅ Use `camelCase` como padrão de nomes  

---

📘 *Próximo capítulo sugerido:* **Controle de Fluxo (if, else, switch)**
