package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Owner;


/**
 * Created by efilin on 04.01.2021.
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
