package com.facebook.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.facebook")
@EnableJpaRepositories(basePackages = "com.facebook.dao")
@EntityScan(basePackages = "com.facebook.pojo")
public class FacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacebookApplication.class, args);
		System.out.println("hello spring boot");
	}

}
