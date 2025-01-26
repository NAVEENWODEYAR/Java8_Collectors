package com.collectors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
@EnableScheduling
public class RealTimeQueriesJ8CollectorsApplication {

	private static final Logger log = LoggerFactory.getLogger(RealTimeQueriesJ8CollectorsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RealTimeQueriesJ8CollectorsApplication.class, args);
		log.info("Application Started");
	}
	
	@Scheduled(cron = "0 0/5 * * * ?")
	public void cronMethod() {
		log.warn("CRON EXPRESSION {0 0/5 * * * ?}");
		log.info(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy hh:mm a")));
		log.trace("Executes every 5 minutes");
	}
}
