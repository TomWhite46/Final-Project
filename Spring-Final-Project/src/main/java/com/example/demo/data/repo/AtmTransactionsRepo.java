package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.AtmTransaction;

@Repository
public interface AtmTransactionsRepo extends JpaRepository<AtmTransaction, Integer> {

	List<AtmTransaction> findByCardNumber(Long cardNumber);

	@Query(value = "SELECT * FROM atm_transaction WHERE card_number IN (SELECT card_number FROM bankcard WHERE bankcard_id IN (SELECT bankcard_id FROM person_bankcard WHERE person_id=:personId))", nativeQuery = true)
	List<AtmTransaction> getAtmTransactionByPersonId(@Param("personId") Long personId);

}
