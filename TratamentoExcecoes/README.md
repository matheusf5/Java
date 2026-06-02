# Tratamento de Exceções – Conta Bancária 🏦

Este diretório contém um exercício prático sobre **Tratamento de Exceções**, desenvolvido como parte dos estudos de Programação Orientada a Objetos em Java.

---

## 📌 Conteúdos abordados

- Tratamento de exceções (`try`, `catch`, `throw`)
- Exceções personalizadas
- Encapsulamento
- Programação Orientada a Objetos (POO)
- Regras de negócio
- Validação de dados

---

## 📂 Estrutura do diretório

### 📦 application

Contém a classe responsável pela execução do programa.

- `Program.java`

### 📦 model.entities

Contém a entidade principal do sistema.

- `Account.java`

### 📦 model.exceptions

Contém a exceção personalizada utilizada no projeto.

- `BusinessException.java`

---

## 🏗 Estrutura do exercício

### 🏦 Account

Representa uma conta bancária.

**Atributos:**

- number
- holder
- balance
- withdrawLimit

**Métodos:**

- deposit()
- withdraw()

---

## ⚙️ Regras de Negócio

O sistema permite realizar depósitos e saques em uma conta bancária.

Um saque não pode ser realizado quando:

- O valor solicitado excede o limite de saque da conta;
- O saldo disponível é insuficiente.

Caso alguma dessas regras seja violada, uma exceção personalizada é lançada e uma mensagem de erro é exibida ao usuário.

---

## 💻 Exemplo de execução

```text
Enter account data

Number: 8021
Holder: Alex Green
Initial balance: 500.00
Withdraw limit: 300.00

Enter amount for withdraw: 200.00

New balance: 300.00
```

### Exemplo de erro

```text
Enter amount for withdraw: 400.00

Withdraw error:
The amount exceeds withdraw limit
```

### Exemplo de saldo insuficiente

```text
Enter amount for withdraw: 600.00

Withdraw error:
Not enough balance
```

---

## 🎯 Objetivo

Este exercício foi desenvolvido para praticar:

- Criação de exceções personalizadas;
- Validação de regras de negócio;
- Utilização de `throw` e `throws`;
- Tratamento de erros com `try-catch`;
- Organização de projetos Java em camadas.

---

## 🔗 Repositório

Projeto disponível em:

https://github.com/matheusf5/Java

---

## 👨‍💻 Autor

**Matheus Felix**

Projeto desenvolvido durante os estudos de Java e Programação Orientada a Objetos.
