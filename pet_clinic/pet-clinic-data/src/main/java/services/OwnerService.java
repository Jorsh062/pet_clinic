package services;

import model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudeService<Owner,Long> {
    Owner findByLastName(String lastName);




}
