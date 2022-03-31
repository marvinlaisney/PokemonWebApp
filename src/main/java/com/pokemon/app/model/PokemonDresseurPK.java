package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

/**
 * The primary key class for the pokemon_dresse database table.
 * 
 */
@Data
@Embeddable
public class PokemonDresseurPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pokemon_id", insertable=false, updatable=false, unique=true, nullable=false)
	private Long pokemonId;

	@Column(name="dresseur_id", insertable=false, updatable=false, unique=true, nullable=false)
	private Long dresseurId;

	public PokemonDresseurPK() {
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PokemonDresseurPK)) {
			return false;
		}
		PokemonDresseurPK castOther = (PokemonDresseurPK)other;
		return 
			this.pokemonId.equals(castOther.pokemonId)
			&& this.dresseurId.equals(castOther.dresseurId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pokemonId.hashCode();
		hash = hash * prime + this.dresseurId.hashCode();
		
		return hash;
	}
}