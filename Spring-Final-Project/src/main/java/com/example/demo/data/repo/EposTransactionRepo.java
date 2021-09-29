package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.EposTransaction;

@Repository
public interface EposTransactionRepo extends JpaRepository<EposTransaction, Integer> {

	List<EposTransaction> findByEposCardNumber(Long cardNumber);

}
