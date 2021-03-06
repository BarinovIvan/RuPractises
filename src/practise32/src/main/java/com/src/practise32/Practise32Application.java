package com.src.practise32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Practise32Application {

	public static void main(String[] args) {
		SpringApplication.run(Practise32Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplateBuilder().build();
	}
}

