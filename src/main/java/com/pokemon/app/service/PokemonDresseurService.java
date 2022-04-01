/**
 * 
 */
package com.pokemon.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pokemon.app.model.PokemonDresseur;
import com.pokemon.app.model.PokemonDresseurKey;
import com.pokemon.app.repository.PokemonDresseurRepository;

/**
 * @author marvin
 *
 */
@Service
public class PokemonDresseurService {
	@Autowired
	private PokemonDresseurRepository pokemonDresseurRepository;

//	public PokemonDresseur getPokemonDresseur(final PokemonDresseurPK pokemonDresseur) {
//        return pokemonDresseurRepository.findByPokemonIdAndDresseurId(pokemonDresseur.getPokemonId(), pokemonDresseur.getDresseurId());
//    }
//	
//	public List<PokemonDresseur> getDresseurPokemons(long dresseurId){
//		return pokemonDresseurRepository.findByDresseurId(dresseurId);
//	}

	public Iterable<PokemonDresseur> getPokemonsDresseurs() {
		return pokemonDresseurRepository.findAll();
	}

	public Iterable<PokemonDresseur> getPokemonsByDresseur(Long dresseurId) {
		return pokemonDresseurRepository.findByPokemonDresseurIdDresseurId(dresseurId);
	}

	public Iterable<PokemonDresseur> getPokemonsBySurnom(String surnom) {
		return pokemonDresseurRepository.findByNickname(surnom);
	}

	public void deletePokemonDresseur(final Long id) {
		pokemonDresseurRepository.deleteById(id);
	}

	public PokemonDresseur savePokemonDresseur(PokemonDresseur pokemonDresseur) {
		PokemonDresseur savedpokemonDresseur = pokemonDresseurRepository.save(pokemonDresseur);
		return savedpokemonDresseur;
	}
}
