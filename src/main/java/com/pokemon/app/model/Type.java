package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the type_pokemon database table.
 * 
 */
@Entity
@Table(name="type_pokemon")
@NamedQuery(name="Type.findAll", query="SELECT t FROM Type t")
public class Type implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="label", nullable=false, length=50)
	private String label;
	
	@JsonIgnore
	@Nullable
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "type", orphanRemoval = true)
	private List<PokemonType> pokemonList = new ArrayList<>();
	
	public Type() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<PokemonType> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(List<PokemonType> pokemonList) {
		this.pokemonList = pokemonList;
	}
}