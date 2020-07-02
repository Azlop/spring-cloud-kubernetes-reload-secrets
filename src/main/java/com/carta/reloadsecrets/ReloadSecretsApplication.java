package com.carta.reloadsecrets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReloadSecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReloadSecretsApplication.class, args);
	}
}
