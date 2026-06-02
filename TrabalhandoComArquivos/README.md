# Arquivos CSV e Manipulação de Diretórios – Java 📄

Este diretório contém um exercício prático sobre **Leitura e Escrita de Arquivos**, desenvolvido como parte dos estudos de Java e Programação Orientada a Objetos.

---

## 📌 Conteúdos abordados

- Manipulação de arquivos (`File`)
- Leitura de arquivos CSV
- Escrita de arquivos CSV
- Criação de diretórios
- Tratamento de exceções
- Programação Orientada a Objetos (POO)
- Streams de entrada e saída

---

## 📂 Estrutura do diretório

### 📦 application

Contém a classe responsável pela execução do programa.

- `Program.java`

### 📦 entities

Contém a entidade utilizada para representar os itens vendidos.

- `Product.java`

---

## 🏗 Estrutura do exercício

### 📦 Product

Representa um item vendido.

**Atributos:**

- name
- price
- quantity

**Métodos:**

- total()

Responsável por calcular o valor total do item vendido:

```java
price * quantity
```

---

## ⚙️ Funcionamento

O programa realiza as seguintes etapas:

1. Solicita o caminho de um arquivo CSV.
2. Lê os dados dos produtos contidos no arquivo.
3. Calcula o valor total de cada item.
4. Cria uma subpasta chamada `out`.
5. Gera um novo arquivo chamado `summary.csv`.
6. Salva o nome do produto e seu valor total.

---

## 📄 Exemplo de arquivo de entrada

```csv
TV,1000.00,2
Mouse,40.00,5
Tablet,400.00,3
HD Case,80.90,2
```

---

## 📄 Arquivo gerado (summary.csv)

```csv
TV,2000.00
Mouse,200.00
Tablet,1200.00
HD Case,161.80
```

---

## 💻 Exemplo de execução

```text
Enter file path:
/home/user/products.csv

Summary file created successfully!
```

---

## 🎯 Objetivo

Este exercício foi desenvolvido para praticar:

- Leitura de arquivos CSV;
- Escrita de novos arquivos;
- Criação automática de diretórios;
- Manipulação de caminhos de arquivos;
- Tratamento de exceções;
- Organização de código orientado a objetos.

---

## 🔗 Repositório

Projeto disponível em:

https://github.com/matheusf5/Java

---

## 👨‍💻 Autor

**Matheus Felix**

Projeto desenvolvido durante os estudos de Java e Programação Orientada a Objetos.
