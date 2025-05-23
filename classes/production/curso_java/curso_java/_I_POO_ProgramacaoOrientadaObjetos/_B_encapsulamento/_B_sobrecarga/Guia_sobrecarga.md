# 🔄 Guia Completo sobre Sobrecarga em Java

## 📌 O que é Sobrecarga?

**Sobrecarga** (ou *overloading*) em Java é a capacidade de uma classe ter **mais de um método (ou construtor) com o mesmo nome**, mas com **assinaturas diferentes** (quantidade ou tipos de parâmetros diferentes).

> 📢 Em outras palavras: você pode **usar o mesmo nome de método ou construtor**, mas **com diferentes formas de entrada**.

---

## 🧠 Para que serve?

* Torna o código **mais flexível** e **modular**.
* Permite **várias formas de inicializar** um objeto ou de realizar uma ação.
* Evita a criação de vários métodos com nomes diferentes para a **mesma ideia geral**.

> Ex: `pagarComCartao()`, `pagarComPix()`, `pagarComDinheiro()` podem ser substituídos por `pagar(...)`, usando sobrecarga.

---

## 🧠 Por que usar Sobrecarga?

A sobrecarga serve para tornar o código mais **flexível** e **reutilizável**. Ao invés de criar vários métodos com nomes diferentes para funções parecidas, usamos a sobrecarga para manter o **mesmo nome** com **variações de uso**.

---

## 🎯 Regras da Sobrecarga

* O nome do método ou construtor deve ser o mesmo ✅
* Os **parâmetros devem mudar** em tipo, quantidade ou ordem ✅
* O **tipo de retorno não importa** para diferenciar uma sobrecarga ❌

```java
public void imprimir(String mensagem)
public void imprimir(String mensagem, int vezes)
```

---

## 🧱 Como declarar uma sobrecarga?

Você pode sobrecarregar **construtores** ou **métodos comuns**.

### 🔨 Exemplo com Construtores:

 * **Exemplo 1:**
```java
public class Produto {
    String nome;
    double preco;

    // Construtor 1
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }

    // Construtor 2 (sobrecarregado)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
```

 * **Exemplo 2:**
```java
public class Filme {
    String nome;
    String horario;
    String formaPagamento;

    // Construtor 1: recebe todos os dados
    public Filme(String nome, String horario, String formaPagamento) {
        this.nome = nome;
        this.horario = horario;
        this.formaPagamento = formaPagamento;
    }

    // Construtor 2: só nome e horário
    public Filme(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.formaPagamento = "Indefinido";
    }

    // Construtor 3: apenas nome
    public Filme(String nome) {
        this.nome = nome;
        this.horario = "A definir";
        this.formaPagamento = "Indefinido";
    }
}
```

### 🔁 Exemplo com Métodos:

```java
public class Calculadora {
    // Método 1
    public int somar(int a, int b) {
        return a + b;
    }

    // Método 2 (sobrecarregado)
    public double somar(double a, double b) {
        return a + b;
    }

    // Método 3 (sobrecarregado)
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

## 🎬 Exemplo prático: Sistema de Cinema

Imagine um sistema onde o cliente pode comprar ingresso:

* Informando **filme, horário e forma de pagamento**
* Informando apenas **filme e horário**
* Ou apenas o **nome do filme**

Cada uma dessas situações pode ser coberta por um **construtor diferente**, tornando o código mais adaptável.
```java
public class Ingresso {
    public void comprar(String nomeFilme) {
        // compra simples
    }

    public void comprar(String nomeFilme, String horario) {
        // compra com horário
    }

    public void comprar(String nomeFilme, String horario, String formaPagamento) {
        // compra completa
    }
}
```

---

## 🏦 Exemplo prático: Caixa eletrônico

Um sistema bancário pode usar sobrecarga para representar diferentes formas de saque:

```java
public class Saque {
    double valor;
    String tipoConta;
    boolean urgente;

    public Saque(double valor) {
        this.valor = valor;
        this.tipoConta = "Corrente";
        this.urgente = false;
    }

    public Saque(double valor, String tipoConta) {
        this.valor = valor;
        this.tipoConta = tipoConta;
        this.urgente = false;
    }

    public Saque(double valor, String tipoConta, boolean urgente) {
        this.valor = valor;
        this.tipoConta = tipoConta;
        this.urgente = urgente;
    }
}
```

---

## 🧩 Quem deve ser sobrecarregado nesta classe: Construtor ou Método?

Essa é uma dúvida comum e muito válida — e a resposta está diretamente ligada ao papel de cada um dentro da lógica da sua aplicação.

### 🎯 Construtores

Construtores devem ser sobrecarregados **apenas se houver necessidade de inicializar o objeto de formas diferentes**. Isso é comum em sistemas mais flexíveis ou em cenários em que nem todos os dados estão disponíveis no momento da criação do objeto.

> **Exemplo:**
> Em um sistema de produtos, posso criar um produto com apenas o nome (pré-cadastro) ou com nome e preço.

No entanto, se **há dados obrigatórios e essenciais para o objeto existir de forma consistente**, como agência e conta em um sistema bancário, **não faz sentido criar um construtor sem esses dados**. Isso comprometeria a segurança e a lógica da aplicação.

### 🔄 Métodos

Métodos devem ser sobrecarregados quando **a ação é a mesma, mas existem várias formas de realizá-la**.

> **Exemplo prático realista:**
> Após um cliente se autenticar com agência e conta, ele pode sacar dinheiro:
>
> * via espécie;
> * via PIX;
> * via TED;
> * agendado ou imediato;
> * etc.

Neste caso, o método `sacar(...)` pode (e deve) ser sobrecarregado, pois a operação é a mesma (sacar), mas o contexto muda conforme os parâmetros.

### ✅ Resumo prático:

* ❗ Use **construtores sobrecarregados** apenas quando o **processo de criação do objeto** realmente exigir flexibilidade.
* 🔁 Use **métodos sobrecarregados** quando quiser permitir **diferentes formas de executar uma ação**.

Essa clareza ajuda a manter seu código profissional, seguro e intuitivo para qualquer desenvolvedor (inclusive o seu “eu do futuro” 😄).

---

## 💡 Importante lembrar:

* A sobrecarga **não depende do nome dos parâmetros**, mas sim da **assinatura** (quantidade e tipo).
* Você pode sobrecarregar **construtores e métodos**.
* Métodos sobrecarregados **podem ou não** retornar valores.

---

## 🧠 Pensamento complementar

> A sobrecarga **não é feita pensando no usuário final**, mas sim para tornar o sistema mais **inteligente**, **organizado** e **adaptável**. Ela permite que diferentes partes do código ou fluxos internos criem ou usem objetos com diferentes níveis de informação, de acordo com a necessidade do contexto.
>
> Por exemplo, em um sistema de cinema, o cliente pode escolher o filme e horário pelo site, mas pode apenas dizer o nome do filme ao atendente por telefone. Internamente, o sistema precisa ser capaz de **representar ambos os fluxos**, e a sobrecarga permite isso de forma clara e elegante. 😉

---

## ✅ Conclusão

A **sobrecarga** melhora a **flexibilidade do seu código** e permite que você adapte suas classes para diferentes **formas de uso**, mantendo a organização e legibilidade. É uma ferramenta essencial para escrever código limpo, intuitivo e fácil de manter.

> 🎯 Use com sabedoria — quanto mais você programa, mais perceberá onde a sobrecarga **faz sentido**.


