package org.ncu.spring_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ComponentScan("org.ncu.spring_java_config") */
public class GreetingAppConfig {
	
	// Define methods to expose beans of dependency classes - FrenchFortuneService 
	@Bean
	public FortuneService frenchFortune() {
		return new FrenchFortuneService();
	}
	
	
	// Inject bean dependencies into dependent class - FrenchGreetingService 
	@Bean
	public GreetingService frenchGreeting() {
		return new FrenchGreetingService(frenchFortune());
	}
	
}
