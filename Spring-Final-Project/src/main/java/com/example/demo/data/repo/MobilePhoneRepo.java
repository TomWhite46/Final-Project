package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.data.MobilePhone;

@Repository
public interface MobilePhoneRepo extends JpaRepository<MobilePhone, Integer> {
	@Query(value = "SELECT * FROM mobile_phone WHERE phone_id IN (select mobile_phone_id from person_mobile_phone where person_id = :personId)", nativeQuery = true)
	List<MobilePhone> getPhoneByPersonId(@Param("personId") long personId);

}
