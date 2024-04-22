package com.example.carpetcleanbot.repositories;

import com.example.carpetcleanbot.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
