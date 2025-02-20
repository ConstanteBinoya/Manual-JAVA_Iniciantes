# BancoTerminal

Este é um simples aplicativo bancário criado em Java que simula a criação de uma conta bancária em um banco fictício. O programa solicita dados ao usuário como número da conta, número da agência, nome do cliente e saldo inicial, e em seguida exibe um extrato bancário com essas informações.

## Funcionalidades

- Solicita ao usuário o número da conta bancária.
- Solicita ao usuário o número da agência bancária.
- Solicita ao usuário o nome completo do cliente.
- Solicita ao usuário o saldo inicial da conta.
- Exibe um extrato bancário com as informações fornecidas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para implementar o sistema.
- **Scanner**: Classe usada para capturar entradas do usuário via terminal.

### Exemplo de Execução

Ao executar o programa, você verá as seguintes mensagens e solicitará dados ao usuário:

 
|`$$$$ BINOYA's_INTERNATIONAL_BANK $$$$`|  
|---|   

| Seja Bem-vindo! |
|---| 
| Por favor, digite o NÚMERO da CONTA: |
| 12345 |
| Por favor, digite o NÚMERO da AGÊNCIA: |
| 001 |
| Por favor, digite seu NOME: |
| João Silva |
| Por favor, digite o SALDO INICIAL: |
| 1000.50 |

|`$$$$ BINOYA's_INTERNATIONAL_BANK $$$$`|  
|---|   
| Extrato Bancário |
| CLIENTE: João Silva.|
|AGÊNCIA: 001.|
| CONTA: 12345.|
| SALDO: R$1000.5.|

## `**Olá João Silva, obrigado por criar uma conta em nosso banco!**`



## Detalhes do Código

- **Scanner**: A classe `Scanner` é usada para capturar as entradas do usuário.
- **Variáveis**: São utilizadas variáveis para armazenar as informações fornecidas, como número da conta, agência, nome do cliente e saldo.
- **Estrutura de Exibição**: O programa imprime um extrato bancário formatado com as informações fornecidas.

## Considerações

- Após a execução do programa, o `Scanner` é fechado com o método `scanner.close()` para evitar vazamento de recursos.
- O código pode ser expandido com novas funcionalidades, como operações bancárias (depósitos, retiradas, etc.).
