package com.pokemon.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.lang.Nullable;


/**
 * The persistent class for the dresseur database table.
 * 
 */
@Entity
@Table(name="dresseur")
@NamedQuery(name="Dresseur.findAll", query="SELECT d FROM Dresseur d")
public class Dresseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="name_", nullable=false, length=50)
	private String name;

	@Column(nullable=false, length=100)
	private String ville;
	
//	@Nullable
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "dresseur", orphanRemoval = true)
//	private List<PokemonDresseur> dresseurList = new ArrayList<>();

	public Dresseur() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}