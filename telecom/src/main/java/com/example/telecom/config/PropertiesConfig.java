package com.example.telecom.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
 
@Configuration
@PropertySource(value ="/exceptions.properties")
public class PropertiesConfig 
{
	@Autowired
	private Environment env;
	@Bean
	public void readFromProp() {
		System.out.println(env.getProperty("app.title")+"docomo");
	}
	
	
}
 