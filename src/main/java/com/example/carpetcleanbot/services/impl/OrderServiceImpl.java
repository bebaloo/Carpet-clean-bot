package com.example.carpetcleanbot.services.impl;

import com.example.carpetcleanbot.model.entities.Order;
import com.example.carpetcleanbot.repositories.OrderRepository;
import com.example.carpetcleanbot.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order get(Long orderId) {
        return orderRepository.getReferenceById(orderId);
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
