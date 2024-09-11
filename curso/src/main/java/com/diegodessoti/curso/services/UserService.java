package com.diegodessoti.curso.services;

import com.diegodessoti.curso.entities.User;
import com.diegodessoti.curso.repositories.UserRepository;
import com.diegodessoti.curso.services.exceptions.DatabaseException;
import com.diegodessoti.curso.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        try {
            if (!userRepository.existsById(id)) {
                throw new DatabaseException("Usuário com o ID " + id + " não existe.");
            }
            userRepository.deleteById(id);
        } catch (EntityNotFoundException e) {
            throw new DatabaseException(e.getMessage());
        }
    }


    public User update(Long id, User obj) {
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, obj);
            return userRepository.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ResourceNotFoundException(e.getMessage());

        }

    }

    public void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
