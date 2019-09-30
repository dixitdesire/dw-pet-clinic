package com.dixdesire.dwpetclinic.bootstrap;

import com.dixdesire.dwpetclinic.model.*;
import com.dixdesire.dwpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count==0)
            loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry =  specialityService.save(dentistry);


        Owner dixit = new Owner();
        dixit.setFirstName("Dixit");
        dixit.setLastName("Wadhwani");
        dixit.setAddress("C-407");
        dixit.setCity("Pune");
        dixit.setTelephone("9912933450");

        Pet dixitsPet = new Pet();
        dixitsPet.setOwner(dixit);
        dixitsPet.setPetType(savedDogPetType);
        dixitsPet.setName("Robie");
        dixitsPet.setBirthDate(LocalDate.now());
        dixit.getPets().add(dixitsPet);

        ownerService.save(dixit);

        Owner gunjan = new Owner();
        gunjan.setId(2L);
        gunjan.setFirstName("Gunjan");
        gunjan.setLastName("Wadhwani");
        gunjan.setAddress("C-407");
        gunjan.setCity("Pune");
        gunjan.setTelephone("9912933422");

        Pet gunjansPet = new Pet();
        gunjansPet.setOwner(gunjan);
        gunjansPet.setPetType(savedCatPetType);
        gunjansPet.setName("Cutie");
        gunjansPet.setBirthDate(LocalDate.now());
        gunjan.getPets().add(gunjansPet);

        ownerService.save(gunjan);

        System.out.println("Loaded owners...");

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("Raam");
        v1.setLastName("Kumar");
        v1.getSpecialities().add(savedDentistry);

        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setId(2L);
        v2.setFirstName("Laxman");
        v2.setLastName("Kumar");
        v2.getSpecialities().add(savedRadiology);

        vetService.save(v2);

        System.out.println("Loaded vets...");
    }
}
