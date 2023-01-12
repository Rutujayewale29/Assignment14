package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceriesApplication.class, args);
		System.out.println("Groceries Application Started....");
	}

}
