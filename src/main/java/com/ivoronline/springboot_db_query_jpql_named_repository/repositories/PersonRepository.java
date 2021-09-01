package com.ivoronline.springboot_db_query_jpql_named_repository.repositories;

import com.ivoronline.springboot_db_query_jpql_named_repository.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Person findByNameAgeIndexed(String name, Integer age);  //Optional
  Person findByNameAgeNamed  (String name, Integer age);  //Optional
}


