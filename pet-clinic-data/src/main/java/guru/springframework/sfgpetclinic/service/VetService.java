package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by efilin on 04.01.2021.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
