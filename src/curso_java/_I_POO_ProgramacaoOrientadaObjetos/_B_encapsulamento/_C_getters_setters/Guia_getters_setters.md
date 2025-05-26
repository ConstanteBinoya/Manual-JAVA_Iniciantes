# 📡 GUIA COMPLETO: GETTERS E SETTERS (Encapsulamento em Ação)

## 📘 1. O que são Getters e Setters?

Os **getters** e **setters** são **métodos públicos** utilizados para **acessar** (get) e **modificar** (set) os **atributos privados** de uma classe. Eles são uma **forma segura** de expor os dados internos de um objeto sem quebrar o princípio de encapsulamento.

---

### 🏆 Para que servem?

| Papel      | Explicação                                                        |
| ---------- | ----------------------------------------------------------------- |
| **Getter** | Recupera o valor de um atributo privado. (😜 "Me diga o nome!")   |
| **Setter** | Altera o valor de um atributo privado. (✍️ "Quero mudar o nome!") |

---

### 🔐 Por que usar?

Imagine que você tem uma classe com um atributo `idade`. Se ele for público, qualquer parte do código poderia definir uma idade negativa — o que não faz sentido. Com getters e setters, você pode:

* Controlar o acesso aos dados ✔️
* Validar valores antes de modificar ✔️
* Proteger atributos sensíveis ✔️
* Tornar seu código mais **manutenível** e **seguro** ✔️

---

### 🧱 Quando usar?

✅ Quando um atributo for `private` e você quiser:

* Permitir **leitura controlada** do dado (getter).
* Permitir **mudança com segurança** do dado (setter).
* **Validar, formatar ou registrar** o acesso/modificação dos dados.

---

### 📍 RELAÇÃO COM O ENCAPSULAMENTO

* **Encapsular** = esconder detalhes internos da classe
* Getters/Setters são o **caminho controlado** para acesso aos dados.
* Se encaixam **diretamente no pilar da Orientação a Objetos** chamado **Encapsulamento**.

---

### 📅 Exemplo do mundo real: Conta Bancária

```java
public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }
}
```

### ⚙️ Estrutura padrão

### 🧱 Declaração de atributos privados:

```java
public class Pessoa {
    private String nome;
    private int idade;
}
```

### 🛠️ Criando os Getters e Setters:

```java
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
```

---

### 👁️ Aplicação prática na vida real

Imagine um sistema de **cadastro de alunos**. Cada aluno tem nome, idade e matrícula. Você não quer que ninguém mude a matrícula diretamente, mas pode querer permitir que o nome seja alterado com cuidado:

```java
Aluno aluno = new Aluno();
aluno.setNome("João");
System.out.println(aluno.getNome()); // Saída: "João"
```

```java
Conta conta = new Conta();
conta.setSaldo(500.0);
System.out.println(conta.getSaldo()); // Saída: 500.0
```

---

### 🧬 Analogias para memorizar

| Conceito  | Analogia                                          |
| --------- | ------------------------------------------------- |
| `private` | O cofre fechado 🔐                                |
| `getter`  | A chave para ver o que tem dentro 🧐              |
| `setter`  | A chave para colocar algo dentro, com controle ✍️ |

---

## 📒 Como gerar automaticamente no IntelliJ IDEA?

1. Clique com o botão direito na classe
2. Selecione **Generate...** (atalho `Alt` + `Insert`)
3. Escolha **Getter and Setter**
4. Marque os atributos desejados
5. Pronto! Código gerado automaticamente ✨

---

### 🚨 Boas práticas

✅ Sempre deixe os atributos `private`  
✅ Crie `getters` para leitura dos dados  
✅ Crie `setters` apenas quando fizer sentido permitir alteração  
✅ Use validações nos `setters` para manter os dados corretos

---

### 📆 Situações comuns de uso

| Atributo         | Motivo para usar getter/setter |
| ---------------- | ------------------------------ |
| Saldo bancário   | Impedir valores negativos      |
| Idade            | Validar que seja positiva      |
| Nome             | Garantir que não fique vazio   |
| Preço de produto | Evitar preço zero ou negativo  |

---

## 🧩 8. Reflexão: Atributos sempre devem ser privados?

### 📌 Regra geral:

Sim! Em quase todos os casos, os atributos devem ser declarados como `private`.

Isso:

* ❌ Impede o acesso direto de fora
* ✅ Obriga o uso de `getters/setters`, permitindo controle
* 🔐 Protege a integridade dos dados

### 🔎 Mas há exceções:

1. **Constantes públicas**

```java
public static final int LIMITE_MAXIMO = 100;
```

2. **POJOs simples ou DTOs**
   Casos muito técnicos onde os frameworks fazem leitura direta (ex: JPA)

3. **Herança (`protected`)**
   Quando for necessário acesso pelas subclasses.

| Visibilidade | Quando usar                            | É comum? |
| ------------ | -------------------------------------- | -------- |
| `private`    | Sempre que quiser proteção total       | ✅ Sim    |
| `public`     | Somente para constantes ou casos raros | 🔶 Raro  |
| `protected`  | Quando usar herança com moderação      | 🔶 Raro  |
| `default`    | Acesso por pacote (evite)              | ❌ Não    |

### 💡 Dica de ouro:

> Sempre comece com `private`. Só mude se tiver um motivo MUITO claro. 🧠

---

## 📌 Conclusão

* Getters e setters **são o coração do encapsulamento**
* Protegem dados sensíveis e evitam erros
* Permitem evoluir a aplicação sem quebrar código já existente
* São padrões em qualquer sistema profissional

