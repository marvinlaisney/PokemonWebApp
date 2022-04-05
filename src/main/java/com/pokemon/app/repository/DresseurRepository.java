/**
 * 
 */
package com.pokemon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.app.model.Dresseur;

/**
 * 
 *
 */
@Repository
public interface DresseurRepository extends JpaRepository<Dresseur, Long>{

}
