package com.empresasduh.api.services;

import com.empresasduh.api.Entities.Order;

import com.empresasduh.api.repositories.OrderRepository;
import com.empresasduh.api.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List <Order> findAll () {
        return repository.findAll();
    }
    public  Order FindById (Long id) {

        Optional <Order> obj  = repository.findById(id);
        return  obj.get();
    }
}
