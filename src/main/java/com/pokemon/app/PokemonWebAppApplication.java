package com.pokemon.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.pokemon.app.service.*"})
public class PokemonWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonWebAppApplication.class, args);
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (!registry.hasMappingForPattern("/static/**")) {
			registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		}
	}

}
