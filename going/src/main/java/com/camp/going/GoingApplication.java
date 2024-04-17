package com.camp.going;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GoingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoingApplication.class, args);
	}

}
