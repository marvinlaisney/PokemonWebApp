/**
 * 
 */
package com.pokemon.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pokemon.app.model.Dresseur;
import com.pokemon.app.repository.DresseurRepository;

/**
 * @author marvin
 *
 */
public class DresseurService {
    @Autowired
    private DresseurRepository dresseurRepository;

    public Optional<Dresseur> getDresseur(final Long id) {
        return dresseurRepository.findById(id);
    }

    public Iterable<Dresseur> getDresseurs() {
        return dresseurRepository.findAll();
    }

    public void deleteDresseur(final Long id) {
    	dresseurRepository.deleteById(id);
    }

    public Dresseur saveDresseur(Dresseur dresseur) {
    	Dresseur saveddresseur = dresseurRepository.save(dresseur);
        return saveddresseur;
    }
}
