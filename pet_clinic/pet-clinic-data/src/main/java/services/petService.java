package services;

import model.Pet;

import java.util.Set;

public interface petService {
    Pet findById(Long Id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
