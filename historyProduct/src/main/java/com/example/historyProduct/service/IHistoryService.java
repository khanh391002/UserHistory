package com.example.historyProduct.service;

import com.example.historyProduct.domain.History;

import java.util.List;

public interface IHistoryService {
    List<History> findAll();
}
