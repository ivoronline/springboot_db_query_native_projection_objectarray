package com.ivoronline.springboot_db_query_native_projection_objectarray.controllers;

import com.ivoronline.springboot_db_query_native_projection_objectarray.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN OBJECT ARRAY
  //================================================================
  // ["John",20]
  @RequestMapping("ReturnObjectArray")
  Object returnObjectArray() {
    Object[] properties = (Object[]) personRepository.returnObjectArray();
    String   name       = (String)   properties[0];
    Integer  age        = (Integer)  properties[1];
    System.out.println(name + ", " + age);
    return properties;
  }

}


