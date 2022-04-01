package com.pokemon.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.pokemon.app.service.*"})
public class PokemonWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonWebAppApplication.class, args);
	}

}
