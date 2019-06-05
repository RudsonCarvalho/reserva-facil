package br.com.cvc.rf.batch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Configuration
@EnableScheduling
public class ConfigBatch {

	public ConfigBatch() {
		log.info("Reserva facil, o monitor de transferencias esta iniciando...");
	}
}
