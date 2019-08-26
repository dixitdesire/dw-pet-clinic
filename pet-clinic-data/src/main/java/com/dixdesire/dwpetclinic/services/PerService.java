package com.dixdesire.dwpetclinic.services;

import com.dixdesire.dwpetclinic.model.Pet;

import java.util.Set;

public interface PerService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
