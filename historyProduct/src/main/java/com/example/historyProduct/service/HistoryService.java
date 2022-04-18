package com.example.historyProduct.service;

import com.example.historyProduct.domain.History;
import com.example.historyProduct.repository.IHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService implements IHistoryService{
    @Autowired
    IHistoryRepository historyRepository;
    @Override
    public List<History> findAll() {
        return historyRepository.findAll();
    }
}
