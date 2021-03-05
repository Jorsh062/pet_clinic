package services.map;

import com.sun.xml.bind.v2.model.core.ID;
import model.Owner;
import services.CrudeService;
import services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
