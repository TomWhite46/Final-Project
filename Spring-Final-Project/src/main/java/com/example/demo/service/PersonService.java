package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.data.Person;

public interface PersonService {

	public Person getByPersonID(Long id);

	public List<Person> getAllPerson();

	public List<Person> getByPersonForenames(String forenames);

	public List<Person> getByPersonSurname(String surname);

	public List<Person> getByPersonNationality(String nationality);

	public List<Person> getByPersonDOB(LocalDate dob);

	public List<Person> getByPersonPOB(String placeOfBirth);

	public List<Person> getByPersonSex(String sex);

	// public List<Person> getCitizens(boolean isCitizen);

}
