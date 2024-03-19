package com.collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealTimeQueriesJ8CollectorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeQueriesJ8CollectorsApplication.class, args);
		System.out.println(Thread.currentThread());
	}
}
