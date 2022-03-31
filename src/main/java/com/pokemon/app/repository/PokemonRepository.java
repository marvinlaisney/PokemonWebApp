/**
 * 
 */
package com.pokemon.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.pokemon.app.model.Pokemon;

/**
 * @author marvin
 *
 */
public interface PokemonRepository extends CrudRepository<Pokemon, Long>{

}
