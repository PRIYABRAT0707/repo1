package com.serviceregistry.microserviceimplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(scanBasePackages = {"com.serviceregistry"})
@EnableEurekaServer
public class MicroserviceimplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceimplementationApplication.class, args);
	}

}
