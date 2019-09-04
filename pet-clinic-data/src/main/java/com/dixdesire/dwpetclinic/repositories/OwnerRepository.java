package com.dixdesire.dwpetclinic.repositories;

import com.dixdesire.dwpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
