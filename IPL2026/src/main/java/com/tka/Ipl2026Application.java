package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class Ipl2026Application {

	public static void main(String[] args) {
		SpringApplication.run(Ipl2026Application.class, args);
		
		System.err.println("**********c** WELCOME TO IPL 2026 **********");
	}

}
