package com.ivoronline.springboot_db_query_native_projection_objectarray.repositories;

import com.ivoronline.springboot_db_query_native_projection_objectarray.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // RETURN OBJECT ARRAY
  //=======================================================================================
  // ["John",20]
  @Query(nativeQuery = true, value = "SELECT name, age FROM PERSON WHERE NAME = 'John'")
  Object returnObjectArray();

}
