/**
 * 
 */
package com.pokemon.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.app.model.Dresseur;

/**
 * @author marvin
 *
 */
@Repository
public interface DresseurRepository extends CrudRepository<Dresseur, Long>{

}
