package com.ribbon.identity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ribbon"})
@EnableJpaRepositories(basePackages = {"com.ribbon"})
@EntityScan(basePackages = {"com.ribbon"})
@ComponentScan(basePackages = {"com.ribbon"})
@EnableDiscoveryClient
public class IdentityApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityApplication.class, args);

	}

}
