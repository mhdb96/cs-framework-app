package com.xdebuggers.csframeworkapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdebuggers.csframeworkapp.model.h2.User;
import com.xdebuggers.csframeworkapp.repository.h2.UserRepository;

@Service
public class DatabaseService {
    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public DatabaseService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
