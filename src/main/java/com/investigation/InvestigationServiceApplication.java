package com.investigation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InvestigationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestigationServiceApplication.class, args);
	}

}
	