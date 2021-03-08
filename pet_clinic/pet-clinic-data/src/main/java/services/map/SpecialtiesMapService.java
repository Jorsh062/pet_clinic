package services.map;

import model.Specialty;
import org.springframework.stereotype.Service;
import services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialtiesMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Specialty object) {
        super.save(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }
}
