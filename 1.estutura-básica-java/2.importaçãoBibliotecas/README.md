# 📚 Importação de Bibliotecas em Java 🚀

## 🔹 O que são Bibliotecas em Java?
Em Java, bibliotecas são **conjuntos de classes e métodos** prontos para serem usados, facilitando o desenvolvimento de aplicações. Elas podem ser nativas (incluídas no Java) ou externas (desenvolvidas por terceiros).

🛠️ **Exemplo de bibliotecas nativas**:
- `java.util` (Manipulação de coleções, datas, etc.)
- `java.io` (Entrada e saída de dados)
- `java.sql` (Conexão com bancos de dados)

📦 **Exemplo de bibliotecas externas**:
- `Gson` (Manipulação de JSON - Google)
- `Apache Commons` (Funções utilitárias diversas)
- `JUnit` (Testes unitários)

---

## 🔄 Como Importar Bibliotecas?
Para usar bibliotecas em Java, utilizamos a palavra-chave `import`.

### 📌 Importando uma Classe Específica
Se quisermos usar apenas **uma classe específica** de uma biblioteca, podemos importar assim:

```java
import java.util.ArrayList; // Importa apenas a classe ArrayList

public class Exemplo {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        System.out.println(lista);
    }
}
```

📌 **Vantagem**: Melhora a legibilidade e evita importar classes desnecessárias.

---

### 📌 Importando Todo um Pacote
Podemos importar **todas as classes** de um pacote usando `*`:

```java
import java.util.*; // Importa todas as classes do pacote java.util

public class Exemplo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); // List e ArrayList são do java.util
        lista.add("C++");
        lista.add("JavaScript");
        System.out.println(lista);
    }
}
```

📌 **Observação**: Importar todo um pacote pode aumentar o tempo de compilação e consumo de memória.

---

## 🔗 Importando Bibliotecas Externas
Se quisermos usar uma **biblioteca de terceiros**, precisamos adicioná-la ao projeto.

### 📥 Adicionando uma Biblioteca no **Maven** (`pom.xml`)
Se estivermos usando Maven, podemos adicionar a dependência no arquivo `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.9</version>
    </dependency>
</dependencies>
```

### 📥 Adicionando uma Biblioteca no **Gradle** (`build.gradle`)
Para projetos Gradle, basta adicionar a linha dentro de `dependencies`:

```gradle
dependencies {
    implementation 'com.google.code.gson:gson:2.8.9'
}
```

### 📌 Importando a Biblioteca no Código
Após adicionar a biblioteca ao projeto, basta importá-la normalmente:

```java
import com.google.gson.Gson;

public class ExemploGson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson("Olá, Mundo!");
        System.out.println(json);
    }
}
```

🎯 **Saída:**
```
"Olá, Mundo!"
```

---

## 🏁 Resumo
✔️ **`import`** é usado para trazer classes e pacotes para o código.
✔️ Podemos importar **uma classe específica** ou **um pacote inteiro**.
✔️ Bibliotecas **nativas** já vêm com o Java, enquanto **externas** precisam ser adicionadas ao projeto.
✔️ Para bibliotecas externas, usamos **Maven** ou **Gradle** para facilitar o gerenciamento.

Agora você já sabe como importar e usar bibliotecas em Java! 🚀🔥
