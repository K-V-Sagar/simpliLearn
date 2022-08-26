package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo")
public class CrudDemoApplication {
	
	
	// http://localhost:8080/index.html
	// use above url to run
	
	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

}