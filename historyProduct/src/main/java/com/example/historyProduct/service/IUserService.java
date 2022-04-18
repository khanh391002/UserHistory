package com.example.historyProduct.service;

import com.example.historyProduct.domain.User;

public interface IUserService {
    User findOneUserByUserName(String username);
}
