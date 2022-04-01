package com.pokemon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pokemon.app.model.PokemonType;

public interface PokemonTypeRepository extends JpaRepository<PokemonType, Long>{

}
