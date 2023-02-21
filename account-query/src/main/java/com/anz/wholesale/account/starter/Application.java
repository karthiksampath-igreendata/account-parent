package com.anz.wholesale.account.starter;

import java.util.Arrays;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.anz.wholesale.account.service.DataLoaderService;

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
		logger.info("Query Service Started");

		//This block of code is only used to load test data if embedded database is used for testing
		if (Objects.nonNull(context)) {
			context.getBean(DataLoaderService.class).loadDataToDB();
		}
	}
}
