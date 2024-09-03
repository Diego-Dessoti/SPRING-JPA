package com.diegodessoti.curso.resources;

import com.diegodessoti.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getUsers() {
        User u = new User(1L, "Marie Jane", "maria@gmail.com", "99999", "123123");
        return ResponseEntity.ok().body(u);

    }

}
