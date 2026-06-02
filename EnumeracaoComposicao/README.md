# Enumeração e Composição – Java 👨‍💻

Este diretório contém um exercício prático sobre **Enumeração (Enum)** e **Composição**, desenvolvido como parte dos estudos de Programação Orientada a Objetos em Java.

---

## 📌 Conteúdos abordados

- Enumerações (`enum`)
- Composição entre classes
- Encapsulamento
- Coleções com `ArrayList`
- Manipulação de datas
- Relacionamentos entre objetos
- Programação Orientada a Objetos (POO)

---

## 📂 Estrutura do diretório

### 📦 application

Contém a classe principal responsável pela execução do programa.

- `Program.java`

### 📦 entities

Contém as entidades do sistema.

- `Worker.java`
- `Department.java`
- `HourContract.java`

### 📦 enums

Contém a enumeração utilizada pelo projeto.

- `WorkerLevel.java`

---

## 🏗 Estrutura do exercício

O sistema possui os seguintes relacionamentos:

### 👨‍💼 Worker

Representa o trabalhador.

**Atributos:**

- name
- level
- baseSalary
- department
- contracts

**Métodos:**

- addContract()
- removeContract()
- income()

---

### 🏢 Department

Representa o departamento ao qual o trabalhador pertence.

**Atributos:**

- name

---

### 📄 HourContract

Representa um contrato de trabalho por hora.

**Atributos:**

- date
- valuePerHour
- hours

**Métodos:**

- totalValue()

---

### 📋 WorkerLevel

Enum responsável pelo nível profissional do trabalhador.

```java
JUNIOR
MID_LEVEL
SENIOR
```

---

## ⚙️ Funcionamento

O programa realiza as seguintes etapas:

1. Cadastro do departamento.
2. Cadastro do trabalhador.
3. Definição do nível do trabalhador.
4. Cadastro de N contratos.
5. Solicitação de um mês e ano.
6. Cálculo da renda total do trabalhador no período informado.

A renda é calculada pela soma:

```text
Salário Base + Valor dos Contratos do Mês
```

---

## 💻 Exemplo de execução

```text
Enter department's name: Design

Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00

How many contracts to this worker? 3

Enter month and year to calculate income (MM/YYYY): 08/2023

Name: Alex
Department: Design
Income for 08/2023: 3000.00
```

---

## 🎯 Objetivo

Este exercício foi desenvolvido para consolidar conhecimentos sobre:

- Enumerações em Java
- Composição entre objetos
- Modelagem orientada a objetos
- Manipulação de listas
- Organização de projetos Java

---

## 🔗 Repositório

Projeto disponível em:

<https://github.com/matheusf5/Java/tree/main/EnumeracaoComposicao>

---

## 👨‍💻 Autor

**Matheus Felix**

Projeto desenvolvido durante os estudos de Java e Programação Orientada a Objetos.
