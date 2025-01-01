package com.collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@OpenAPIDefinition
public class RealTimeQueriesJ8CollectorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeQueriesJ8CollectorsApplication.class, args);
	}
}
