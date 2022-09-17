package com.toanlv.security.configurations;

import com.toanlv.security.entities.UserEntity;
import com.toanlv.security.repositories.UserRepository;
import com.toanlv.security.services.JPAUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.AuthenticationFilter;



@Configuration
public class SecurityConfiguration {

    @Bean
    UserDetailsService userDetailsService() {
       /* var user = new InMemoryUserDetailsManager();
        var u = User.withUsername("toanlv").password("12345").authorities("read").build();
        user.createUser(u);*/

        return new JPAUserDetailsService();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
