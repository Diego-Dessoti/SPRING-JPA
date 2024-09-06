package com.diegodessoti.curso.repositories;

import com.diegodessoti.curso.entities.Category;
import com.diegodessoti.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
