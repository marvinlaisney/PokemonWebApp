package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the pokemon_dresse database table.
 * 
 */
@Data
@Entity
@Table(name="pokemon_dresse")
@NamedQuery(name="PokemonDresseur.findAll", query="SELECT p FROM PokemonDresseur p")
public class PokemonDresseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PokemonDresseurPK id;

	@Column(length=50)
	private String nickname;

	public PokemonDresseur() {
	}

	public PokemonDresseurPK getId() {
		return this.id;
	}

	public void setId(PokemonDresseurPK id) {
		this.id = id;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}