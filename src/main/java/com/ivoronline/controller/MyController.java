package com.ivoronline.controller;

import com.ivoronline.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired UtilityRepository utilityRepository;

  //================================================================
  // GET PERSON
  //================================================================
  // ["Bill",30]
  @RequestMapping("GetPerson")
  Object getPerson() {
  
    //GET COLUMNS
    Object[] properties = (Object[]) utilityRepository.getPerson();
    
    //DISPLAY COLUMNS
    String  name = (String ) properties[0];
    Integer age  = (Integer) properties[1];
    System.out.println(name + ", " + age);
    
    //RETURN OBJECT ARRAY
    return properties;
    
  }

  //================================================================
  // GET PERSON LIST
  //================================================================
  @RequestMapping("GetPersonList")
  Object GetPersonList() {
  
    //GET COLUMNS
    List<Object[]> properties = utilityRepository.getPersonList();
    
    //DISPLAY COLUMNS
    for (Object[] property : properties) {
      String  name = (String ) property[0];
      Integer age  = (Integer) property[1];
      System.out.println(name + ", " + age);
    }
    
    //RETURN OBJECT ARRAY
    return properties;
    
  }

}


