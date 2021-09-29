package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, String> {

	List<Citizen> findByForenamesIgnoreCase(String forenames);

	List<Citizen> findBySurnameIgnoreCase(String surname);

	List<Citizen> findByAddressIgnoreCase(String address);

	List<Citizen> findByPlaceOfBirthIgnoreCase(String placeOfBirth);

	List<Citizen> findBySex(String sex);

	List<Citizen> findByDob(String dob);

	List<Citizen> findCitizenByForenamesAndSurname(String forenames, String surname);

	List<Citizen> findCitizenByForenamesAndDob(String forenames, String dob);

	List<Citizen> findCitizenByForenamesAndSurnameAndDob(String forenames, String surname, String dob);

}
