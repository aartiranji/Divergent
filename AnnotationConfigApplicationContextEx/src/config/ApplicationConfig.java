package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.HelloBeanClass;

@Configuration
public class ApplicationConfig {
	
	@Bean(name="helloBean")
	public HelloBeanClass helloBeanClass(){
		return new HelloBeanClass();
	}

	
}
