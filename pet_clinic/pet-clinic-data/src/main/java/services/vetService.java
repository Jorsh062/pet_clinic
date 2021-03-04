package services;

import model.Vet;

import java.util.Set;

public interface vetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
