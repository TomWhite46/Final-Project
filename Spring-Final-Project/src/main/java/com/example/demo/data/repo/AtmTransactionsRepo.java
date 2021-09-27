package com.example.demo.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.AtmTransaction;

@Repository
public interface AtmTransactionsRepo extends JpaRepository<AtmTransaction, Integer> {

}
