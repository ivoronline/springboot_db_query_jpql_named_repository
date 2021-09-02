package com.ivoronline.springboot_db_query_jpql_named_repository.repositories;

import com.ivoronline.springboot_db_query_jpql_named_repository.entities.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
             Person  selectPersonByNameAge(String name, Integer age   );
  @Modifying Integer updatePerson         (String name, Integer newAge);
  @Modifying Integer deletePerson         (String name                );
}


