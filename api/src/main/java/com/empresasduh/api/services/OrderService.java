package com.empresasduh.api.services;

import com.empresasduh.api.Entities.User;
import com.empresasduh.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository  repository;

    public List <User> findAll () {
        return repository.findAll();
    }
    public User FindById (Long id) {

        Optional <User> obj  = repository.findById(id);
        return  obj.get();
    }
}
