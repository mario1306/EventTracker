package com.pluralsight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication
@Configuration
@EnableWebMvc
//@EnableAutoConfiguration
@ComponentScan( basePackages = "com.pluralsight")
public class WebConfig {

//	@Bean
//	public InternalResourceViewResolver getInternalResourceViewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/jsp/");
//		resolver.setSuffix("*.jsp");
//		return resolver;
//	}
}
