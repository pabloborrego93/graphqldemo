package com.pbg.graphqldemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

	private String cnProviderUrl;
	private String appsProviderUrl;
	
	public String getCnProviderUrl() {
		return cnProviderUrl;
	}
	public void setCnProviderUrl(String cnProviderUrl) {
		this.cnProviderUrl = cnProviderUrl;
	}
	public String getAppsProviderUrl() {
		return appsProviderUrl;
	}
	public void setAppsProviderUrl(String appsProviderUrl) {
		this.appsProviderUrl = appsProviderUrl;
	}
	
}
