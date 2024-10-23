# Exercício de Pizzaria - DTO com Spring e Java

## Descrição

Este exercício foi realizado como parte da aula de DTO na disciplina de API RESTful, ministrada pela brilhante professora Jacqueline Oliveira no dia 14/10/2024, no SERRATEC - Parque Tecnológico da Região Serrana RJ.

## Objetivo

Desenvolver uma API RESTful utilizando Spring e Java para gerenciar informações de uma pizzaria. A API deve permitir a manipulação de dados relacionados aos pedidos de pizza, clientes e cardápio.

## Requisitos

1. **Modelagem de Dados**:
   - Criar modelos para representar pedidos (entity), pizzas (enum), clientes (entity) e status do pedido (enum), considerando os atributos relevantes para cada entidade:
     - **Pedido**:
       - id
       - data
       - cliente
       - listaPizzas
       - statusPedido (tipos: PENDENTE, EM_ANDAMENTO, CONCLUIDO)
     - **Pizza**:
       - nome
       - ingredientes
       - preco
     - **Cliente**:
       - nome
       - endereco
       - telefone

2. **DTOs (Data Transfer Objects)**:
   - Criar DTOs para representar os objetos que serão enviados e recebidos pela API. Os DTOs devem ser utilizados para evitar vazamento de informações e garantir uma separação clara entre a camada de apresentação e a camada de negócios.

3. **Repositories**:
   - Implementar interfaces Repository para cada entidade, fornecendo métodos para realizar operações básicas de CRUD (Create, Read, Update, Delete).

4. **Services**:
   - Criar classes de serviço para implementar a lógica de negócios relacionada ao cadastro de pedidos e pizzas.
   - Implementar métodos nos serviços para realizar operações como adicionar um novo pedido, atualizar informações do status, etc.

5. **Controllers**:
   - Implementar controllers para receber requisições HTTP e chamar os métodos apropriados nos serviços.
   - Utilizar anotações do Spring como @RestController, @RequestMapping, @GetMapping, @PostMapping, etc.

## Tecnologias Utilizadas

- **Java com Spring Boot**: Para a criação de uma API robusta e eficiente.
- **DTOs**: Para uma transferência de dados eficaz entre as camadas da aplicação.

## Funcionalidades Implementadas

- **CRUD Completo**: Para todos os recursos da API (pedidos, pizzas, clientes).
- 
## ✅ Checklist do Projeto

- Implementação do CRUD para todos os recursos

## 🛠️ Organização do Código

- `/src/main/java`: Contém o código-fonte da API
- `/src/main/resources`: Contém os recursos de configuração e scripts de banco de dados
- `/docs`: Documentação adicional do projeto

## Contato

Em caso de dúvidas ou sugestões, entre em contato comigo:

- **Michele Moreira**: [LinkedIn](https://www.linkedin.com/in/michelemoreira-s/)
