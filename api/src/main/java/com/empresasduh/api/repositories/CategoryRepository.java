package com.empresasduh.api.repositories;

import com.empresasduh.api.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
