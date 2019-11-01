package com.ilakshya.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //return new User("1", "foo", new ArrayList<>());
        StudentProfile studentProfile = userRepository.findByUsername(username);
        //user.orElseThrow(() -> new UsernameNotFoundException(username + " Not Found"));
        //return user.map(MyUserDetails::new).get();
        return new User(studentProfile.getUsername(), studentProfile.getPassword(), new ArrayList<>());
    }
}
