package br.com.cvc.rf.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.cvc.rf")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
