package com.pokemon.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PokemonTypeKey implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "pokemon_id")
    Long pokemonId;

    @Column(name = "type_id")
    Long typeId;
    
	public PokemonTypeKey() {
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PokemonTypeKey)) {
			return false;
		}
		PokemonTypeKey castOther = (PokemonTypeKey)other;
		return 
			this.pokemonId.equals(castOther.pokemonId)
			&& this.typeId.equals(castOther.typeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pokemonId.hashCode();
		hash = hash * prime + this.typeId.hashCode();
		
		return hash;
	}
	
    public Long getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(Long pokemonId) {
		this.pokemonId = pokemonId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
}
