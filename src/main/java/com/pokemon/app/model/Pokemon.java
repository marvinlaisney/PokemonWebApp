package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the pokemon database table.
 * 
 */
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
	
	@Nullable
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pokemon", orphanRemoval = true)
	private List<PokemonType> typeList = new ArrayList<>();

	@JsonIgnore
	@Nullable
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pokemon", orphanRemoval = true)
	private List<PokemonDresseur> dresseurList = new ArrayList<>();

	public Pokemon() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(Integer healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public List<PokemonType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<PokemonType> typeList) {
		this.typeList = typeList;
	}

	public Pokemon getPokemonEvolution() {
		return pokemonEvolution;
	}

	public void setPokemonEvolution(Pokemon pokemonEvolution) {
		this.pokemonEvolution = pokemonEvolution;
	}
}