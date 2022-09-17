package com.toanlv.security.controllers;

import com.toanlv.security.entities.UserEntity;
import com.toanlv.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    UserRepository repository;

    @GetMapping("")
    public ResponseEntity<UserEntity> hello(){
        return ResponseEntity.ok().body(repository.getUserEntityByUserName("toanlv").orElse(null));
    }
}
