package com.dixdesire.dwpetclinic.services.maps;

import com.dixdesire.dwpetclinic.model.Vet;
import com.dixdesire.dwpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public Vet save(Vet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
