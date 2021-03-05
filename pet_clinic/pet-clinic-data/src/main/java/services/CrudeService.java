package services;

import com.sun.xml.bind.v2.model.core.ID;

import java.util.Set;

public interface CrudeService<T, Id> {
    Set<T> findAll();
    T findById(Long id);
    T save(T object);
    void delete(T object);
    void deleteById(Long id);
}
