package com.ivoronline.springboot_db_query_jpql_named_repository.controllers;

import com.ivoronline.springboot_db_query_jpql_named_repository.entities.Person;
import com.ivoronline.springboot_db_query_jpql_named_repository.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON
  //================================================================
  @RequestMapping("SelectPerson")
  Person selectPerson() {
    Person person = personRepository.selectPerson("John", 20);
    return person;
  }

  //================================================================
  // UPDATE PERSON
  //================================================================
  @RequestMapping("UpdatePerson")
  String updatePerson() {
    Integer updatedRecords = personRepository.updatePerson("John", 200);
    return  updatedRecords + " Records Updated";
  }

  //================================================================
  // DELETE PERSON
  //================================================================
  @RequestMapping("DeletePerson")
  String deletePerson() {
    Integer deletedRecords = personRepository.deletePerson("John");
    return  deletedRecords + " Records Deleted";
  }

}


