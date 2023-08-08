package com.empresasduh.api.repositories;

import com.empresasduh.api.Entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
