# Guia de Métodos Úteis com Strings

## Manipulação de Strings em Java ✂️📜

Em Java, **Strings** são objetos que representam **sequências de caracteres**. A linguagem oferece vários métodos prontos para nos ajudar a manipular essas sequências de forma prática e poderosa.

### 🌟 Por que aprender isso?

Esses métodos facilitam:

* Formatar textos para exibição.
* Processar dados de entrada.
* Realizar buscas e substituições.
* Cortar trechos de texto conforme necessário.

Vamos explorar os principais métodos úteis!

---

## 1. Formatar Strings

### 🔡 `toLowerCase()`

Transforma todos os caracteres da string para **letras minúsculas**.

```java
// Declarada uma variável "s" que recebe a palavra "JAVA" toda em letras MIÚSCULAS
String s = "JAVA"; 
System.out.println(s.toLowerCase()); 
// No comando de saída "System.out..." é chamada a variável "s" sobe o poder do método "toLowerCase()", em outras palavras, o método irá converter todas as letas maiúsculas em minúsculas da palavra contida na variável "s", e como saída teremos "java"
```

### 🔠 `toUpperCase()`

Transforma todos os caracteres da string para **letras maiúsculas**.

```java
String s = "Java";
System.out.println(s.toUpperCase()); // JAVA
```

### ✂️ `trim()`

Remove os **espaços em branco** do início e do fim da string.

 * Muito útil em preenchumento de senhas, e-mails, login... Onde o " " espaço em branco é contabilizado como mais um caractere e tornará o conteúdo inválido.

```java
String s = "  Olá  ";
System.out.println("-" + s.trim() + "-"); // -Olá-
```

---

## 2. Recortar Strings

### 🔍 `substring(inicio)`

Retorna a **parte da string** a partir do índice especificado.

```java
String s = "Programador";
System.out.println(s.substring(3)); // gramador
```

### 🔍 `substring(inicio, fim)`

Retorna os caracteres entre os índices `inicio` e `fim` (exclusivo).

```java
String s = "Programador";
System.out.println(s.substring(0, 5)); // Progr
```

---

## 3. Substituir Conteúdo

### 🔁 `replace(char antigo, char novo)`

Troca **todos os caracteres** iguais ao primeiro pelo segundo.

```java
String s = "banana";
System.out.println(s.replace('a', 'x')); // bxnxnx
```

### 🔁 `replace(String antiga, String nova)`

Troca **todas as ocorrências** da string antiga pela nova.

```java
String s = "abcabc";
System.out.println(s.replace("abc", "xy")); // xyxy
```

---

## 4. Buscar Posições

### 🧭 `indexOf(String)`

Retorna o índice da **primeira ocorrência** do texto procurado.

```java
String s = "banana";
System.out.println(s.indexOf("na")); // 2
```

### 🧭 `lastIndexOf(String)`

Retorna o índice da **última ocorrência** do texto procurado.

```java
String s = "banana";
System.out.println(s.lastIndexOf("na")); // 4
```

---

## 5. Dividir Strings

### 🔪 `split(" ")`

Divide a string com base em um **separador** e retorna um array.

```java
String s = "um dois tres";
String[] palavras = s.split(" ");
for (String p : palavras) {
    System.out.println(p);
}
```

**Saída:**

```
um
dois
tres
```

---

## Exemplo Completo 💻

```java
public class ManipulacaoStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
```

---

### Dica de Professor 👨‍🏫

> "Sempre que você estiver lidando com textos, lembre-se que Java oferece ferramentas prontas pra quase tudo. Entender esses métodos vai te poupar muito trabalho manual."

