/**
 * 
 */
package com.pokemon.app.controller;

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
 * @author marvin
 *
 */
@Controller
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
	    model.addAttribute("dresseurs", listDresseurs);
		return "list-dresseur-pokemons";
	}
	
//	@GetMapping("/api/pokemonsdresseurs")
//	public Iterable<PokemonDresseur> listePokemonsDresseurs(){
//		return pokemonDresseurService.getPokemonsDresseurs();
//	}
//
//	@GetMapping("/api/pokemonsdresseur/{id}")
//	public Iterable<PokemonDresseur> listePokemonByDresseur(@PathVariable(value = "id") Long dresseurId){
//		return pokemonDresseurService.getPokemonsByDresseur(dresseurId);
//	}
//	
//	@GetMapping("/api/pokemonsdresseursurnom/{nickname}")
//	public Iterable<PokemonDresseur> listePokemonByDresseur(@PathVariable(value = "nickname") String surnom){
//		return pokemonDresseurService.getPokemonsBySurnom(surnom);
//	}
}
