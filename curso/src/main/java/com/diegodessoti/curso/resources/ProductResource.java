package com.diegodessoti.curso.resources;

import com.diegodessoti.curso.entities.Category;
import com.diegodessoti.curso.entities.Product;
import com.diegodessoti.curso.services.CategoryService;
import com.diegodessoti.curso.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> getUsers() {
        List<Product> categories = service.findAll();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getUser(@PathVariable Long id) {
        Product users = service.findById(id);
        return ResponseEntity.ok().body(users);
    }

}
