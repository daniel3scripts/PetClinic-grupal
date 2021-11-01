package com.tecsup.petclinic.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
		
		List<Owner> findByFirstname(String firstname);

		
		List<Owner> findByLastname(String lastname);

		
		List<Owner> findByTelephone(String telephone);

}
