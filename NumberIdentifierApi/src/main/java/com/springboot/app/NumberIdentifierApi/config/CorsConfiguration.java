package com.springboot.app.NumberIdentifierApi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.app.NumberIdentifierApi.bean.AppProperties;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
	
	@Autowired
	private AppProperties appProperties;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins(appProperties.getCorsAllowedUrl()).allowedMethods("GET", "PUT", "POST");
	}

}
