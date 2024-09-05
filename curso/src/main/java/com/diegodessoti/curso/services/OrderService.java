package com.diegodessoti.curso.services;

import com.diegodessoti.curso.entities.Order;
import com.diegodessoti.curso.entities.User;
import com.diegodessoti.curso.repositories.OrderRepository;
import com.diegodessoti.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }

}
