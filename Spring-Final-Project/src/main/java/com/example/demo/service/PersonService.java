package com.example.demo.service;

import java.util.List;

import com.example.demo.data.Citizen;
import com.example.demo.data.Person;
import com.example.demo.dto.AllDetailsDTO;

public interface PersonService {

	public Person getByPersonID(Long id);

	public AllDetailsDTO getFullDetailsFromPerson(Long id);

	public List<Person> getAllPerson();

	public List<Person> getByPersonForenames(String forenames);

	public List<Person> getByPersonSurname(String surname);

	public List<Person> getByPersonNationality(String nationality);

	public List<Person> getByPersonDOB(String dob);

	public List<Person> getByPersonPOB(String placeOfBirth);

	public List<Person> getByPersonSex(String sex);

	Citizen getFullDetailsFromPerson(String id);

	// public List<Person> getCitizens(boolean isCitizen);

}
