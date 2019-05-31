# reserva-facil (go to branch develop)

Utilizo o Spring porque é um framework comum de mercado,fácil de configurar, para apoiar na injeção de dependencia e inversão de controle, e o spring boot para empacotar tudo num jar e rodar a aplicação.

- Java 1.8 porque atualmente é o mais utilizado e tenho as funcionalidades de lambdas, streams, functions, optional etc..., que já atendem bem o objetivo

- Tratamento de erros da API @ControllerAdvice
Coloquei um interceptador de erros na api para tratar todos os erros retornados para o front. (em toda a aplicação disparo runtime exceptions que são interceptadas e tratadas antes de retornar para o front)

- @Slf4j - Lombok para os logs porque é prático de usar. (Em eclipse mais velho requer a instalação do lombok)

- Arquitetura
  Separado em módulos:
    - Domain onde estão todos os componentes e objetos de negócio. (para manter o domain limpo, não permito que objetos do front/api rest entre neste módulo, tentando manter o conceito de DDD)
    - Api onde estão todos os componentes e objetos disponibilizados na api-rest (entry point para o front-end) controllers, DTOs, mappers. (no DTO não coloquei lombok para facilitar a manipulação de dados de front-end)
    - Repository onde estão todos os componentes e objetos de persistencia. (aqui utilizo inversão de dependencia com o dominio, para que os objetos de repository não entre no Domain, mesmo conceito pode ser aplicado a integrações com LDAP, e outros servicos fora do dominio)

- @Data - Lombok para criar os getters e setters na entidade. (Em eclipse mais velho requer a instalação do lombok)

- Padrões de código:   
	(andamento)
	
	
- Test Unitário:
	(andamento)
    





