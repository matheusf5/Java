# Interfaces e Inversão de Dependência – Processamento de Contratos 💳

Este diretório contém um exercício prático sobre **Interfaces**, desenvolvido como parte dos estudos de Programação Orientada a Objetos em Java.

O projeto simula o processamento de contratos financeiros utilizando um serviço de pagamento online, aplicando juros e taxas conforme as regras definidas pelo provedor de pagamento.

---

## 📌 Conteúdos abordados

- Interfaces
- Injeção de Dependência
- Princípio da Inversão de Dependência (DIP)
- Programação Orientada a Objetos (POO)
- Composição
- Manipulação de Datas
- Parcelamento de Contratos
- Polimorfismo

---

## 📂 Estrutura do diretório

### 📦 application

Contém a classe principal responsável pela execução do programa.

- `Program.java`

### 📦 model.entities

Contém as entidades do sistema.

- `Contract.java`
- `Installment.java`

### 📦 model.services

Contém os serviços responsáveis pelo processamento dos contratos.

- `OnlinePaymentService.java`
- `PaypalService.java`
- `ContractService.java`

---

## 🏗 Estrutura do exercício

### 📄 Contract

Representa um contrato.

**Atributos:**

- number
- date
- totalValue
- installments

---

### 💰 Installment

Representa uma parcela de pagamento.

**Atributos:**

- dueDate
- amount

---

### 🔌 OnlinePaymentService

Interface responsável por definir as operações de pagamento online.

**Métodos:**

- interest()
- paymentFee()

---

### 💳 PaypalService

Implementação da interface de pagamento.

**Regras aplicadas:**

- Juros simples de 1% ao mês;
- Taxa de pagamento de 2%.

---

### ⚙️ ContractService

Responsável por processar os contratos e gerar as parcelas.

---

## ⚙️ Funcionamento

O programa realiza as seguintes etapas:

1. Lê os dados do contrato.
2. Lê o número de parcelas desejado.
3. Divide o valor total do contrato igualmente entre as parcelas.
4. Aplica juros simples de 1% ao mês.
5. Aplica taxa de pagamento de 2%.
6. Gera as parcelas com suas respectivas datas de vencimento.
7. Exibe todas as parcelas na tela.

---

## 💻 Exemplo de execução

```text
Enter contract data

Number: 8028
Date (dd/MM/yyyy): 25/06/2025
Contract value: 600.00

Enter number of installments: 3

INSTALLMENTS:

25/07/2025 - 206.04
25/08/2025 - 208.08
25/09/2025 - 210.12
```

---

## 🎯 Objetivo

Este exercício foi desenvolvido para praticar:

- Criação e implementação de interfaces;
- Injeção de dependência;
- Separação de responsabilidades;
- Processamento financeiro;
- Manipulação de datas;
- Aplicação de regras de negócio através de serviços.

---

## 🔗 Repositório

Projeto disponível em:

https://github.com/matheusf5/Java

---

## 👨‍💻 Autor

**Matheus Felix**

Projeto desenvolvido durante os estudos de Java e Programação Orientada a Objetos.
