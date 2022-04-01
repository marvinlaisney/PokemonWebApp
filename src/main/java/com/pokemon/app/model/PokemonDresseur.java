package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the pokemon_dresse database table.
 * 
 */
@Entity
@Table(name="pokemon_dresse", uniqueConstraints= @UniqueConstraint(columnNames={"pokemon_id", "dresseur_id"}))
@NamedQuery(name="PokemonDresseur.findAll", query="SELECT p FROM PokemonDresseur p")
public class PokemonDresseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@EmbeddedId
	private PokemonDresseurKey pokemonDresseurId;
	
    @MapsId("pokemonId")
    @JoinColumn(name = "pokemon_id")
    @ManyToOne(optional = false, targetEntity = Pokemon.class, fetch = FetchType.EAGER)
    private Pokemon pokemon;

    @MapsId("dresseurId")
    @JoinColumn(name = "dresseur_id")
    @ManyToOne(optional = false, targetEntity = Dresseur.class, fetch = FetchType.EAGER)
    private Dresseur dresseur;

	@Column(length=50)
	private String nickname;

	public PokemonDresseur() {
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public PokemonDresseurKey getPokemonDresseurId() {
		return this.pokemonDresseurId;
	}
	
	public void setId(PokemonDresseurKey pokemonDresseurId) {
		this.pokemonDresseurId = pokemonDresseurId;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public Dresseur getDresseur() {
		return dresseur;
	}

	public void setDresseur(Dresseur dresseur) {
		this.dresseur = dresseur;
	}
}