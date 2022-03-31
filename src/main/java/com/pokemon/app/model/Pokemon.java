package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

import java.util.List;


/**
 * The persistent class for the pokemon database table.
 * 
 */
@Data
@Entity
@Table(name="pokemon")
@NamedQuery(name="Pokemon.findAll", query="SELECT p FROM Pokemon p")
public class Pokemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="health_points", nullable=false)
	private Integer healthPoints;

	@Column(name="name_", nullable=false, length=50)
	private String name;

	@Column(name="number_", nullable=false)
	private Integer number;

	//bi-directional one-to-one association to Pokemon
	@OneToOne
	@JoinColumn(name="evolution")
	private Pokemon pokemonEvolution;

	//bi-directional many-to-many association to TypePokemon
	@ManyToMany
	@JoinTable(
		name="pokemon_est_de_type"
		, joinColumns={
			@JoinColumn(name="pokemon_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="type_id", nullable=false)
			}
		)
	private List<TypePokemon> typePokemons;

	public Pokemon() {
	}
}