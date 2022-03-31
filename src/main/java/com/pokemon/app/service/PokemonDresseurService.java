/**
 * 
 */
package com.pokemon.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.app.model.PokemonDresseur;
import com.pokemon.app.model.PokemonDresseurPK;
import com.pokemon.app.repository.PokemonDresseurRepository;

/**
 * @author marvin
 *
 */
@Service
public class PokemonDresseurService {
	@Autowired
	private PokemonDresseurRepository pokemonDresseurRepository;

	public PokemonDresseur getPokemonDresseur(final PokemonDresseurPK pokemonDresseur) {
        return pokemonDresseurRepository.findByPokemonIdAndDresseurId(pokemonDresseur.getPokemonId(), pokemonDresseur.getDresseurId());
    }
	
	public List<PokemonDresseur> getDresseurPokemons(long dresseurId){
		return pokemonDresseurRepository.findByDresseurId(dresseurId);
	}

	public Iterable<PokemonDresseur> getPokemonsDresseurs() {
		return pokemonDresseurRepository.findAll();
	}

	public void deletepokemon(final Long id) {
		pokemonDresseurRepository.deleteById(id);
	}

	public PokemonDresseur savePokemonDresseur(PokemonDresseur pokemonDresseur) {
		PokemonDresseur savedpokemonDresseur = pokemonDresseurRepository.save(pokemonDresseur);
		return savedpokemonDresseur;
	}
}
