package com.springboot.app.NumberIdentifierApi.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties
@Configuration
public class AppProperties {
	private String corsAllowedUrl;

	public String getCorsAllowedUrl() {
		return corsAllowedUrl;
	}

	public void setCorsAllowedUrl(String corsAllowedUrl) {
		this.corsAllowedUrl = corsAllowedUrl;
	}

}
