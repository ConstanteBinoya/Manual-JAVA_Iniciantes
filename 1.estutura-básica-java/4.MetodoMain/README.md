# 🚀 O Método `main` em Java

## 🔹 O que é o método `main`?

O método `main` é o ponto de entrada para a execução de um programa Java. Ele é um método especial que a JVM (**Java Virtual Machine**) procura e executa quando iniciamos um programa.

📌 **Sintaxe do método `main`**:

```java
public class MeuPrograma {

    //Método main
    public static void main(String[] args) {
        System.out.println("Olá, mundo! 🚀");
    }
}
```

🛠 **Explicação da sintaxe:**

- `public` 👉 O método precisa ser público para que a JVM possa acessá-lo de qualquer lugar.
- `static` 👉 Permite que o método seja executado sem precisar instanciar a classe.
- `void` 👉 Indica que o método não retorna nenhum valor.
- `main` 👉 Nome fixo que a JVM reconhece como ponto de entrada.
- `String[] args` 👉 Representa um array de argumentos que podem ser passados ao programa via linha de comando.

---

## 🎯 Para que serve o método `main`?

Ele é responsável por iniciar a execução do programa e pode chamar outros métodos e instanciar objetos.

### Exemplo com chamada de outro método:

```java
public class Exemplo {
    public static void main(String[] args) {
        saudacao(); // Chamando outro método dentro do main
    }

    public static void saudacao() {
        System.out.println("Bem-vindo ao Java! 🎉");
    }
}
```

🎯 **Saída no console:**
```
Bem-vindo ao Java! 🎉
```

---

## 🔥 Importância do método `main`

✅ **Ponto de entrada obrigatório**: Sem ele, um programa Java não pode ser executado diretamente.  
✅ **Permite a execução sequencial do código**: O código dentro do `main` é executado de cima para baixo.  
✅ **Facilita testes e execução isolada**: Podemos criar classes auxiliares e chamar seus métodos dentro do `main`.  
✅ **Aceita argumentos via terminal**: Podemos passar parâmetros externos e processá-los.

---

## 📌 Argumentos `String[] args`

Podemos passar valores ao programa durante sua execução via terminal. Exemplo:

```java
public class Argumentos {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumento recebido: " + args[0]);
        } else {
            System.out.println("Nenhum argumento foi passado.");
        }
    }
}
```

Se executarmos:
```
java Argumentos Java
```
🎯 **Saída no console:**
```
Argumento recebido: Java
```

---

## 🚀 Conclusão

✔️ O método `main` é essencial para a execução de um programa Java.  
✔️ Ele define o fluxo inicial do programa.  
✔️ Pode chamar outros métodos e instanciar objetos.  
✔️ Permite a passagem de argumentos externos.  

Agora você domina o conceito do método `main`! 🎯💡🚀
