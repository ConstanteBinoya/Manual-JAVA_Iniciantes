# 📘 **Guia Prático: Encapsulamento em Java**

## 🔐 **O que é Encapsulamento?**
Encapsulamento é um dos pilares da POO (Programação Orientada a Objetos). Ele consiste em **esconder os detalhes internos de uma classe** e **expor apenas o necessário** para o mundo exterior.

Imagine uma máquina de lavar: você aperta botões, escolhe o modo e pronto. Você **não precisa (nem deve)** acessar os fios, motores ou engrenagens lá dentro. O encapsulamento funciona assim no código! 🧺

---

### 🎯 **Objetivos do Encapsulamento**

* Proteger dados sensíveis
* Controlar alterações e acessos
* Facilitar manutenção e evolução do sistema
* Reduzir efeitos colaterais

---

### 🔧 **Como aplicar encapsulamento em Java?**

1. **Atributos privados** (`private`)
2. **Métodos públicos de acesso** (`get` e `set`)

```java
public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor + 5 <= saldo) {
            saldo -= (valor + 5); // taxa de saque
        }
    }
}
```

### 🔎 **Por que não criar saldo como público?**
Porque isso permitiria fazer algo assim:

```java
conta.saldo = -999999;
```

 > 😱 Isso quebraria completamente as regras do banco!

---

### 📦 **Resumo das Boas Práticas**

| Prática             | Correto                                  | Errado                            |
| ------------------- | ---------------------------------------- | --------------------------------- |
| Atributos privados  | `private double saldo;`                  | `public double saldo;`            |
| Métodos de acesso   | `getSaldo(), depositar()`                | Alterar direto via `obj.atributo` |
| Validações internas | Validar dentro de `set` ou `depositar()` | Sem regras ou proteção            |

---

### 💬 **Exemplo do dia a dia**
Um cofre tem um segredo (senha). Você **não abre o cofre com a mão**. Usa um **painel com senha (interface pública)**. Assim:

* Senha = atributo privado
* Botões para digitar senha = getters/setters ou métodos públicos
* Abrir cofre = comportamento controlado

---

### 🎓 **Checklist mental: quando usar encapsulamento?**

* O dado pode ser alterado livremente? ❌ Então **encapsule**.
* Precisa validar algo antes de alterar? ✅ Use um `set` com lógica.
* Um atributo nunca deve mudar? ✅ Use `final` com `get` (sem `set`).

---

### 🔚 **Conclusão**
Encapsular é proteger. Com ele, você organiza melhor seu código, evita bugs difíceis de rastrear e facilita a manutenção.

Comece simples:

* Sempre use `private` em atributos.
* Crie métodos controlados para alterar ou acessar os dados.

Assim, você constrói classes à prova de erros externos. ✨
