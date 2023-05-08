package com.wladi.acoplamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AcoplamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcoplamentoApplication.class, args);
	}

}
