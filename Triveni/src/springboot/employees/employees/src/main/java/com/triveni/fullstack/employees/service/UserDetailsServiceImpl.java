package com.triveni.fullstack.employees.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.triveni.fullstack.employees.entity.UserEntity;
import com.triveni.fullstack.employees.repository.UserRepository;

@Service 
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<UserEntity> users = userRepository.findByusername(username);

        if(users.isEmpty()){
            throw new UsernameNotFoundException("username: "+username+" is not found in database");
        }
        UserEntity userFound = users.get(0);
        UserDetails myLoginUser = new User(userFound.getUsername(), userFound.getPassword(),new ArrayList<>());
        //UserDetails myLoginUser = new User("triveni", "{noop}0000", new ArrayList<>());//{noop} says that don't use any password encoder just use this string as password.
        return myLoginUser;
    }

}
