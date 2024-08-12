# Projeto Bootcamp Java

Este projeto é uma simulação de um sistema de gerenciamento de Bootcamp utilizando o paradigma de Orientação a Objetos (POO) em Java 11. O objetivo é demonstrar como abstrair um domínio e modelar seus atributos e métodos, utilizando classes que representam um Bootcamp, Cursos, Mentorias e Desenvolvedores (Devs).

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **Bootcamp**: Representa o bootcamp, contendo uma lista de cursos, mentorias e desenvolvedores inscritos.
- **Curso**: Representa um curso dentro do bootcamp, com atributos como título, descrição e carga horária.
- **Mentoria**: Representa uma mentoria oferecida no bootcamp, com atributos como título, descrição e data.
- **Dev**: Representa um desenvolvedor inscrito no bootcamp, que pode se inscrever em cursos e mentorias, e concluir essas atividades.

## Funcionalidades

- **Bootcamp**: Possui métodos para adicionar cursos e mentorias, além de inscrever desenvolvedores.
- **Curso**: Possui métodos para exibir os detalhes do curso.
- **Mentoria**: Possui métodos para exibir os detalhes da mentoria.
- **Dev**: Permite que um desenvolvedor se inscreva e conclua cursos e mentorias, além de exibir os cursos e mentorias concluídos.

## Tecnologias Utilizadas

- **Java 11**: Linguagem de programação utilizada para desenvolver o projeto.
- **Paradigma de Orientação a Objetos (POO)**: Conceitos como Abstração, Encapsulamento, Herança e Polimorfismo foram aplicados no projeto.

## Como Executar o Projeto

1. Certifique-se de ter o Java 11 instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos do projeto.
3. Compile as classes Java:

   ```bash
   javac Main.java
