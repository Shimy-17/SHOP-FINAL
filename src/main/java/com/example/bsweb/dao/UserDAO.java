package com.example.bsweb.dao;

import com.example.bsweb.entity.User;
import com.example.bsweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDAO {
    private final UserRepository userRepository;

    @Autowired
    public UserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean saveUser(User user){
        if (user.getEmail() != null && user.getFullName() != null && user.getPassword() != null){
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email).orElse(null);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
