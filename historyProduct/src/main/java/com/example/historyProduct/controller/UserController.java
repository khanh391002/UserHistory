package com.example.historyProduct.controller;

import com.example.historyProduct.domain.History;
import com.example.historyProduct.domain.User;
import com.example.historyProduct.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserRepository userRepository;
    @GetMapping(value = "user/{username}")
    public List<History> findHistoryByUserName(@PathVariable String username){
        User user = userRepository.findOneUserByUserName(username);
        List<History> historyList = user.getHistoryList();
        return historyList;
    }
}
