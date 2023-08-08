package com.empresasduh.api.services;

import com.empresasduh.api.Entities.Category;
import com.empresasduh.api.Entities.Order;
import com.empresasduh.api.repositories.CategoryRepository;
import com.empresasduh.api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class CategoryService {
    @Autowired
private CategoryRepository repository;

    public List<Category> findAll () {
        return repository.findAll();
    }
    public  Category FindById (Long id) {

        Optional<Category> obj  = repository.findById(id);

        return  obj.get();
    }

    public  String Delete (Long id) {

        try {
            Category userDelete = this.FindById(id);

            repository.delete(userDelete);
            return  "User deleted successfully.";
        } catch (Exception e) {
            return  "Não tem usuario";
        }


    }
}
