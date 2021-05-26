package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectDemoApplication {

	public static void main(String[] args) {
		System.out.println("first data");
		System.out.println("second data");
		SpringApplication.run(ProjectDemoApplication.class, args);
	}

}
