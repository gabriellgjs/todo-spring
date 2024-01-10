# Todo Spring
 
Projeto simples para implementação de uma lista de tarefas, com foco em desenvolver a minha primeira aplicação em Spring

## 🛠 Tecnologias

- Spring Boot
- Java

## Instalação

> Começaramos clonando o projeto e acessando a pasta do projeto:
```
git clone https://github.com/gabriellgjs/todo-spring.git &&
cd todo-spring
```


>Criando o ambiente do projeto:
```
docker-compose -f .docker/docker-compose.yml up -d --build
```

>Ou se preferir use o Make
```
make start
```


---
## Rotas
| Url                               | Método | Uso                          |
| :---------------------------------|:-------|:-----------------------------|
| /tasks                            | GET    | Busca todas as tasks         |
| /tasks                            | POST   | Cria uma nova task           |
| /tasks/?id                        | GET    | Busca uma task pelo id       |
| /tasks/?id                        | PUT    | Atualiza o status da task    |
| /tasks/?id                        | PATCH  | Atualiza a descrição da task |
| /tasks/?id                        | DELETE | Deleta uma task              |

## Dados para consumir as rotas

##### *GET* Request: `/tasks`
- Retorna todas as tasks

<br/>

##### *GET* Request: `/tasks/?id`
- Retorna a task de acordo com id do params
- Os dados obrigatórios são:
   * `id`: id no params da request
  
<br/>

##### *POST* Request: `/tasks`
- Retorna  a task criada
- Os dados obrigatórios são:
   * `description`: uma string, com o nome da task
   * `status`: uma enum de string, ACTIVE ou COMPLETED
  
  <br/>

  ```
     {
         "description": "Fazer o README.md do projeto"
         "status": "ACTIVE"
     }
  ```

<br/>

##### *PUT* Request: `/tasks/?id`
- Retorna a task com a descrição atualizada
- Os dados obrigatórios são:
   * `description`: string

  <br/>

  ```
     {
         "description": "Fazer o README.md do projeto todo spring"
     }
  ```

<br/>

##### *PATCH* Request: `/tasks/?id`
- Retorna a task com  o status atualizado
- Os dados obrigatórios são:
   * `id`: id no params da request
  
  <br/>


##### *DELETE* Request: `/tasks/?id`
- Retorna um 204 sem conteúdo
- Os dados obrigatórios são:
   * `id`: id no params da request

  <br/>
