package com.dixdesire.dwpetclinic.services.springdatajpa;

import com.dixdesire.dwpetclinic.model.Owner;
import com.dixdesire.dwpetclinic.repositories.OwnerRepository;
import com.dixdesire.dwpetclinic.repositories.PetRepository;
import com.dixdesire.dwpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;

    private String lastName = "Wadhwani";

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setLastName(lastName);

        when(ownerRepository.findByLastName(any())).thenReturn(owner1);

        Owner owner = ownerSDJpaService.findByLastName(lastName);

        assertNotNull(owner);
        assertEquals(lastName, owner.getLastName());
        verify(ownerRepository, times(1)).findByLastName(lastName);
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}