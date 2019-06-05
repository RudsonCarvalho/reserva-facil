# reserva-facil

*Precisa instalar o Lombok no Eclipse.

Utilizo o Spring porque é um framework comum de mercado,fácil de configurar, para apoiar na injeção de dependencia e inversão de controle, e o spring boot para empacotar tudo num jar e rodar a aplicação.

- Java 1.8 porque atualmente é o mais utilizado e tenho as funcionalidades de lambdas, streams, functions, optional etc..., que já atendem bem o objetivo

- Tratamento de erros da API @ControllerAdvice
Coloquei um interceptador de erros na api para tratar todos os erros retornados para o front. (em toda a aplicação disparo runtime exceptions que são interceptadas e tratadas antes de retornar para o front)

- @Slf4j - Lombok para os logs porque é prático de usar.

- Arquitetura (Tentei seguir as boas práticas arquiteturais conforme Martin Fowler DDD, Single Responsability, Inversao de controle/dependencia, Injecao de dependencia, Interaface Segregation)

  Separada em módulos:
    - "Domain" onde estão todos os componentes e objetos de negócio. (para manter o domain limpo, não permito que objetos do front/api rest entre neste módulo, tentando manter o conceito de DDD)
    - "Api" onde estão todos os componentes e objetos disponibilizados na api-rest (entry point para o front-end) controllers, DTOs, mappers.
    - "Repository" onde estão todos os componentes e objetos de persistencia. (aqui utilizo Inversão de Controle para injetar o repositorio no módulo de domínio, para que os objetos de repository não entre no Domain, mesmo conceito pode ser aplicado a integrações com LDAP, e outros servicos fora do dominio)
    - "Batch" processo que monitora e executa das transferencias agendadas. (sim deveria ser outro serviço a parte, mas aqui é um MVP despretensioso)    

- Padrões de código:
	  Ao invés de implementar classes concretas e estratégias para o cálculo de taxas, fiz uso do Java 8 e lambda expression colocando tudo numa única classe simples TransferTax.
  
- Test Unitário: 
	Implementei um teste unitário na classe responsável pelo cálculo de taxas "br.com.cvc.rf.domain.tax.TransferTaxTest"
  
 - Front End: TODO
 	Ainda não sei o que vou usar... 

    





