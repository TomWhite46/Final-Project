package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Bankcard;

@Repository
public interface BankcardRepo extends JpaRepository<Bankcard, Integer> {

	@Query(value = "SELECT * FROM bankcard WHERE bankcard_id IN (SELECT bankcard_id FROM person_bankcard WHERE person_id=:personId)", nativeQuery = true)
	List<Bankcard> getBankcardByPersonId(@Param("personId") Long personId);

}
