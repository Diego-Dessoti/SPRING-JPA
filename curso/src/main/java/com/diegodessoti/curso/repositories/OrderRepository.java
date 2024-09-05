package com.diegodessoti.curso.repositories;

import com.diegodessoti.curso.entities.Order;
import com.diegodessoti.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
