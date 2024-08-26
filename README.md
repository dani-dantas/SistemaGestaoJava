# Sistema de Gestão de Estoque

## Descrição

Este projeto é um sistema de gestão de estoque desenvolvido em Java para a loja Marizardo Moto Peças. O sistema visa otimizar o controle de inventário, melhorar a precisão das operações e facilitar a emissão de relatórios. A aplicação utiliza conceitos de Programação Orientada a Objetos (POO), incluindo herança e polimorfismo, para criar um software modular e eficiente.

## Funcionalidades

- Cadastro de Produtos: Permite adicionar novos produtos ao estoque com informações como nome, código, preço e quantidade.
- Controle de Estoque: Gerencia a quantidade de produtos disponíveis, permitindo atualizações e verificação do estoque atual.
- Emissão de Relatórios: Gera relatórios sobre o estado do estoque e as operações realizadas.
- Interface de Linha de Comando: Fornece uma interface de usuário simples para interagir com o sistema.

## Estrutura do Projeto

O projeto é estruturado em três principais classes:

- Produto: Representa os produtos com atributos como nome, código, preço e quantidade.
- Estoque: Gerencia a adição, remoção e consulta de produtos no estoque.
- SistemaGestao: Interface de linha de comando que permite ao usuário interagir com o sistema.

## Requisitos

- Java JDK 11 ou superior
- IDE de sua escolha (recomenda-se IntelliJ IDEA, Eclipse ou NetBeans)

## Uso

Após iniciar o sistema, você será apresentado a um menu de opções:

- Adicionar Produto: Insira detalhes do produto para adicionar ao estoque.
- Remover Produto: Remova um produto do estoque pelo código.
- Atualizar Quantidade: Atualize a quantidade de um produto existente.
- Visualizar Estoque: Exiba a lista de produtos e suas quantidades atuais.
- Emitir Relatório: Gere um relatório do estado atual do estoque.
