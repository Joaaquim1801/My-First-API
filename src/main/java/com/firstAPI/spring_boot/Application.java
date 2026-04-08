package com.firstAPI.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Indicate that we are going to create an API
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping
	public String helloWorld(){ // This method it's a REST endpoint
		return "Hello World!";
	}
// When i run i have a webserver running in the port 8080
}
