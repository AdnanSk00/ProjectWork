package com.tka.p5UserJSPtoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class P5UserJsPtoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(P5UserJsPtoDbApplication.class, args);
		
		System.err.println("******** WELCOME **********");
	}

}
