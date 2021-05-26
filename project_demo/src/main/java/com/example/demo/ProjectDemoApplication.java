package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectDemoApplication {

	public static void main(String[] args) {
		System.out.println("first data");
		SpringApplication.run(ProjectDemoApplication.class, args);
	}

}
