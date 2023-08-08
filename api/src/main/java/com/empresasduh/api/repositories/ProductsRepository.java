package com.empresasduh.api.repositories;

import com.empresasduh.api.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository <Product, Long> {
}
