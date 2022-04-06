/**
 * 
 */
package com.pokemon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import com.pokemon.app.model.Pokemon;
import com.pokemon.app.service.PokemonService;

/**
 *
 */
@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@CrossOrigin(allowedHeaders = "http://localhost:9000")
	
	@GetMapping("/pokedex")
	public String listePokemon (Model model) {
		Iterable<Pokemon> listPokemon = pokemonService.getPokemons();
		model.addAttribute("pokemons", listPokemon);
		return "list-pokedex";
	}
}
