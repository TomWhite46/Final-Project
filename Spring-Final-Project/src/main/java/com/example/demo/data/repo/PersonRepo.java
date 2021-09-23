package com.example.demo.data.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.data.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, String> {

	List<Person> findByPersonForenameIgnoreCase(String forename);

	List<Person> findByPersonSurnameIgnoreCase(String Surname);

	List<Person> findByPersonNationalityIgnoreCase(String nationality);

	List<Person> findByPersonPOBIgnoreCase(String placeOfBirth);

	List<Person> findByPersonGender(String gender);

	List<Person> findByPersonDOB(LocalDate dateOfBirth);
	// List<Person> findIsCitizen(boolean isCitizen);

}
