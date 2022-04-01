/**
 * 
 */
package com.pokemon.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.app.exception.RessourceNotFoundException;
import com.pokemon.app.model.Dresseur;
import com.pokemon.app.model.Pokemon;
import com.pokemon.app.model.PokemonDresseur;
import com.pokemon.app.repository.DresseurRepository;
import com.pokemon.app.service.DresseurService;
import com.pokemon.app.service.PokemonDresseurService;
import com.pokemon.app.service.PokemonService;

/**
 * @author marvin
 *
 */
@RestController
public class DresseurController {
//
	@Autowired
	private DresseurService dresseurService;
//	
//	@Autowired
//	private PokemonService pokemonService;
//	
//	@Autowired
//	private PokemonDresseurService pokemonDresseurService;

	@GetMapping("/api/dresseurs")
	public Iterable<Dresseur> listeDresseurs() {
//		Iterable<Dresseur> listDresseurs = dresseurService.getDresseurs();
//		
//		model.addAttribute("message", "coucou");
//		model.addAttribute("dresseurs", listDresseurs);
//	    return "list-dresseur-pokemons";
		return dresseurService.getDresseurs();
	}

//	@GetMapping("/{id}")
//	public ResponseEntity<Dresseur> getDresseur(@PathVariable(value = "id") Long id) throws RessourceNotFoundException {
//		Dresseur dresseur = dresseurService.getDresseur(id)
//				.orElseThrow(() -> new RessourceNotFoundException("Dresseur inexistant"));
////		
////		model.addAttribute("message", "coucou");
////		model.addAttribute("dresseurs", listDresseurs);
////	    return "list-dresseur-pokemons";
//		return ResponseEntity.ok().body(dresseur);
//	}

//	@GetMapping("/dresseurs/{id}")
//	public String listeDresseurPokemons(Model model, @PathVariable("id") final long id) {
//		Optional<Dresseur> dresseur = dresseurService.getDresseur(id);
//		List<PokemonDresseur> listDresseurPokemons = pokemonDresseurService.getDresseurPokemons(id);
//		
//		List<Optional<Pokemon>> pokemons = new ArrayList<Optional<Pokemon>>();
//		
//		for(PokemonDresseur pokemonDresseur: listDresseurPokemons) {
//			Optional<Pokemon> pokemon = pokemonService.getPokemon(pokemonDresseur.getId().getPokemonId());
//			pokemons.add(pokemon);
//		}
//		
//		model.addAttribute("dresseur", "coucou");
//		model.addAttribute("dresseur", dresseur);
//		model.addAttribute("listDresseurPokemons", listDresseurPokemons);
//		model.addAttribute("pokemons", pokemons);
//	    return "list-dresseur-pokemons";
//	}
}
