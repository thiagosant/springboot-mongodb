package com.sansoft.springmongodb.services;

import com.sansoft.springmongodb.domain.User;
import com.sansoft.springmongodb.repository.UserRepository;
import com.sansoft.springmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }
}
