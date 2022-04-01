/**
 * 
 */
package com.pokemon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.app.model.Pokemon;

/**
 * @author marvin
 *
 */
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
