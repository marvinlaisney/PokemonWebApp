/**
 * 
 */
package com.pokemon.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pokemon.app.model.Dresseur;
import com.pokemon.app.model.EquipePokemon;
import com.pokemon.app.model.PokemonDresseur;
import com.pokemon.app.service.DresseurService;
import com.pokemon.app.service.PokemonDresseurService;

/**

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
		// Récupération de tous les pokémons par dresseur
		Iterable<PokemonDresseur> listPokemonsDresseur = pokemonDresseurService.getPokemonsDresseurs();
		
		// Initialisation de la liste des équipes
		List<EquipePokemon> listEquipes = new ArrayList<EquipePokemon>();
	
		// Pour chaque occurence de la table pokemon_dresse
	    for(PokemonDresseur pokemonDresseur : listPokemonsDresseur) {
	    	
	    	// Récupération du dresseur
    		Dresseur dresseur = pokemonDresseur.getDresseur();
    		
    		// Création d'uné équipe pokémon
    		EquipePokemon equipe = new EquipePokemon();
    		
    		// Correspondance du dresseur de l'équipe
    		equipe.setDresseur(dresseur);
    		
    		// Ajout du pokémon en cours d'occurence dans la liste des pokémons de l'équipe
    		equipe.setListPokemons(Arrays.asList(pokemonDresseur));
    		
    		// Y a-t-il déjà une équipe pokémon dont le dresseur est celui en cours d'itération ?
    		boolean itemExists = listEquipes.stream().map(EquipePokemon::getDresseur).anyMatch(pokemonDresseur.getDresseur()::equals);
    		
    		//Si oui
    		if(itemExists) {
    			// Récupération de l'équipe pokémon
    			EquipePokemon existingEquipe = listEquipes.stream()
    					  .filter(item -> pokemonDresseur.getDresseur().equals(item.getDresseur()))
    					  .findAny()
    					  .orElse(null);
    			
    			// Récupération de la liste déjà existante des pokémons
    			List<PokemonDresseur> existingList = existingEquipe.getListPokemons();
    			
    			// Création d'une nouvelle liste de pokémon
    			List<PokemonDresseur> newList = new ArrayList<PokemonDresseur>();
    			
    			// Concaténation des deux listes
    			newList.addAll(existingList);
    			newList.add(pokemonDresseur);
    			
    			// Mise à jour de la liste des pokémons dans le modèle
    			existingEquipe.setListPokemons(newList);
    			
    		}else {
    			//Sinon on ajoute l'équipe à la liste des équipes
        		listEquipes.add(equipe);
    		}
	    }
	    
		model.addAttribute("listPokemonsDresseurs", listEquipes);
		return "pokemon-dresseur";

	}

}
