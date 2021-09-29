package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.data.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

	@Query(value = "SELECT * FROM address WHERE address_id IN (SELECT address_id FROM person_address WHERE person_id = :personId)", nativeQuery = true)
	List<Address> getAddressPersonId(@Param("personId") Long personId);

}
