package com.fullstack.book_my_show.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fullstack.book_my_show.entity.UserEntity;
import com.fullstack.book_my_show.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        List<UserEntity> users= userRepository.findByUsername(username);

        if(users.isEmpty()){
            throw new UsernameNotFoundException("Username: "+username+" is not found in database");
        }

        UserEntity userFound = users.get(0);

        UserDetails myLoginUser = new User(userFound.getUsername(), userFound.getPassword(),new ArrayList<>());

        return myLoginUser;
    }

}
