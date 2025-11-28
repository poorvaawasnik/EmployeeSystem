package com.example.EmployeeSystem.service;

import com.example.EmployeeSystem.entity.UserEntity;
import com.example.EmployeeSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public  void saveUser(UserEntity user){
        userRepository.save(user);
    }
    public UserEntity getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }
}
