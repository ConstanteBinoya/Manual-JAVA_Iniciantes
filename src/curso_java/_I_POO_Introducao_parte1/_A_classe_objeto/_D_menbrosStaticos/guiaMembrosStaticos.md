# 📘 **Guia Java: Membros Estáticos vs. Não Estáticos**

## ✅ O que são membros estáticos?

Em Java, membros **estáticos** pertencem à **classe**, e não a uma instância (objeto) específica.
Ou seja: você pode acessar sem precisar instanciar um objeto.

Membros estáticos (usando a palavra-chave `static`) pertencem **à classe**, e **não a objetos específicos**.
Isso significa que:

* São compartilhados por todas as instâncias (objetos) da classe.
* Podem ser acessados **sem criar um objeto**.

```java
public class Calculadora {
    public static double PI = 3.14159;
    
    public static int somar(int a, int b) {
        return a + b;
    }
}
```

Você acessa membros estáticos assim:

```java
System.out.println(Calculadora.PI);
int resultado = Calculadora.somar(2, 3);
```
> 🔸 Nenhuma instância de `Util` foi criada — tudo é acessado diretamente pela classe.

### ✅ O que são membros não estáticos (normais)?

São os membros "normais", que pertencem a um objeto específico:
Aqueles que precisam de um objeto para existir. Cada objeto tem sua própria cópia desses atributos.

```java
public class Pessoa {
    String nome; // atributo não estático

    public void dizerOla() {
        System.out.println("Olá, eu sou " + nome);
    }
}

Pessoa p1 = new Pessoa();
p1.nome = "Ana";
p1.dizerOla();
```

Você **precisa criar um objeto** para usar membros não estáticos.
> 🔸 Aqui, `nome` e `dizerOla()` pertencem a cada `Pessoa` criada.

---

### 🤔 Quando usar `static`?

| Situação                                                       | Deve usar `static`? |
| -------------------------------------------------------------- | ------------------- |
| Valor ou método compartilhado entre todos os objetos da classe | ✅ Sim               |
| Utilitário que não depende de dados do objeto                  | ✅ Sim               |
| Classe com constantes (ex: PI, taxa fixa etc.)                 | ✅ Sim               |
| Método principal `main(String[] args)`                         | ✅ Sim               |

🔎 Exemplos reais de membros estáticos:

* `Math.random()`
* `Integer.parseInt()`
* `System.out.println()`
* `Math.PI`
* `Math.sqrt(25)`
* `System.out.println()`
* `Collections.sort(lista)`

> Todos esses exemplos são acessados diretamente pela classe.

---

### ❌ Quando **NÃO** usar `static`?

| Situação                                     | Evite usar `static` |
| -------------------------------------------- | ------------------- |
| Comportamento depende dos dados do objeto    | ❌ Não               |
| Atributo representa o estado de um objeto    | ❌ Não               |
| Você precisa de encapsulamento por instância | ❌ Não               |

---

### 🎯 Onde colocar?

| Tipo de membro                                 | Pacote ideal |
| ---------------------------------------------- | ------------ |
| `static` (utilitários, funções auxiliares)     | `util`       |
| `non-static` (entidades com estado, atributos) | `entities`   |

---
### 🔁 Exemplo comparativo:

### `entities/Pessoa.java`

```java
package entities;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

### `util/Conversor.java`

```java
package util;

public class Conversor {
    public static double kmParaMilhas(double km) {
        return km * 0.621371;
    }
}
```

Uso:

```java
Pessoa p = new Pessoa("João");
System.out.println(Conversor.kmParaMilhas(10));
```

---

### 🤔 Como saber se preciso instanciar um objeto?

| Situação                                                  | Precisa instanciar? |
| --------------------------------------------------------- | ------------------- |
| Quer acessar membro **não estático** (atributo ou método) | ✅ Sim               |
| Está lidando com um dado individual por objeto            | ✅ Sim               |
| Vai acessar membro **estático** (com static)              | ❌ Não               |
| Vai chamar um método utilitário da classe (static)        | ❌ Não               |

🔎 Dica prática:

* Se você vê `public static`, **não precisa de `new`**.
* Se não tem `static`, **precisa instanciar com `new`**.

```java
System.out.println(Math.sqrt(16)); // Math é utilitário, método estático

Pessoa p = new Pessoa("João"); // Pessoa precisa ser instanciada
```

---

### 📦 Pacotes: `util` vs `entities`

#### 📁 `util`

> Contém **classes utilitárias**, geralmente com métodos e atributos **estáticos**.

Exemplo:

```java
package util;

public class ConversorDeMoeda {
    public static double dolarParaReal(double dolar, double cotacao) {
        return dolar * cotacao;
    }
}
```

Uso:

```java
import util.ConversorDeMoeda;

double valor = ConversorDeMoeda.dolarParaReal(50, 5.0);
```

#### 📁 `entities`

> Contém **entidades do mundo real**, com atributos **não estáticos**, representando objetos com estado próprio.

Exemplo:

```java
package entities;

public class Produto {
    public String nome;
    public double preco;

    public double calcularDesconto(double percentual) {
        return preco - (preco * percentual);
    }
}
```

Uso:

```java
Produto p = new Produto();
p.nome = "Camiseta";
p.preco = 100;
System.out.println(p.calcularDesconto(0.1));
```

---

### 🧠 Dica: preciso instanciar?

Faça a si mesmo a seguinte pergunta:

> ❓ *"Para usar isso, preciso que o objeto exista?"*

| Se a resposta for... | Então              |
| -------------------- | ------------------ |
| ✅ Sim                | Use **não static** |
| ❌ Não                | Use **static**     |

---

## 💎 Insight adicional:

São exemplos clássicos de membros estáticos **valores universais** como:

| Conceito real            | Exemplo em Java            | Por que é `static`?              |
| ------------------------ | -------------------------- | -------------------------------- |
| **PI**                   | `Math.PI`                  | Constante matemática universal   |
| **Velocidade da luz**    | `Fisica.VELOCIDADE_DA_LUZ` | Valor fixo para todos os objetos |
| **Taxa fixa de imposto** | `Imposto.TAXA_PADRAO`      | Aplicável igualmente a todos     |
| **Funções de conversão** | `Conversor.kgParaLb()`     | Não depende de objeto            |

Esses valores e funções são considerados **imutáveis, constantes ou utilitários**, e seu comportamento **não muda entre objetos diferentes** — por isso são ótimos candidatos a `static`.

---

### 🧠 Dica de ouro

Use `static` quando **não precisa de um objeto** para o funcionamento.
Use **não-estático** quando o comportamento **depende dos dados do objeto**.

---

### ✅ Resumo Rápido:

| Tipo         | Depende de Objeto? | Compartilhado? | Usado em                       |
| ------------ | ------------------ | -------------- | ------------------------------ |
| `static`     | ❌ Não              | ✅ Sim          | `util`, helpers, constantes    |
| não `static` | ✅ Sim              | ❌ Não          | `entities`, modelos com estado |

---

### 🧠 Conclusão geral:

* Use `static` quando o comportamento pertence à classe como um todo.
* Evite `static` quando o comportamento depende do estado do objeto.
* Use `entities` para modelar o mundo real com objetos instanciáveis.
* Use `util` para classes auxiliares reutilizáveis e estáticas.
