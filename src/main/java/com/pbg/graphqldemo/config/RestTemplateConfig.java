package com.pbg.graphqldemo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class RestTemplateConfig {

	@Bean(name = "cnProviderClient")
	public RestTemplate cnProviderClient(ApplicationProperties applicationProperties) {
		return new RestTemplateBuilder()
			.rootUri(applicationProperties.getCnProviderUrl())
			.build();
	}
	
	@Bean(name = "appsProviderClient")
	public RestTemplate appsProviderClient(ApplicationProperties applicationProperties) {
		return new RestTemplateBuilder()
			.rootUri(applicationProperties.getAppsProviderUrl())
			.build();
	}
	
}
