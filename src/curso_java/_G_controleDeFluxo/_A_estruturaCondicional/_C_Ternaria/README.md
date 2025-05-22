# 🌟 Estrutura Condicional Ternária em Java
**A estrutura condicional ternária é uma forma mais concisa de escrever um `if-else`, permitindo a atribuição de um valor com menos código.**

### 📌 Exemplo do dia a dia
Imagine que você precise dizer se uma loja está aberta ou fechada com base no horário. Com `if-else`if-else, você escreveria várias linhas, mas com a condição ternária, consegue fazer isso em uma única linha!

---

### 🔹 Sintaxe
A sintaxe básica da estrutura ternária é:
```java
resultado = (condição) ? valor_se_verdadeiro : valor_se_falso;
```

✅ Se a condição for verdadeira, a primeira opção será atribuída.   
✅ Se for falsa, a segunda opção será atribuída.

---

### 🔥 Exemplo Básico:

```java
public class ExemploTernario {
    public static void main(String[] args) {

        int idade = 20;
        
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(status);
    }
}

```

🖥️ Saída:
```plaintext
Maior de idade
```
✅ Se `idade` for maior ou igual a 18, `status` recebe `"Maior de idade"`.  
✅ Caso contrário, recebe `"Menor de idade"`.

---

### 🎯 Qual a importância da estrutura ternária?
* Código mais enxuto ✅
* Melhor legibilidade para expressões simples ✅
* Evita repetição de código ✅

---

### 🤔 Por que usar a condicional ternária?
🔹 Quando precisamos retornar um valor simples baseado em uma condição.  
🔹 Quando queremos um código mais limpo e direto.  
🔹 Para reduzir o número de linhas em comparações simples.

---

### 📌 Quando escolher a condicional ternária?
🔥 **Use quando:**  
✅ A condição for simples e de fácil leitura.  
✅ O código precisar ser mais compacto e direto.  

⚠️ **Evite quando:**  
❌ As condições forem muito complexas, dificultando a leitura.  
❌ Houver múltiplas verificações encadeadas (if-else if).  
❌ O bloco if ou else tiver múltiplas operações.

---

### 🚀 Diferenciais frente ao if-else e ao switch-case

| Característica     | Ternário (`? :`)               | `if/else`                        | `switch-case`                  |
|--------------------|--------------------------------|----------------------------------|--------------------------------|
| **Simplicidade**   | Alta (curto e direto)         | Média                            | Baixa (estruturado)            |
| **Ideal para**     | Retornar valores simples      | Condições mais complexas        | Múltiplas opções               |
| **Legibilidade**   | Boa para expressões curtas    | Boa para lógica mais detalhada  | Boa para casos com muitas opções |
| **Número de Linhas** | Menor                        | Médio                            | Maior                          |
| **Flexibilidade**  | Apenas 2 condições           | Múltiplas condições             | Múltiplos casos fixos          |

---

### 📌 Comparação Prática
🔹 Usando if-else:

```java
int numero = 10;
String resultado;

if (numero % 2 == 0) {
    resultado = "Par";
}
else {
    resultado = "Ímpar";
}

System.out.println(resultado);

```

✅ Vantagem: Fácil de entender para qualquer nível de complexidade.   
❌ Desvantagem: Mais linhas de código para algo simples.

---

### 🔹 Usando a Condição Ternária

```java
int numero = 10;

String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

System.out.println(resultado);
```
✅ Vantagem: Código reduzido e direto.  
❌ Desvantagem: Pode ficar ilegível se muito complexo.

---

### 🎭 Pode ter múltiplas expressões?
🚫 **Não é recomendado, mas é possível encadear condições ternárias:**

```java
int numero = 5;

String tipo = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";

System.out.println(tipo);

```

🖥️ Saída:

```plaintext
Positivo
```

### ⚠️ **Evite isso se o código ficar difícil de ler!**

---

### 📊 Conclusão
✅ Ternário = atalho para if-else, útil em expressões simples.
✅ Melhora a legibilidade, mas deve ser usado com moderação.
✅ Se precisar de múltiplos casos, prefira if-else ou switch-case.

Agora você já domina a condicional ternária! 🚀