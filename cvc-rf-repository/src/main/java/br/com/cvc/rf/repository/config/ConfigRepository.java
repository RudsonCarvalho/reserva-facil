package br.com.cvc.rf.repository.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.cvc.rf.repository.AccountEntityRepository;
import br.com.cvc.rf.repository.entity.AccountEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

@Configuration
@Slf4j
public class ConfigRepository {
	
	@Bean
	  CommandLineRunner initDatabase(AccountEntityRepository repository) {
	    return args -> {
	      log.info("Preloading " + repository.save(new AccountEntity("Luan Santana", "juntos", "luan@juntos.com.br")));
	      log.info("Preloading " + repository.save(new AccountEntity("Paula Fernandes", "shallow now", "paula@shallownow.com.br")));
	    };
	  }

}
