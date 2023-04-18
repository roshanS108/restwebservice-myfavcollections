package com.project.restcrud.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class WebSecurityConfigure {
    @Bean
    public InMemoryUserDetailsManager userDetailManager() {
        UserDetails roshan = User.builder()
                .username("roshan")
                .password("{noop}test123")
                .roles("Owner")
                .build();
        UserDetails guest = User.builder()
                .username("guest")
                .password("{noop}test123")
                .roles("guest")
                .build();
        return new InMemoryUserDetailsManager(roshan,guest);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/book/favoriteBooks").hasRole("guest")
                        .requestMatchers(HttpMethod.GET, "/book/favoriteBooks/**").hasRole("guest")
                        .requestMatchers(HttpMethod.POST, "/book/storingBooks").hasRole("guest")
                        .requestMatchers(HttpMethod.GET, "/book/getBooksFromCache").hasRole("guest")
                        .requestMatchers(HttpMethod.GET, "/book/getSpecificBook/**").hasRole("guest")
                        .requestMatchers(HttpMethod.DELETE, "/book/delete/cache/**").hasRole("guest")

                        .requestMatchers(HttpMethod.GET, "/book/getBookList/**").hasRole("guest")
                        .requestMatchers(HttpMethod.GET, "/book/getBookList/search/**").hasRole("guest")
                        .requestMatchers(HttpMethod.POST, "/book/favoriteBooks").hasRole("Owner")
                        .requestMatchers(HttpMethod.PUT, "/book/favoriteBooks").hasRole("Owner")
                        .requestMatchers(HttpMethod.DELETE, "/book/favoriteBooks/**").hasRole("Owner")
                        .requestMatchers(HttpMethod.GET, "/book/getBookList/**").hasRole("Owner")

        );
        //use http basic authentication
        http.httpBasic();
        //disable cross site request forgery (CSRF)
        http.csrf().disable();
        return http.build();
    }


}
