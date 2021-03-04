package services;

import com.sun.xml.bind.v2.model.core.ID;

import java.util.Set;

public interface CrudeService<T, Id> {
    Set<T> findall();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
