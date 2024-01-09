# To-do 

Projeto simples para implementação de uma lista de tarefas, com foco em desenvolver a minha primeira aplicação em Spring

## 🛠 Tecnologias

- Spring Boot
- Java

## Instalação

> Começaramos clonando o projeto e acessando a pasta do projeto:
```
$ git clone https://github.com/gabriellgjs/todo-spring.git
$ cd todo-spring
```

>Criando o ambiente do projeto:
```
$ docker-compose -f .docker/docker-compose.yml up -d --build
```

>Ou se prefirir use o Make
```
$ make start
```


---
## Rotas
| Url                               | Método  |  Uso                        |
| :---------------------------------|:--------| :---------------------------|
| /tasks                            | GET     | Busca todas as tasks        |
| /tasks/?id                        | GET     | Busca uma task pelo id      |
| /tasks                            | POST    | Cria uma task               |
| /tasks/?id                        | PUT     | Atualiza uma task           |
| /tasks/?id                        | DELETE  | Deleta uma task             |

## Dados para consumir rotas

##### *POST* Request: `/task`  

 - Os dados obrigatorios são: 
     * `title`: string 
  ```
     {
         "title": "Teste to-do api"
     }
 ```
 - Response:
 ```
    {
      "message": "sucess",
      "id": 1
    }
 ```
</br>

##### *PUT* Request: `/task/?id` 

 - Os dados obrigatorios são: 
     * `id`: number 
     * `title`: string
     * `status`: string 
  ```
     {
         "id": 1,
         "title": "Teste to-do api2",
         "status": "Realizado"
     }
 ```
 - Response:
 ```
    {
    }
 ```
</br>

##### *DELETE* Request: `/task/?id` 

 - Os dados obrigatorios são: 
     * `id`: number 
  ```
     {
         "id": 1
     }
 ```
 - Response:
 ```
    {
    }
 ```

</br>
