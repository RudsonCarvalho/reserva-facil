# reserva-facil

Utilizo o Spring porque é um framework comum de mercado,fácil de configurar, para apoiar na injeção de dependencia e inversão de controle, e o spring boot para empacotar tudo num jar e rodar a aplicação.

- Java 1.8 porque atualmente é o mais utilizado e tenho as funcionalidades de lambdas, streams, functions, optional etc..., que já atendem bem o objetivo

- Tratamento de erros da API @ControllerAdvice
Coloquei um interceptador de erros na api para tratar todos os erros retornados para o front. (em toda a aplicação disparo runtime exceptions que são interceptadas e tratadas antes de retornar para o front)

- @Slf4j - para os logs porque é prático e injeto o logger com uma notação.

- Arquitetura
  Separado em módulos:
    - Domain onde estão todos os componentes e objetos de negócio. (para manter o domain limpo, não permito que objetos do front/api rest entre neste módulo, tentando manter o conceito de DDD)
    - Api onde estão todos os componentes e objetos disponibilizados na api-rest (entry point para o front-end) controllers, DTOs, mappers.
    - Repository onde estão todos os componentes e objetos de persistencia. (aqui utilizo inversão de controle para injetar o repositorio no módulo de domínio, para que os objetos de repository não entre no Domain, mesmo conceito pode ser aplicado a integrações com LDAP, e outros servicos fora do dominio)

- Padrões de código: TODO  
  
- Test Unitário: TODO
  
 - Front End: TODO
    





