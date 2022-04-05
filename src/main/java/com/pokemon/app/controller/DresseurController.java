/**
 * 
 */
package com.pokemon.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.pokemon.app.model.Dresseur;
import com.pokemon.app.model.PokemonDresseur;
import com.pokemon.app.service.DresseurService;
import com.pokemon.app.service.PokemonDresseurService;

/**

 */
@RestController
public class DresseurController {
	@Autowired
	private DresseurService dresseurService;

	@Autowired
	private PokemonDresseurService pokemonDresseurService;

	@GetMapping("/")
	public String index(Model model) {
	    model.addAttribute("message", "Welcome");
		return "index";
	}
	
	@GetMapping("/dresseurs")
	public String listeDresseurs(Model model) {
	    Iterable<Dresseur> listDresseurs = dresseurService.getDresseurs();
	    Iterable<PokemonDresseur> listsPokemonDresseur = pokemonDresseurService.getPokemonsDresseurs();
	    List<Object> list = new ArrayList<Object>();
	    for(PokemonDresseur pokemonDresseur : listsPokemonDresseur) {
	    	Object dresseurPokemon = new Object() {
	    		String dresseur = pokemonDresseur.getDresseur().getName();
	    		
	    	};
	    }
	    model.addAttribute("dresseurs", listDresseurs);
		return "list-dresseur-pokemons";
		
	}
	

}
