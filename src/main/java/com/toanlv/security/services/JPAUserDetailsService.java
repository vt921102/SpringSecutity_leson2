package com.toanlv.security.services;

import com.toanlv.security.entities.UserEntity;
import com.toanlv.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

public class JPAUserDetailsService implements UserDetailsService {

    @Autowired
    private  UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = repository.getUserEntityByUserName(username).orElseThrow(()->new UsernameNotFoundException("Error!"));
        return new SecurityUser(user);
    }
}
