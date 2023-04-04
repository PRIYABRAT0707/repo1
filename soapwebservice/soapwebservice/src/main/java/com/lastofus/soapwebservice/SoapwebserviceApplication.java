package com.lastofus.soapwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.lastofus"})
@ComponentScan(value = {"com.lastofus"})
public class SoapwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapwebserviceApplication.class, args);
	}

}
