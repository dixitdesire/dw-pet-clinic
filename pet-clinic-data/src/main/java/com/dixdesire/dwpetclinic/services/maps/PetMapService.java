package com.dixdesire.dwpetclinic.services.maps;

import com.dixdesire.dwpetclinic.model.Pet;
import com.dixdesire.dwpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
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
        return super.save(owner);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
