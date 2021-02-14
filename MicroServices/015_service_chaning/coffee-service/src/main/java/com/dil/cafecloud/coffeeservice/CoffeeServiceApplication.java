package com.dil.cafecloud.coffeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.dil.cafecloud.model.coffee")
public class CoffeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeServiceApplication.class, args);
	}

}
