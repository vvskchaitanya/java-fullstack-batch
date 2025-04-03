package com.triveni.fullstack.employees.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triveni.fullstack.employees.entity.UserEntity;
import com.triveni.fullstack.employees.repository.UserRepository;

@RestController
@RequestMapping("/register")
public class UserRegistrationController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder encoder;


    @PostMapping
    public UserEntity register(@RequestBody UserEntity user){
        user.setRole("USER");
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);

    }

}
