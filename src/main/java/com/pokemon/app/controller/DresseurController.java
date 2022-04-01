/**
 * 
 */
package com.pokemon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.pokemon.app.model.Dresseur;
import com.pokemon.app.model.PokemonDresseur;
import com.pokemon.app.service.DresseurService;
import com.pokemon.app.service.PokemonDresseurService;

/**
 * @author marvin
 *
 */
@RestController
public class DresseurController {
	@Autowired
	private DresseurService dresseurService;

	@Autowired
	private PokemonDresseurService pokemonDresseurService;

	@GetMapping("/api/dresseurs")
	public Iterable<Dresseur> listeDresseurs() {
		return dresseurService.getDresseurs();
	}
	
	@GetMapping("/api/pokemonsdresseurs")
	public Iterable<PokemonDresseur> listePokemonsDresseurs(){
		return pokemonDresseurService.getPokemonsDresseurs();
	}

	@GetMapping("/api/pokemonsdresseur/{id}")
	public Iterable<PokemonDresseur> listePokemonByDresseur(@PathVariable(value = "id") Long dresseurId){
		return pokemonDresseurService.getPokemonsByDresseur(dresseurId);
	}
	
	@GetMapping("/api/pokemonsdresseursurnom/{nickname}")
	public Iterable<PokemonDresseur> listePokemonByDresseur(@PathVariable(value = "nickname") String surnom){
		return pokemonDresseurService.getPokemonsBySurnom(surnom);
	}
}
