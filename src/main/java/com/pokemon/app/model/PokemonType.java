package com.pokemon.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pokemon_est_de_type", uniqueConstraints= @UniqueConstraint(columnNames={"pokemon_id", "type_id"}))
public class PokemonType implements Serializable{

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private PokemonTypeKey id;
    
    @MapsId("pokemonId")
    @JoinColumn(name = "pokemon_id")
    @ManyToOne(optional = false, targetEntity = Pokemon.class, fetch = FetchType.EAGER)
    private Pokemon pokemon;

    @MapsId("typeId")
    @JoinColumn(name = "type_id")
    @ManyToOne(optional = false, targetEntity = Type.class, fetch = FetchType.EAGER)
    private Type type;
    
}
