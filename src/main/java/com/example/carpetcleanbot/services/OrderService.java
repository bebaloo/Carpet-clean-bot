package com.example.carpetcleanbot.services;

import com.example.carpetcleanbot.model.entities.Order;

public interface OrderService {
    Order get(Long orderId);

    void save(Order order);

    void delete(Long orderId);
}
