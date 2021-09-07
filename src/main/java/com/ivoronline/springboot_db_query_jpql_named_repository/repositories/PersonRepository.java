package com.ivoronline.springboot_db_query_jpql_named_repository.repositories;

import com.ivoronline.springboot_db_query_jpql_named_repository.entities.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PersonRepository extends CrudRepository<Person, Integer> {
                            Person  selectPerson(String name, Integer age   );
  @Transactional @Modifying Integer updatePerson(String name, Integer newAge);
  @Transactional @Modifying Integer deletePerson(String name                );
}


