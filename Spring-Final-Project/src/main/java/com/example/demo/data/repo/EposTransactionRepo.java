package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.EposTransaction;

@Repository
public interface EposTransactionRepo extends JpaRepository<EposTransaction, Integer> {

	List<EposTransaction> findByEposCardNumber(Long cardNumber);

	@Query(value = "SELECT * FROM epos_transaction WHERE card_number IN (SELECT card_number FROM bankcard WHERE bankcard_id IN (SELECT bankcard_id FROM person_bankcard WHERE person_id=:personId))", nativeQuery = true)
	List<EposTransaction> getEposTransactionByPersonId(@Param("personId") Long personId);

}
