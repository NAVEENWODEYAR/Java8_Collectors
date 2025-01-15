package com.collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.*;

@SpringBootApplication
@OpenAPIDefinition
public class RealTimeQueriesJ8CollectorsApplication {

 private static final Logger log = LoggerFactory.getLogger(RealTimeQueriesJ8CollectorsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RealTimeQueriesJ8CollectorsApplication.class, args);
log.info("Application Started");
	}
}
