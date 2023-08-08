package com.empresasduh.api.resource;

import com.empresasduh.api.Entities.Category;
import com.empresasduh.api.Entities.Order;
import com.empresasduh.api.services.CategoryService;
import com.empresasduh.api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
     private CategoryService category;
    @GetMapping
    public ResponseEntity<List<Category>> FindAll () {

        List <Category> list = category.findAll();
        return  ResponseEntity.ok().body(list);
    }


    @GetMapping (value = "/{id}")

    public  ResponseEntity <Category> findById (@PathVariable Long id) {
        Category obj = category.FindById(id);
        return  ResponseEntity.ok().body(obj);
    }

        @DeleteMapping (value = "/delete/{id}")
        public  ResponseEntity <String>  Delete (@PathVariable Long id) {
            String resultado = category.Delete(id);
            return  ResponseEntity.ok().body(resultado);

        }
}
