# Projeto Conta Corrente

## Descrição
Este projeto implementa um sistema simples de **conta corrente** com funcionalidades como depósitos, saques, envio de Pix, e gerenciamento de chaves Pix favoritas. O sistema foi desenvolvido com foco no tratamento de erros e na organização de transações em um histórico. Além disso, o método de envio de Pix inclui uma validação básica das chaves Pix.

## Funcionalidades

### 1. **Métodos de Transação**
- **`depositar(double valor)`**: Permite adicionar um valor ao saldo da conta. Inclui validação para impedir depósitos com valores inválidos (como negativos ou zero).
- **`sacar(double valor)`**: Realiza saques, verificando se o valor solicitado é válido e se o saldo disponível é suficiente.
- **`enviarPix(String chavePix, double valor)`**: Envia Pix para uma chave cadastrada, realizando uma validação básica da chave Pix e do saldo disponível.

### 2. **Gerenciamento de Chaves Pix Favoritas**
- **`adicionarChavePixFavorita(String chavePix, String descricao)`**: Permite cadastrar chaves Pix favoritas com uma descrição associada.

### 3. **Histórico de Transações**
- O sistema armazena todas as transações realizadas (depósitos, saques, e envio de Pix) em uma lista, que pode ser visualizada pelo usuário.
- **`mostrarHistorico()`**: Exibe o histórico completo de transações da conta corrente, incluindo detalhes de cada operação.

### 4. **Tratamento de Erros**
Todos os métodos relacionados a transações financeiras (sacar, depositar, enviar Pix) incluem tratamento de erros para capturar entradas inválidas e garantir a segurança das operações, exibindo mensagens claras ao usuário em caso de falha.

## Tecnologias Utilizadas
- **Java**: Linguagem principal utilizada para o desenvolvimento do projeto.
- **Java Collections (Map, List)**: Para armazenar chaves Pix e o histórico de transações.
- **Tratamento de Exceções (Try-Catch)**: Para captura de erros durante as transações e manipulações de dados.

## Instruções de Execução
1. Compile o código:
   ```bash
   javac App.java
   ```
2. Execute o programa:
   ```bash
   App.java
   ```
## Exemplo de Execução
```text
Digite o nome do titular da conta: João Silva

Menu:
1. Depositar
2. Sacar
3. Enviar Pix
4. Adicionar Chave Pix Favorita
5. Mostrar Histórico de Transações
6. Sair
Escolha uma opção: 1

Digite o valor a ser depositado: R$ 500
Operação de depósito finalizada.

Menu:
1. Depositar
2. Sacar
3. Enviar Pix
4. Adicionar Chave Pix Favorita
5. Mostrar Histórico de Transações
6. Sair
Escolha uma opção: 5

Histórico de Transações:
Depósito: R$500.0
```

## Possíveis Melhorias Futuras
- Integração de SQLite com JDBC e Projeto de Conta Corrente em Java
