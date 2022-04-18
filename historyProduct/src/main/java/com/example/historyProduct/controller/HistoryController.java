package com.example.historyProduct.controller;

import com.example.historyProduct.domain.History;
import com.example.historyProduct.domain.User;
import com.example.historyProduct.repository.IHistoryRepository;
import com.example.historyProduct.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class HistoryController {
    @Autowired
    IHistoryRepository historyRepository;
    @GetMapping(value = "/history")
    public List<History> findAll(){
        System.out.println("Danh sach lich su la: ");
        return historyRepository.findAll();
    }
}
