/**
 * 
 */
package com.pokemon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pokemon.app.model.Pokemon;
import com.pokemon.app.model.PokemonType;
import com.pokemon.app.service.PokemonService;
import com.pokemon.app.service.PokemonTypeService;

/**
 *
 *
 */
@RestController
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@Autowired
	private PokemonTypeService pokemonTypeService;
	
	@GetMapping("/api/pokemons")
	public Iterable<Pokemon> listePokemons() {		
		return pokemonService.getPokemons();
	}
	
	@GetMapping("/api/pokemonstype")
	public Iterable<PokemonType> listePokemonsType() {	
		var test = pokemonTypeService.getPokemonsType();
		return test;
	}
}
