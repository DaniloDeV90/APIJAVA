package com.empresasduh.api.repositories;

import com.empresasduh.api.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
