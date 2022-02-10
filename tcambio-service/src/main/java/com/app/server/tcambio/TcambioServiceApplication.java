package com.app.server.tcambio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class TcambioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcambioServiceApplication.class, args);
	}

}
