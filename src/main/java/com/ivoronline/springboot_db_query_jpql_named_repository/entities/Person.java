package com.ivoronline.springboot_db_query_jpql_named_repository.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

//There is no INSERT since JPQL doesn't support INSERT. Records will be inserted through Repository.
@NamedQuery(
  name  = "Person.selectPersonByNameAge",
  query = "SELECT person FROM Person person WHERE person.name = ?1 AND person.age = ?2"
)
@NamedQuery(
  name  = "Person.updatePerson",
  query = "UPDATE Person person SET person.age = :newAge WHERE person.name = :name"
)
@NamedQuery(
  name  = "Person.deletePerson",
  query = "DELETE FROM Person person WHERE person.name = :name"
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //CONSTRUCTORS
  public Person() { }                        //Forced by @Entity
  public Person(String name, Integer age) {  //Needed for JPQL
    this.name = name;
    this.age  = age;
  }

}
