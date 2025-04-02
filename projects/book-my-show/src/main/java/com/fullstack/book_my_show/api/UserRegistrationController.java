package com.fullstack.book_my_show.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.book_my_show.entity.UserEntity;
import com.fullstack.book_my_show.repository.UserRepository;

@RestController
@RequestMapping("register")
public class UserRegistrationController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping
    public UserEntity register(@RequestBody UserEntity user){

        user.setRole("USER");

        user.setPassword(encoder.encode(user.getPassword()));

        return userRepository.save(user);

    }


}
