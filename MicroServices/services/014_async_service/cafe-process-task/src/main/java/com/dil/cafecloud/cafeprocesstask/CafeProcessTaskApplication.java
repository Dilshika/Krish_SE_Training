package com.dil.cafecloud.cafeprocesstask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CafeProcessTaskApplication {

	@Bean
	CafeProcessTaskRunner getProcessTaskRunner(){
		return new CafeProcessTaskRunner();
	};

	public static void main(String[] args) {
		SpringApplication.run(CafeProcessTaskApplication.class, args);
	}

}
