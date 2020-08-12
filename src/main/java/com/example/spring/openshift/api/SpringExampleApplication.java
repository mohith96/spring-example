package com.example.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleApplication {


		@GetMapping("/message")
		public String getmessage() {
			
			return "Welcome to Openshift Program";
		}
		
		public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
