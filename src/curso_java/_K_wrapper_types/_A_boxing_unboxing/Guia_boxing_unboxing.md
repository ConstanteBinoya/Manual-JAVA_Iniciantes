# 📦 Guia Rápido: Boxing e Unboxing em Java

## 🧠 O que são Boxing e Unboxing?

* **Boxing** é o processo de **converter um tipo primitivo em um objeto** da sua Wrapper Class correspondente.
* **Unboxing** é o processo inverso: **converter o objeto wrapper de volta em tipo primitivo**.

### 🤖 Java faz isso automaticamente desde a versão 5 (autoboxing e auto-unboxing)

---

## 🧪 Exemplo básico

```java
int x = 42;                // Tipo primitivo
Integer obj = x;           // Boxing: int -> Integer
int y = obj;               // Unboxing: Integer -> int

System.out.println("Objeto: " + obj); // 42
System.out.println("Primitivo: " + y); // 42
```

### 🔍 O que acontece nos bastidores?

```java
Integer obj = Integer.valueOf(x);  // Boxing
int y = obj.intValue();            // Unboxing
```

---

## 💬 Aplicação na vida real

### 🎯 Com coleções:

```java
List<Double> temperaturas = new ArrayList<>();
temperaturas.add(36.6);   // autoboxing (double -> Double)

double t = temperaturas.get(0); // auto-unboxing (Double -> double)
System.out.println("Temperatura: " + t);
```

### ⚖️ Com operações matemáticas:

```java
Integer a = 10;
Integer b = 20;
int resultado = a + b; // auto-unboxing de a e b -> soma -> boxing se for armazenado como Integer
System.out.println("Resultado: " + resultado);
```

---

## ⚠️ Cuidado com NullPointerException

```java
Integer valor = null;
int x = valor; // ❌ Vai quebrar! Null não pode ser desembrulhado
```

> Sempre verifique se o objeto wrapper é diferente de `null` antes de fazer auto-unboxing.

---

## 🧭 Conclusão

* 🧱 **Boxing** e **Unboxing** permitem que tipos primitivos participem de contextos que exigem objetos.
* 🚀 Java automatiza esse processo, mas é importante saber o que acontece "por trás das câmeras".
* 🧯 Fique atento com `null` para evitar erros em tempo de execução.

> Saber manipular bem esses conceitos é essencial para usar coleções, streams, e outras APIs modernas com eficácia em Java. ✨
