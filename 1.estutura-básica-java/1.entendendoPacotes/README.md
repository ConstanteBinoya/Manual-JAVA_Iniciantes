# 📦 Como Criar um Pacote em Java

Criar um **pacote (package)** em Java é essencial para organizar melhor o código, especialmente em projetos maiores. Aqui está um **passo a passo** detalhado para criar um pacote em Java:

---

## 🛠 Passo a Passo para Criar um Pacote em Java

### 📌 1. Criar a Estrutura de Diretórios (pastas)

Cada **pacote** é representado por uma pasta no sistema de arquivos. Para criar um pacote chamado `br.com.meuprojeto.model`, siga estaestrutura:

meu-projeto/  
│── src/   
│     ├── br/   
│     │    ├── com/   
│     │    │    ├── meuprojeto/   
│     │    │    │    ├── model/   
│     │    │    │    │    ├── MinhaClasse.java  

---
### 📌 2. Criar a Classe dentro do Pacote

Agora, dentro da pasta **model**, crie o arquivo **MinhaClasse.java** com o seguinte conteúdo:

```java
package br.com.meuprojeto.model; // Declaração do pacote

public class MinhaClasse {
    public void mostrarMensagem() {
        System.out.println("Olá, este é um exemplo de classe dentro de um pacote!");
    }
}
```
🔹 Importante: A primeira linha do arquivo deve ser package nome_do_pacote; para indicar que essa classe pertence a um pacote específico.
---

📌 3. Criar a Classe Principal
Agora, crie uma classe principal para testar a classe do pacote. No diretório src, crie um novo arquivo chamado Main.java:

import br.com.meuprojeto.model.MinhaClasse; // Importação do pacote

```java
public class Main {
    public static void main(String[] args) {
        MinhaClasse exemplo = new MinhaClasse(); // Criando um objeto da classe
        exemplo.mostrarMensagem(); // Chamando o método
    }
}
```
🔹 Importante: A primeira linha do arquivo deve ser package nome_do_pacote; para indicar que essa classe pertence a um pacote específico.
---
📌 4. Compilar e Executar o Código
Agora, compile e execute o código corretamente:

1️⃣ Compilar as classes
No terminal, dentro da pasta `src`, execute:

```sh
javac -d . br/com/meuprojeto/model/MinhaClasse.java Main.java
```

📌 O argumento -d . indica que os arquivos compilados devem ser armazenados na estrutura correta de pacotes.

2️⃣ Executar o programa
Agora, rode o programa chamando a classe Main:

```sh
java Main
```

Se tudo estiver correto, a saída será:

```css
Olá, este é um exemplo de classe dentro de um pacote!
```

🚀 Conclusão
Agora você sabe como:

✅ Criar a estrutura de diretórios para pacotes.  
✅ Declarar um pacote dentro do código Java.  
✅ Importar e usar uma classe de um pacote em outro arquivo.  
✅ Compilar e executar código organizado em pacotes.