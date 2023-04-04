package com.walkingdead.restapi_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.walkingdead"})
@EnableFeignClients(basePackages = "com.walkingdead")
public class RestapiProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiProjApplication.class, args);
	}

}
