/**
 * 
 */
package com.pokemon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pokemon.app.model.PokemonDresseur;

/**
 * @author marvin
 *
 */
@Repository
public interface PokemonDresseurRepository extends JpaRepository<PokemonDresseur, Long>{
	public Iterable<PokemonDresseur> findByPokemonDresseurIdDresseurId(Long dresseurId);
	
	public Iterable<PokemonDresseur> findByNickname(String nickname);
//	
//	public List<PokemonDresseur> findByDresseurId(Long dresseurId);
}
