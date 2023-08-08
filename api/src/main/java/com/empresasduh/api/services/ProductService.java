package com.empresasduh.api.services;

import com.empresasduh.api.Entities.Product;
import com.empresasduh.api.repositories.ProductsRepository;
import com.empresasduh.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductsRepository repository;

    public List <Product> findAll () {
        return repository.findAll();
    }
    public Product FindById (Long id) {

        Optional <Product> obj  = repository.findById(id);
        return  obj.get();
    }
}
