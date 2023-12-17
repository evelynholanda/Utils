### Projeto AUTTAR
obs: RESPOSTAS DA PROVA ESCRITA ESTÃO NO LINK:
https://docs.google.com/document/d/1lSkQ8SbNdjwjR-94zEXm_eLeB8XH9ulvhLw9fVA2XJU/edit

### Descrição
Este código foi desenvolvido para o desafio técnico Zappts/Auttar

### Repositório criado para escrita de um script da automação para Testes de API

### Documentação da API = https://reqres.in/

### URI = https://reqres.in/api/

### Pré-requisitos
JDK 11+
IntelliJ

### Execução da Aplicação
Para poder executar os testes implementados nesse projeto, será necessário executar a aplicação na sua máquina, clonado repositório e instalando dependências

### Plano de Testes

### Objetivo: Validação de API

### Objetivo Específico: Garantir que a aplicação está funcionando corretamente de acordo com a documentação.

Os testes foram baseados nos endpoins da documentação
Os testes foram validados com o main flow do endpoint CREATE
Outros cenários foram criados via Automação Cypress e Postman para entender o comportamento e funcionalidade da API

### Estrategia de Testes
Para a estratégia de validação dos endpoints utilizaremos a heurística VADER validando apenas aguns cenários de main flow e alternative cenaries

- Validação dos Verbos
- Validação da Authorization
- Validação dos Dados
- Validação dos Erros


### Automação de Testes MAVEN e RESTASSURED

### Pre-Requisitos
Git
Java JDK
Conta no Github
IDE Intellij
Postman
Newman
Cypress

### Recursos de Software
RestAssured
Postman

### Validação apenas de testes Funcionais 

### Validação de alguns endpoints
Validação teste Contrato de um endpoint


### Não será escopo da Automação
Testes de Integração
Testes de Unidade
Integração com APIs externas
Testes de Performance
Testes de Carga

### AUTOMAÇÃO EM CYPRESS
LInk Github action rodando pipeline
https://github.com/evelynholanda/getnet/actions

### Escopo das Validações (Endpoints) POSTMAN
GET_ ListUsers - 200
GET_ SingleUsers - 200
GET _Users-NotFound - 404
POST_Users-NotFound - 201/404 (body empty)
POST- Create - 201
PUT_Update - 200
PUT_Update - 200 (Body empty)
PATCH_Update - 200 (Body empty)
DELETE_Update - 204
POST_RegisterSuccessful - 200
POST_RegisterNotSuccessful - 400
POST_RegisterNotSuccessful - 400 (Password empty)
POST_LoginSuccessful - 200
POST_LoginUnsuccessful - 400
GET_Delayde - 200

### Escopo Testes Projeto Maven
TestAPI

### VALIDAÇÕES
1) Validar o script de "CREATE" método "POST” cobertura de testes em Rest-
Assured da API
2) Validar cobertura de Status Code, Campos obrigatórios e Contrato
3) Desenvolver com POJOs.

### Relatório Execução Testes via Newman
file:///home/guest/IdeaProjects/Utils/POSTMAN/newman/getnet-2023-12-17-01-01-09-198-0.html
OBS: Este relatório conteḿ os testes que estao falhando

### Alguns BUGS e INCONSISTÊNCIAS
OBS: Não foram elecadas todas as issues de BUGs ou improvements que existem na API.
Estou apenas criando alguns testes para demonstrar que tenho conhecimento básico nesse tipo de testes.
No meu dia a dia eu usava automação em Cypress para validar testes de API e subir na PIPE, por isso também criei a automação em Cypress

### Endpoints
POST_Users-NotFound - 201/404 (body empty)
Essa request foi enviada sem o body que era requerido e mesmo assim o response do status code foi 201
Deveria ser na casa do 400, por não atender os requisitos da request

PUT_Update - 200 (Body empty)
Essa request foi enviada sem body e mesmo assim foi realizado o update com response status code 200


