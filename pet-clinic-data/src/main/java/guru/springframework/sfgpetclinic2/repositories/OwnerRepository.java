package guru.springframework.sfgpetclinic2.repositories;

import guru.springframework.sfgpetclinic2.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
