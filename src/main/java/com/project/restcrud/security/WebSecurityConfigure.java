package com.project.restcrud.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfigure {

    @Bean
    public InMemoryUserDetailsManager userDetailManager(){
        UserDetails roshan = User.builder()
                .username("roshan")
                .password("{noop}test123")
                .roles("Owner")
                .build();

        return new InMemoryUserDetailsManager(roshan);
    }
}
