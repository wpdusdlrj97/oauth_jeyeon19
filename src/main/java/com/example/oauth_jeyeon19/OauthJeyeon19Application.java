package com.example.oauth_jeyeon19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OauthJeyeon19Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OauthJeyeon19Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(OauthJeyeon19Application.class, args);
	}

}
