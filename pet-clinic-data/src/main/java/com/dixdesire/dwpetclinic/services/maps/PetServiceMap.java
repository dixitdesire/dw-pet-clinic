package com.dixdesire.dwpetclinic.services.maps;

import com.dixdesire.dwpetclinic.model.Pet;
import com.dixdesire.dwpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
