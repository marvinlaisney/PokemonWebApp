package com.pokemon.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EquipePokemon implements Serializable {

	private static final long serialVersionUID = 1L;

	private Dresseur dresseur;
	private List<PokemonDresseur> listPokemons;

	public EquipePokemon() {
		this.listPokemons = new ArrayList<PokemonDresseur>();
	}

	public Dresseur getDresseur() {
		return dresseur;
	}

	public void setDresseur(Dresseur dresseur) {
		this.dresseur = dresseur;
	}

	public List<PokemonDresseur> getListPokemons() {
		return listPokemons;
	}

	public void setListPokemons(List<PokemonDresseur> listPokemons) {
		this.listPokemons = listPokemons;
	}

	public void addToList(final PokemonDresseur newPokemonDresseur) {
		this.listPokemons.add(newPokemonDresseur);
	}
}
