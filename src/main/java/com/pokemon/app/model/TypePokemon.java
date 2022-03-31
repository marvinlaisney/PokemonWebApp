package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the type_pokemon database table.
 * 
 */
@Data
@Entity
@Table(name="type_pokemon")
@NamedQuery(name="TypePokemon.findAll", query="SELECT t FROM TypePokemon t")
public class TypePokemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(nullable=false, length=50)
	private String label;

	//bi-directional many-to-many association to Pokemon
	@ManyToMany(mappedBy="typePokemons")
	private List<Pokemon> pokemons;

	//bi-directional many-to-many association to Pokemon
	@ManyToMany
	@JoinTable(
		name="pokemon_est_de_type"
		, joinColumns={
			@JoinColumn(name="type_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="pokemon_id", nullable=false)
			}
		)
	private List<Pokemon> listePokemons;
	
	public TypePokemon() {
	}

}