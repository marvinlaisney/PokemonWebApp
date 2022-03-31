/**
 * 
 */
package com.pokemon.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.app.model.PokemonDresseur;

/**
 * @author marvin
 *
 */
@Repository
public interface PokemonDresseurRepository extends CrudRepository<PokemonDresseur, Long>{
	public PokemonDresseur findByPokemonIdAndDresseurId(Long pokemonId, Long dresseurId);
	
	public List<PokemonDresseur> findByDresseurId(Long dresseurId);
}
