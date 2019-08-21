package com.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.WebApplicationInitializer;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
@EntityScan
@EnableJpaRepositories(basePackages="com.master.entities", entityManagerFactoryRef="emf")
public class App extends SpringBootServletInitializer implements WebApplicationInitializer {
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
}
