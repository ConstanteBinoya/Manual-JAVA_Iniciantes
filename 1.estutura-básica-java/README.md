# 📌 Estrutura Básica de um Programa Java

Todo programa em Java segue uma estrutura obrigatória para que o código seja válido e executável. Vamos entender cada um dos componentes dessa estrutura.

---
## 1️⃣ **Projeto Java** 📁
É o nível mais alto da estrutura. Um projeto Java pode conter múltiplos arquivos Java organizados em pacotes e subpastas. Ele é criado em um ambiente de desenvolvimento (IDE, como Eclipse, IntelliJ IDEA ou VS Code) e contém tudo o que é necessário para compilar e executar um programa Java.

### 💡 Exemplo:

Meu-projeto: `SistemaDeCadastro`  
│── Pacote: `br.com.meuprojeto`   
│   ├── `Arquivo Java: Pessoa.java`   
│   ├── `Arquivo Java: Cadastro.java` 

---

## **2️⃣ Pacote (`package`)** 📦

Um pacote (`package`) é uma forma de organizar os arquivos do seu projeto. Ele funciona como uma pasta onde a classe Java está localizada.

```java
package estudos;
```

💡 **O que acontece?**  
- Indica que este código pertence ao pacote `estudos`.  
- Se você não definir um `package`, a classe estará no "pacote padrão" (sem nome).  
- Ajuda a organizar e evitar conflitos entre classes com o mesmo nome.  

---

## **3️⃣ Importação de Bibliotecas (`import`)** 📚

Se um código precisar utilizar funcionalidades de outras classes, precisamos importá-las.

```java
import java.util.Scanner;
```

💡 **O que acontece?**  
- Importa a classe `Scanner` para ler dados do teclado.  
- Sem `import`, você precisa escrever o caminho completo: `java.util.Scanner scanner = new Scanner(System.in);`  

---

## **4️⃣ Definição da Classe (`public class NomeDaClasse`)**

Toda aplicação Java deve ter pelo menos uma classe. O nome da classe deve ser **igual ao nome do arquivo** e seguir a convenção de nomenclatura: **começar com letra maiúscula** e usar `CamelCase`.

```java
public class MeuPrograma {
}
```

💡 **O que acontece?**  
- Define que o nome do programa será `MeuPrograma`.  
- O arquivo deve ser salvo como **`MeuPrograma.java`**.  

---

## **5️⃣ Método `main`: Ponto de Entrada do Programa** 🚀

O método `main` é o ponto de partida da execução do programa.

```java
public static void main(String[] args) {
    System.out.println("Olá, Mundo!");
}
```

💡 **O que acontece?**  
- **`public`** → Permite que o método seja acessado por qualquer classe.  
- **`static`** → Não precisa criar um objeto para executar.  
- **`void`** → O método **não retorna nenhum valor**.  
- **`main`** → Nome fixo para indicar que este é o ponto de entrada.  
- **`String[] args`** → Parâmetros passados pela linha de comando (opcional).  

---

## **6️⃣ Exibição de Saída (`System.out.println()`)** 🖥️

Usado para exibir mensagens no terminal.

```java
System.out.println("Olá, Mundo!");
```

💡 **O que acontece?**  
- **`System.out.println()`** → Imprime a mensagem e pula para a próxima linha.  
- **`System.out.print()`** → Imprime sem pular linha.  

---

## **📌 Estrutura Completa de um Programa Java**

```java
package estudos;  // 1️⃣ Pacote

import java.util.Scanner;  // 2️⃣ Importação de Biblioteca

public class MeuPrograma {  // 3️⃣ Classe Principal
    public static void main(String[] args) {  // 4️⃣ Método main
        System.out.println("Olá, Mundo!");  // 5️⃣ Exibição de Saída
    }
}
```

💡 **Resumo:**  
1️⃣ O **Projeto** é o topo da hierarquia.
2️⃣ O **pacote** organiza o código.  
3️⃣ A **importação** adiciona funcionalidades.  
4️⃣ A **classe principal** define o programa.  
5️⃣ O **método `main`** inicia a execução.  
6️⃣ A **exibição de saída** mostra informações para o usuário.  

---

## **🚀 Dica Extra**

🔹 **A estrutura básica do Java é rígida**, então:  
✅ O nome da classe **deve ser igual** ao nome do arquivo.  
✅ O método `main` é **obrigatório** em um programa executável.  
✅ Sempre **terminamos os comandos com `;`**.  
