# Client Project
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

## Sobre o projeto

Projeto de conclusão da primeira etapa do curso [Dev Superior](https://www.linkedin.com/school/devsuperior/).
Foi implementado um CRUD completo de WEB services REST para acessar e manipular recursos da entidade **Cliente**, conforme diagrama:
<br />
![Client UML](https://github.com/fabiomrm/client-project/blob/main/client.png?raw=true)
<br />

## Endpoints implementados
### GET
* /clients
* /clients?page=0&linesPerPage=6&direction=ASC&orderBy=names
* clients/{id}
### POST
* /clients
```json
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

### UPDATE
* /clients/{id}
```json
{
  "name": "Maria Silva Atualizada",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

### DELETE
* /clients/{id}



