package com.example.demoAssess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"com.test"})
public class DemoAssessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAssessApplication.class, args);
	}

}
