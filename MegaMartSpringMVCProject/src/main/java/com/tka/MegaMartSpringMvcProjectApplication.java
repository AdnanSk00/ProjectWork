package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class MegaMartSpringMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegaMartSpringMvcProjectApplication.class, args);
		
		System.err.println("********* WELCOME TO AMAZON PROJECT *********");
	}

}
