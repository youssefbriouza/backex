 package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.model.MyUserDetails;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;  

@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username)
            .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + username));

        return MyUserDetails.build(user);
    }
}

