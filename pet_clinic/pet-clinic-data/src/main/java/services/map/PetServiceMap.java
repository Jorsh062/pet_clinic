package services.map;

import com.sun.xml.bind.v2.model.core.ID;
import model.Owner;
import model.Pet;
import services.CrudeService;
import services.petService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements petService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
