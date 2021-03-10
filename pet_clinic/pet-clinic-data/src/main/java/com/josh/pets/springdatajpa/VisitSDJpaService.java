package com.josh.pets.springdatajpa;

import com.josh.pets.model.Vet;
import com.josh.pets.model.Visit;
import com.josh.pets.repository.VisitRepository;
import com.josh.pets.services.VisitService;

import javax.swing.text.ViewFactory;
import java.util.HashSet;
import java.util.Set;

public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits= new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;

    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
