package com.dixdesire.dwpetclinic.services;

import com.dixdesire.dwpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
