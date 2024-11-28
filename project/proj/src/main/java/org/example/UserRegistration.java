package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserRegistration {

    @Autowired
    private UserRepository userRepository;

    public Mono<Users> registerUser(String username, int port) {
        Users user = new Users(username, port);
        return userRepository.save(user)
                .doOnError(error -> {
                    System.err.println("Error saving user: " + error.getMessage());
                });
    }
}