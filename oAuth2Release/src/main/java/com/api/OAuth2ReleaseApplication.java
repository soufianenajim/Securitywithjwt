package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan("com.app")
public class OAuth2ReleaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ReleaseApplication.class, args);
	}
}
