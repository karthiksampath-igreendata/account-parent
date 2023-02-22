package com.anz.wholesale.account.starter;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.anz.wholesale.account.service.DataLoaderService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EntityScan(basePackages = { "com.anz.wholesale.account.domain" })
@ComponentScan(basePackages = { "com.anz.wholesale.account.controller", "com.anz.wholesale.account.service",
		"com.anz.wholesale.account.config", "com.anz.wholesale.account.exception" })
@EnableJpaRepositories(basePackages = { "com.anz.wholesale.account.repository" })
@SpringBootApplication
@EnableWebMvc
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		logger.info("Command Service Started");

		// This block of code is only used to load test data if embedded/mysql database
		// is
		// used for testing
		if (Objects.nonNull(context)) {
			context.getBean(DataLoaderService.class).loadDataToDB();
		}
	}
}
