package com.pokemon.app.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;


/**
 * The persistent class for the dresseur database table.
 * 
 */
@Data
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

	public Dresseur() {
	}
}