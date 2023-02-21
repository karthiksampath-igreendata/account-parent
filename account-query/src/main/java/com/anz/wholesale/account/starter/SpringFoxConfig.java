package com.anz.wholesale.account.starter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

	private static final Set<String> PRODUCES_CONSUMES = new HashSet<>(Arrays.asList("application/json"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).groupName("api").select()
				.apis(RequestHandlerSelectors.basePackage("com.anz.wholesale.account.controller"))
				.paths(PathSelectors.any()).build().produces(PRODUCES_CONSUMES).consumes(PRODUCES_CONSUMES);
	}
}
