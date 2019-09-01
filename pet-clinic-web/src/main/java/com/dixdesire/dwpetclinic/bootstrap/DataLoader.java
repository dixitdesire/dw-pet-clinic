package com.dixdesire.dwpetclinic.bootstrap;

import com.dixdesire.dwpetclinic.model.Owner;
import com.dixdesire.dwpetclinic.model.Vet;
import com.dixdesire.dwpetclinic.services.OwnerService;
import com.dixdesire.dwpetclinic.services.VetService;
import com.dixdesire.dwpetclinic.services.maps.OwnerServiceMap;
import com.dixdesire.dwpetclinic.services.maps.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Dixit");
        owner1.setSecondName("Wadhwani");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Gunjan");
        owner2.setSecondName("Wadhwani");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Raam");
        v1.setSecondName("Kumar");

        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setId(2L);
        v2.setFirstName("Laxman");
        v2.setSecondName("Kumar");

        vetService.save(v2);

        System.out.println("Loaded vets...");
    }
}
