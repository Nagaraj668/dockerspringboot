package com.srjons.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class DockerspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerspringApplication.class, args);
	}

}
