# Mães que codam! ❤️ 💻



> Aplicação para cadastro e gerenciamento de dados de profissionais mães, dentro do escopo de tecnologia, em busca 
> de recolocação no mercado ou um de novas oportunidades dentro de sua área de trabalho.



### 📈 Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [x] Cadastro de Mães
- [x] Listagem de Mães
- [ ] Bando de dados (Banco Relacional)
- [ ] Integração com a API "consumer-base-api", responsável por trazer o endereço conforme CEP informado.



### 💻 Informações relevantes

Este projeto utilizará as seguintes tecnologias:


<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" width="100px;" alt="Foto Java"/><br>
        <sub>
          <b> Java </b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot" width="100px;" alt="Foto Spring Boot"/><br>
        <sub>
          <b>Sring Boot</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" width="100px;" alt="Foto Maven"/><br>
        <sub>
          <b>Maven</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

### 💻 Executar o projeto


Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:1001
```

### Funcionalidades  🖥
- Cadastro - POST
- Apagar - DELETE 
- Busca - GET
- Busca por ID - GET
- Alteração de todos os dados- PUT
- Alteração de parte dos dados - PATCH
 
 ### Modelo com campos obrigatórios para teste  📩



       "nome": "nome da mae que coda",
       "profissao": "Desenvolvedora",
       "cidade": "Vila Velha",
       "estado": "ES",
       "virtude": "resiliência",
       "linkedin": "https://www.linkedin.com/in/teste/"