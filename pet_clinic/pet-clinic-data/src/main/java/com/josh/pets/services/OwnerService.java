package com.josh.pets.services;

import com.josh.pets.model.Owner;


public interface OwnerService extends CrudeService<Owner,Long> {
    Owner findByLastName(String lastname);
}
