package com.app.server.tarifario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceTarifarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTarifarioApplication.class, args);
	}

}
