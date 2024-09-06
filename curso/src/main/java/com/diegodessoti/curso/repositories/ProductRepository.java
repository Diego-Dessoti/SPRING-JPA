package com.diegodessoti.curso.repositories;

import com.diegodessoti.curso.entities.Category;
import com.diegodessoti.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
