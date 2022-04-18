package com.example.historyProduct.repository;

import com.example.historyProduct.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoryRepository extends JpaRepository<History, String> {
}
