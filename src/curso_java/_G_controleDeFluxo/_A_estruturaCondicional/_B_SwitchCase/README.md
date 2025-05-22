# 🔄 Estrutura Condicional Switch-Case  

### 📌 O que é?  
A estrutura `switch-case` é uma alternativa ao `if-else`, usada quando temos **múltiplas condições a serem verificadas com um único valor**. Ela melhora a legibilidade do código e pode ser mais eficiente que vários `if-else` encadeados.

💡 O switch-case é mais adequado para **escolhas diretas**, onde cada valor representa um item distinto e não um intervalo de valores. Ele funciona melhor em situações como:

✅ **Catálogos e menus** (Ex.: Escolha de um lanche pelo número do cardápio)  
✅ **Dias da semana** (Ex.: 1 = Domingo, 2 = Segunda...)  
✅ **Códigos de erro ou status fixos** (Ex.: 200 = OK, 404 = Not Found)  
✅ **Identificadores fixos** (Ex.: Tipos de conta, categorias de produtos)

Já para intervalos de valores, o `if-else` ou a operação ternária ? : são mais adequados, pois permitem expressar condições mais flexíveis, como:

🚫 Idade (Criança, Adolescente, Adulto, Idoso)  
🚫 Notas escolares (Aprovado, Recuperação, Reprovado)  
🚫 Temperatura (Frio, Agradável, Quente)

### 🔹 Regra geral:
* Se a condição depende de comparações ou intervalos, use `if-else`.
* Se a lógica envolve valores fixos e bem definidos, use `switch-case`.

---

🛠️ Sintaxe do switch-case
```java
switch (expressao) {
    case valor1:
        // Código executado se expressao == valor1
        break;
    case valor2:
        // Código executado se expressao == valor2
        break;
    case valorN:
        // Código executado se expressao == valorN
        break;
    default:
        // Código executado se nenhum case for satisfeito
}

```

### 📌 Como funciona?
1. A expressao (avaliada no switch) pode ser um `int`, `char`, `String` ou `enum`.
2. O programa compara a expressão com os casos **(case valorX:)**.
3. Se houver correspondência, o código dentro do case correspondente será executado.
4. O `break` impede que os próximos case sejam executados.
5. O `default` é opcional e executado quando nenhum case é satisfeito.
---

### 📍 Exemplo 1: Uso Básico do switch-case

```java

public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = 3; // Representa terça-feira

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}

```
📌 Saída esperada:

```css

Terça-feira

```
---

### 📍 Exemplo 2: switch-case com String

```java

public class ExemploSwitchString {
    public static void main(String[] args) {
        String cargo = "Gerente";

        switch (cargo) {
            case "Estagiário":
                System.out.println("Salário: R$ 1.500,00");
                break;
            case "Analista":
                System.out.println("Salário: R$ 5.000,00");
                break;
            case "Gerente":
                System.out.println("Salário: R$ 10.000,00");
                break;
            default:
                System.out.println("Cargo não encontrado.");
        }
    }
}


```

📌 Saída esperada:

```css

Salário: R$ 10.000,00

```
---

### 📌 Quando Usar switch-case?
✅ **Quando se tem múltiplos valores fixos para comparar** (exemplo: dias da semana, meses, categorias).   
✅ **Quando o código precisa ser mais legível e limpo do que vários `if-else`**.   
✅ **Quando for necessário melhorar a performance em decisões simples**.

## 🚫 Evite switch-case quando:

### * As comparações envolvem intervalos (x > 10 && x < 20).
### * As condições dependem de expressões booleanas complexas.
### * A lógica de decisão precisa ser dinâmica ou baseada em mais de um valor.
---

### 🎯 Importância do break
O break é essencial para impedir que todos os case seguintes sejam executados após uma correspondência.

🔍 Exemplo SEM break **(Comportamento Indesejado)**:
```java

int numero = 2;

switch (numero) {
    case 1:
        System.out.println("Um");
    case 2:
        System.out.println("Dois");
    case 3:
        System.out.println("Três");
    default:
        System.out.println("Número inválido");
}

```

📌 Saída esperada:

```mathematica

Dois
Três
Número inválido

```

## ⚠️ Como corrigir?    
### Adicionando break após cada case.
---

### 🎯 Aplicação do default
O default funciona como um `else`, garantindo que algo seja executado caso nenhuma das condições seja atendida.

🔍 Exemplo:

```java

int opcao = 5;

switch (opcao) {
    case 1:
        System.out.println("Opção 1 escolhida");
        break;
    case 2:
        System.out.println("Opção 2 escolhida");
        break;
    default:
        System.out.println("Opção inválida");
}

```

📌 Saída esperada:

```css
Opção inválida
```
---

## 🔥 switch-case no Java Moderno (Java 12+)
A partir do Java 12, o switch-case foi aprimorado, permitindo um estilo mais conciso com ->.

### 🔍 Exemplo com switch-case aprimorado:

```java

int dia = 3;

String nomeDia = switch (dia) {
    case 1 -> "Domingo";
    case 2 -> "Segunda-feira";
    case 3 -> "Terça-feira";
    case 4 -> "Quarta-feira";
    default -> "Dia inválido";
};

System.out.println(nomeDia);
```
### 📌 Vantagens desse novo formato:
✅ Menos código e mais legibilidade.  
✅ Não precisa de break, pois cada case retorna um valor.

---

### 🎯 Conclusão
✅ O switch-case é ideal para comparar um único valor contra várias possibilidades fixas.  
✅ O break é essencial para evitar a execução de casos indesejados.  
✅ O default garante um comportamento padrão caso nenhum case seja satisfeito.  
✅ A partir do Java 12, o switch-case ficou mais moderno e conciso.

🚀 Agora você tem um conhecimento sólido sobre switch-case! 