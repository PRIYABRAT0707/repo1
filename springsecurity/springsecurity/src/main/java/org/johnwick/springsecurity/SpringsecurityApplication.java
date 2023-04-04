package org.johnwick.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;


@SpringBootApplication(scanBasePackages = {"org.johnwick"})
@ComponentScan(basePackages = {"org.johnwick"})
@EnableJpaRepositories(basePackages = {"org.johnwick"})
@EntityScan(basePackages = {"org.johnwick"})
public class SpringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}




	//for internationalization of RestAPI
	/*@Bean
	public LocaleResolver localeResolver()
	{
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
	//configuring ResourceBundle
	@Bean
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}*/

}
