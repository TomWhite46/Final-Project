package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

	List<Person> findByPersonForenamesIgnoreCase(String forenames);

	List<Person> findByPersonSurnameIgnoreCase(String Surname);

	List<Person> findByPersonNationalityIgnoreCase(String nationality);

	List<Person> findByPersonPOBIgnoreCase(String placeOfBirth);

	List<Person> findByPersonSex(String sex);

	List<Person> findByPersonDOB(String dateOfBirth);
	// List<Person> findIsCitizen(boolean isCitizen);

}
