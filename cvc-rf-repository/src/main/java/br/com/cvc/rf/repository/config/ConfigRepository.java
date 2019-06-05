package br.com.cvc.rf.repository.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.cvc.rf.repository.AccountEntityRepository;
import br.com.cvc.rf.repository.entity.AccountEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableJpaRepositories("br.com.cvc.rf.repository")
@EntityScan("br.com.cvc.rf.repository.entity")
public class ConfigRepository {

	@Bean
	CommandLineRunner initDatabase(AccountEntityRepository repository) {
		return args -> {
			log.info("loading default users "
					+ repository.save(new AccountEntity(null, "Luan Santana", "luan@juntos.com.br", "juntos")));
			log.info("loading default users  " + repository
					.save(new AccountEntity(null, "Paula Fernandes", "paula@shallownow.com.br", "shallow now")));
		};
	}
	
}
