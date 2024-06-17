package com.unla.grupo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Grupo03Application {

	public static void main(String[] args) {
		SpringApplication.run(Grupo03Application.class, args);
	}

}
