package com.niftem2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableScheduling
@EnableWebSecurity
@EnableJpaRepositories("com.niftem2.app.repositor.*")
public class ExamApplication extends SpringBootServletInitializer {	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ExamApplication.class);
       
    }	
	
	
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/Niftem1");    
		 SpringApplication.run(ExamApplication.class, args);	
		// PropertyConfigurator.configure("log4j.properties");
	}
}
