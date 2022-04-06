/**
 * 
 */
package com.pokemon.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pokemon.app.model.Dresseur;
import com.pokemon.app.service.DresseurService;
import com.pokemon.app.service.PokemonDresseurService;

/**

 */
@Controller
public class DresseurController {
	@Autowired
	private DresseurService dresseurService;

//	@Autowired
//	private PokemonDresseurService pokemonDresseurService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Welcome");
		return "index";
	}

	@GetMapping("/dresseurs")
	public String listeDresseurs(Model model) {
		// Récupération de tous les pokémons par dresseur
		Iterable<Dresseur> listDresseurs = dresseurService.getDresseurs();
	    
		model.addAttribute("listDresseurs", listDresseurs);
		return "pokemon-dresseur";

	}

}
