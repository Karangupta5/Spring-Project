package com.gupta.scm.services;

import java.util.List;
import java.util.Optional;

import com.gupta.scm.entities.User;

public interface UserService {

    User saveUser(User user);
    Optional<User> getUserById(String id);  //optional means if its present then good otherwise show some error
    Optional<User> updateUser(User user);
    void deleteUser(String id);
    boolean isUserExist(String userId);
    boolean isUserExistByEmail(String email);
    List<User> getAllUsers();
    User getUserByEmail(String email);

    // add more methods here related user service[logic]
    
}
