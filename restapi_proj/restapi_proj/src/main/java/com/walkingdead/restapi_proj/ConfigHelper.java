package com.walkingdead.restapi_proj;

import com.walkingdead.controller.RestapiController;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Locale;

@Configuration
@EnableWebMvc
public class ConfigHelper implements WebMvcConfigurer {

    @Bean
    public Docket getApi(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(s -> s.matches("/")).build();
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.ignoreAcceptHeader(true).favorParameter(true).parameterName("mediaType")
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("json",MediaType.APPLICATION_JSON)
                .mediaType("xml",MediaType.APPLICATION_XML);
    }

    @Bean
    public LocaleResolver getLocalResolver(){
        SessionLocaleResolver pp=new SessionLocaleResolver();
        pp.setDefaultLocale(Locale.US);
        return pp;
    }
    @Bean
    public ResourceBundleMessageSource getResourceBundleMessageSource(){
        ResourceBundleMessageSource hh=new ResourceBundleMessageSource();
        hh.setBasename("message");
        return hh;
    }
}
