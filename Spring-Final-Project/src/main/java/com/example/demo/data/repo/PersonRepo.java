package com.example.demo.data.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {

	List<Person> findByPersonForenamesIgnoreCase(String personForenames);

	List<Person> findByPersonSurnameIgnoreCase(String personSurname);

	List<Person> findByPersonNationalityIgnoreCase(String personNationality);

	List<Person> findByPersonPOBIgnoreCase(String personPOB);

	List<Person> findByPersonSex(String sex);

	List<Person> findByPersonDOB(String dateOfBirth);
	// List<Person> findIsCitizen(boolean isCitizen);

	List<Person> findPersonByPersonForenamesAndPersonSurname(String personForenames, String personSurname);

	List<Person> findPersonByPersonForenamesAndPersonDOB(String personForenames, String personDOB);

	List<Person> findPersonByPersonForenamesAndPersonSurnameAndPersonDOB(String personForenames, String personSurname,
			String personDOB);

}