package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.data.BusinessAddress;

public interface BusinessAddressRepo extends JpaRepository<BusinessAddress, Integer> {

	@Query(value = "SELECT * FROM business_address WHERE address_id IN (SELECT address_id FROM person_business_address WHERE person_id = :personId)", nativeQuery = true)
	List<BusinessAddress> getBusinessAddressPersonId(@Param("personId") Long personId);

}
