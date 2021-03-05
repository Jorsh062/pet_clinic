package services.map;

import model.Pet;
import model.Vet;
import services.CrudeService;
import services.map.AbstractMapService;
import services.vetService;

import java.util.Set;

public class vetServiceMap extends AbstractMapService<Vet, Long> implements vetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }
}
