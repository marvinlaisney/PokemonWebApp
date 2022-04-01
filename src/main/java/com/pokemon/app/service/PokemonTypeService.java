package com.pokemon.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pokemon.app.model.PokemonType;
import com.pokemon.app.repository.PokemonTypeRepository;

@Service
public class PokemonTypeService {
	@Autowired
	private PokemonTypeRepository pokemonTypeRepository;
	
	public Iterable<PokemonType> getPokemonsType() {
		return pokemonTypeRepository.findAll();
	}

	public void deletePokemonType(final Long pokemonTypeKeyId) {
		pokemonTypeRepository.deleteById(pokemonTypeKeyId);
	}

	public PokemonType savePokemonType(PokemonType pokemonType) {
		PokemonType savedpokemonType = pokemonTypeRepository.save(pokemonType);
		return savedpokemonType;
	}
}
