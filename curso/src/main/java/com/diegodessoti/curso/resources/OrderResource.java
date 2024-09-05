package com.diegodessoti.curso.resources;

import com.diegodessoti.curso.entities.Order;
import com.diegodessoti.curso.entities.User;
import com.diegodessoti.curso.services.OrderService;
import com.diegodessoti.curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> getUsers() {
        List<Order> users = service.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getUser(@PathVariable Long id) {
        Order users = service.findById(id);
        return ResponseEntity.ok().body(users);
    }

}
