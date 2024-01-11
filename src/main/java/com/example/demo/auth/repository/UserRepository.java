package com.example.demo.auth.repository;

import com.example.demo.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    // a repository is a class that's responsible to communicate with the database
    // but in spring data jpa we don't need to create a class but an interface

    Optional<User> findByUsername( String username );
}
