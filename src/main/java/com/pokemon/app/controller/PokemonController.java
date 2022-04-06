/**
 * 
 */
package com.pokemon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pokemon.app.model.Pokemon;
import com.pokemon.app.model.PokemonType;
import com.pokemon.app.service.PokemonService;
import com.pokemon.app.service.PokemonTypeService;

/**
 * @author marvin & helene
 *
 */
@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@Autowired
	private PokemonTypeService pokemonTypeService;
	
	@CrossOrigin(allowedHeaders = "http://localhost:9000")
	
	@GetMapping("/pokedex")
	public String listePokemon (Model model) {
		Iterable<Pokemon> listPokemon = pokemonService.getPokemons();
		model.addAttribute("pokemons", listPokemon);
		return "list-pokedex";
	}
	
//	@GetMapping("/api/pokemonstype")
//	public Iterable<PokemonType> listePokemonsType() {	
//		var test = pokemonTypeService.getPokemonsType();
//		return test;
//	}
	
}
