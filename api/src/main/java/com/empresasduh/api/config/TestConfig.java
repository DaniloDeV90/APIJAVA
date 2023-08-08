package com.empresasduh.api.config;

import com.empresasduh.api.Entities.Category;
import com.empresasduh.api.Entities.Order;
import com.empresasduh.api.Entities.Product;
import com.empresasduh.api.Entities.User;
import com.empresasduh.api.Entities.enums.OrderStatus;
import com.empresasduh.api.repositories.CategoryRepository;
import com.empresasduh.api.repositories.OrderRepository;
import com.empresasduh.api.repositories.ProductsRepository;
import com.empresasduh.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.util.Arrays;

@Configuration

@Profile("test")

public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductsRepository productsRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brown","maria@gmail.com","988888","123445");

        Category c1 = new Category(null,"Books");
        Category c2 = new Category(null,"Computers");
        Category c3 = new Category(null,"Eletronics");
        Order o1 = new Order(null, Instant.now(), OrderStatus.PAID,u1);
        Order o2 = new Order(null, Instant.now(),OrderStatus.SHIIPED,u1);
        Order o3 = new Order(null, Instant.now(),OrderStatus.DELIVERED,u1);
        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        p1.getCategories().add(c1);
        p2.getCategories().add(c3);
        p3.getCategories().add(c2);
        p4.getCategories().add(c2);
        p5.getCategories().add(c1);



        userRepository.saveAll(Arrays.asList(u1));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
        productsRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

    }
}
