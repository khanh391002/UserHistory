package com.example.historyProduct.service;

import com.example.historyProduct.domain.User;
import com.example.historyProduct.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository userRepository;
    @Override
    public User findOneUserByUserName(String username) {
        return userRepository.findOneUserByUserName(username);
    }
}
