package com.sansoft.springmongodb.services;

import com.sansoft.springmongodb.domain.User;
import com.sansoft.springmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();

    }
}
