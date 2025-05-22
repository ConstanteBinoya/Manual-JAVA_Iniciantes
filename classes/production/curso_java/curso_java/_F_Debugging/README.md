# 🛠️ Guia Prático de Debugging em Java

### 🎯 O que é Debugging?
O Debugging (**depuração**) é o processo de encontrar e corrigir erros no código. Em Java, podemos usar **breakpoints**, **inspeção de variáveis**, **execução passo a passo** e outras ferramentas para analisar o fluxo de execução de um programa.

---

### 🧐 Por que o Debugging é Importante?
✅ Identifica erros de lógica e comportamento inesperado.  
✅ Permite observar a execução do código linha por linha.  
✅ Ajuda a entender como as variáveis e objetos mudam ao longo do tempo.  
✅ Evita o uso excessivo de System.out.println() para testes.

---

# 🔥 Debugging no Eclipse

📌 **Passo 1: Configurar o Breakpoint**  

1️⃣ Abra seu código no Eclipse  
2️⃣ Clique na margem esquerda ao lado da linha onde deseja pausar a execução.
* Um ponto vermelho aparecerá, indicando o breakpoint.  

3️⃣ Execute o programa no modo Debug
* Vá em Run → Debug As → Java Application
* Ou pressione F11

---

📌 **Passo 2: Controle de Execução**

Ao atingir um breakpoint, o programa pausa e o Eclipse ativa a perspectiva Debug, onde temos:

🔹 **Step Into (F5)** → Entra dentro de métodos chamados na linha atual.  
🔹 **Step Over (F6)** → Executa a linha atual e avança para a próxima.  
🔹 **Step Return (F7)** → Sai do método atual e retorna à chamada anterior.  
🔹 **Resume (F8)** → Continua a execução até o próximo breakpoint.  
🔹 **Terminate (Ctrl + F2)** → Para completamente o programa.

---

📌 **Passo 3: Inspecionando Variáveis**  

Enquanto o programa estiver pausado:  

1️⃣ Vá até a aba Variables (ou ative-a em Window → Show View → Variables).  
2️⃣ Expanda os objetos para ver seus atributos e valores.  
3️⃣ Você pode alterar valores manualmente para testar diferentes cenários.

---

📌 **Passo 4: Expressões e Watch**

Você pode monitorar valores específicos:

* Clique com o botão direito em uma variável → Watch  
* Vá até a aba Expressions → Adicione expressões customizadas.  

📌 Exemplo: Monitorar x > 10 sem alterar o código!

---

📌 **Passo 5: Usando Breakpoints Avançados**  

✔ Breakpoint Condicional → Clique com o botão direito em um breakpoint e defina condições como x > 10.  
✔ Logpoint → Registra mensagens no console sem parar a execução.  
✔ Exception Breakpoint → Para automaticamente ao encontrar exceções.

___

# 🚀 Debugging em Outras IDEs
### 🔹 IntelliJ IDEA
✅ **Atalhos:**

* F8 (Step Over)
* F7 (Step Into)
* Shift + F8 (Step Out)
* F9 (Resume)

📌 Configuração similar ao Eclipse, mas com melhor integração para Breakpoints Condicionais e Logs.

---

### 🔹 NetBeans

✅ **Atalhos:**

* F7 (Step Into)
* F8 (Step Over)
* F4 (Run to Cursor)

📌 NetBeans exibe variáveis diretamente no código, sem precisar abrir a aba Variables.

---

### 🔹 VS Code

✅ Necessário instalar a Extensão Java Debugger  
✅ Usa a aba Run and Debug no canto esquerdo da IDE.

📌 Funciona bem para projetos leves e com integração a `launch.json.`

---

### 🏆 Conclusão

🔹 O Debugging permite analisar e corrigir erros de forma eficiente.  
🔹 No Eclipse, usamos breakpoints, inspeção de variáveis e controle de execução.  
🔹 Conceitos como Step Into, Step Over e Conditional Breakpoints são universais e aplicáveis a qualquer IDE!

Agora você já pode dominar o Debugging em Java em qualquer ambiente! 🚀🔥