package com.ivoronline.springboot_db_query_jpql_named_repository.services;

import com.ivoronline.springboot_db_query_jpql_named_repository.entities.Person;
import com.ivoronline.springboot_db_query_jpql_named_repository.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DBAccess {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON BY NAME AGE
  //================================================================
  public Person selectPersonByNameAge() {
    Person person = personRepository.selectPersonByNameAge("John", 20);
    return person;
  }

  //================================================================
  // INSERT PERSON
  //================================================================
  // INSERT is not supported by JPQL so we use Repository save()
  @Transactional
  public void insertPerson() {
    personRepository.save(new Person("John" , 20));
  }

  //================================================================
  // UPDATE PERSON
  //================================================================
  @Transactional
  public Integer updatePerson() {
    Integer updatedRecords = personRepository.updatePerson("John", 200);
    return  updatedRecords;
  }

  //================================================================
  // DELETE PERSON
  //================================================================
  @Transactional
  public Integer deletePerson() {
    Integer deletedRecords = personRepository.deletePerson("John");
    return  deletedRecords;
  }

}
