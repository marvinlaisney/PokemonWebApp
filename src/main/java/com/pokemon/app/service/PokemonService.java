/**
 * 
 */
package com.pokemon.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemon.app.model.Pokemon;
import com.pokemon.app.repository.PokemonRepository;

/**
 * @author marvin
 *
 */
@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    public Optional<Pokemon> getPokemon(final Long id) {
        return pokemonRepository.findById(id);
    }

    public Iterable<Pokemon> getPokemons() {
        return pokemonRepository.findAll();
    }

    public void deletepokemon(final Long id) {
    	pokemonRepository.deleteById(id);
    }

    public Pokemon savePokemon(Pokemon pokemon) {
    	Pokemon savedpokemon = pokemonRepository.save(pokemon);
        return savedpokemon;
    }
}
