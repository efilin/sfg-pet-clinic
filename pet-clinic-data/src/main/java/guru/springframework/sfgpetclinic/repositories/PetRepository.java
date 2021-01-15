package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by efilin on 15.01.2021.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
