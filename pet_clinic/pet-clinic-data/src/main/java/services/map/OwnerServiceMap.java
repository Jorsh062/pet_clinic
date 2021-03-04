package services.map;

import com.sun.xml.bind.v2.model.core.ID;
import model.Owner;
import services.CrudeService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudeService<Owner, Long> {
    @Override
    public Set<Owner> findall() {
        return super.findall();
    }
    @Override
    public Owner findById(ID id) {
        return super.findById(id);
    }
    @Override
    public void deleteById(ID id) {
        super.deleteById(id);
    }
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }


    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
