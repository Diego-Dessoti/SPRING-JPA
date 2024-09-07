package com.diegodessoti.curso.repositories;

import com.diegodessoti.curso.entities.OrderItem;
import com.diegodessoti.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
