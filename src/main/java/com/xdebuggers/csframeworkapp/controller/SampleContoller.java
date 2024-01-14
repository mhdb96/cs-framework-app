// WebController.java
package com.xdebuggers.csframeworkapp.controller;

import com.xdebuggers.csframeworkapp.model.h2.User;
import com.xdebuggers.csframeworkapp.service.CacheService;
import com.xdebuggers.csframeworkapp.service.EmailService;
import com.xdebuggers.csframeworkapp.service.DatabaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleContoller {

    @Autowired
    private CacheService cacheService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private DatabaseService databaseService;

    @GetMapping("/cache")
    public String getFromCache() {
        return cacheService.getCachedData();
    }

    @GetMapping("/send-email")
    public String sendEmail() {
        emailService.sendEmail("recipient@example.com", "Subject", "Hello, this is a test email.");
        return "Email sent successfully!";
    }

    @GetMapping("/database")
    public String performDatabaseOperation() {
        User user = new User("John Doe", "john@example.com");
        databaseService.saveUser(user);
        return "User saved to the database!";
    }

    @GetMapping("/get-users")
    public Iterable<User> getAllUsers() {
        return databaseService.getAllUsers();
    }
}
