package com.dixdesire.dwpetclinic.repositories;

import com.dixdesire.dwpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
