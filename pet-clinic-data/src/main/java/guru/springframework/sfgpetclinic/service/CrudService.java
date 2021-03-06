package guru.springframework.sfgpetclinic.service;

import java.util.Set;

/**
 * Created by efilin on 04.01.2021.
 */
public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
