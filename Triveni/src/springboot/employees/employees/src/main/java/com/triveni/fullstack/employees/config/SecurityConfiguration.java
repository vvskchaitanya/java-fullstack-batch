package com.triveni.fullstack.employees.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }



    @Bean
    public SecurityFilterChain myCustomSecurityFilterChain(HttpSecurity http) throws Exception{

        http.csrf(csrf->{
            csrf.disable();
        });


        http.authorizeHttpRequests(req->{
            req.requestMatchers("/register.html","register").permitAll()
            .anyRequest().authenticated();
        }).formLogin(login->{
            login.permitAll();
        }).logout(logout->{
            logout.permitAll();
        });
        return http.build();
    }
}


