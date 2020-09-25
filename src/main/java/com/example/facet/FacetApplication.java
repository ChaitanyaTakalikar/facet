package com.example.facet;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FacetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacetApplication.class, args);
	}
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(regex("/asset.*"))
                .apis(RequestHandlerSelectors.basePackage("com.example.facet.controller"))
                .build().apiInfo(metaData());
    }
	
	private ApiInfo metaData() {
        return new ApiInfo(
            "Facet Category REST API in Spring Boot",
            "Spring Boot REST API for Facet Category",
            "1.0",
            "Terms of service",
            new springfox.documentation.service.Contact("Chaitanya Takalikar",
            		"https://www.youtube.com/channel/UCISsG6Ys9uc9SVO9q1M1kSg","chaitanya7725@gmail.com"),
           "Apache License Version 2.0",
            "https://www.apache.org/licenses/LICENSE-2.0",
            Collections.emptyList());
    }
	
}
