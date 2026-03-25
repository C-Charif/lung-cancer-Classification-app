package com.biblio.service;

import com.biblio.model.User;
import com.biblio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}