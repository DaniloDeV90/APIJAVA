package com.empresasduh.api.resource;

import com.empresasduh.api.Entities.Order;
import com.empresasduh.api.Entities.User;
import com.empresasduh.api.services.OrderService;
import com.empresasduh.api.services.UserService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {


    @Autowired
   private OrderService service;
    @GetMapping
    public ResponseEntity < List <Order>> FindAll () {

        List <Order> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }


    @GetMapping (value = "/{id}")

    public  ResponseEntity <Order> findById ( @PathVariable  Long id) {
        Order obj = service.FindById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
