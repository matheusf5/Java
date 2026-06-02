# Herança e Polimorfismo – Produtos 🏷️

Este diretório contém um exercício prático sobre **Herança** e **Polimorfismo** em Java, desenvolvido como parte dos estudos de Programação Orientada a Objetos.

---

## 📌 Conteúdos abordados

- Herança
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Classes e Objetos
- Encapsulamento
- Manipulação de Datas
- Programação Orientada a Objetos (POO)

---

## 📂 Estrutura do diretório

### 📦 application

Contém a classe responsável pela execução do programa.

- `Program.java`

### 📦 entities

Contém as entidades do sistema.

- `Product.java`
- `ImportedProduct.java`
- `UsedProduct.java`

---

## 🏗 Estrutura do exercício

O sistema trabalha com três tipos de produtos:

### 📦 Product

Classe base que representa um produto comum.

**Atributos:**

- name
- price

**Métodos:**

- priceTag()

---

### 🌎 ImportedProduct

Representa um produto importado.

**Atributos adicionais:**

- customsFee

**Métodos:**

- totalPrice()
- priceTag()

O valor da taxa de alfândega é somado ao preço final do produto.

---

### ♻️ UsedProduct

Representa um produto usado.

**Atributos adicionais:**

- manufactureDate

**Métodos:**

- priceTag()

A data de fabricação é exibida na etiqueta do produto.

---

## ⚙️ Funcionamento

O programa realiza as seguintes etapas:

1. Solicita a quantidade de produtos.
2. Para cada produto, solicita seu tipo:
   - Comum
   - Importado
   - Usado
3. Lê os dados específicos de cada tipo.
4. Armazena todos os produtos em uma lista.
5. Exibe as etiquetas de preço utilizando polimorfismo.

---

## 💻 Exemplo de execução

```text
Enter the number of products: 3

Product #1 data:
Common, used or imported (c/u/i)? c
Name: Notebook
Price: 2500.00

Product #2 data:
Common, used or imported (c/u/i)? u
Name: iPhone 11
Price: 1800.00
Manufacture date (DD/MM/YYYY): 15/03/2021

Product #3 data:
Common, used or imported (c/u/i)? i
Name: Camera
Price: 800.00
Customs fee: 120.00

PRICE TAGS:

Notebook $2500.00

iPhone 11 (used)
Manufacture date: 15/03/2021
$1800.00

Camera $920.00
(Customs fee: $120.00)
```

---

## 🎯 Objetivo

Este exercício foi desenvolvido para praticar:

- Criação de hierarquias de classes;
- Reutilização de código através da herança;
- Sobrescrita de métodos;
- Aplicação de polimorfismo;
- Manipulação de listas de objetos de diferentes tipos.

---

## 🔗 Repositório

Projeto disponível em:

https://github.com/matheusf5/Java

---

## 👨‍💻 Autor

**Matheus Felix**

Projeto desenvolvido durante os estudos de Java e Programação Orientada a Objetos.
