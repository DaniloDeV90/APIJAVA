package com.empresasduh.api.resource;

import com.empresasduh.api.Entities.User;
import com.empresasduh.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @Autowired
   private UserService service;
    @GetMapping
    public ResponseEntity < List < User>> FindAll () {

        List <User> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }


    @GetMapping (value = "/{id}")

    public  ResponseEntity <User> findById ( @PathVariable  Long id) {
        User obj = service.FindById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
