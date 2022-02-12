package guru.springframework.sfgpetclinic2.services;

import guru.springframework.sfgpetclinic2.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
