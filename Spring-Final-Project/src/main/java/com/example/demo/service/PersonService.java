package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;


import com.example.demo.data.Person;

public interface PersonService {

	public Person getByPersonID(String personID);

	public List<Person> getAllPerson();

	public List<Person> getByPersonFirstName(String forename);

	public List<Person> getByPersonLastName(String surname);

	public List<Person> getByPersonNationality(String nationality);

	public List<Person> getByPersonDOB(LocalDate dateOfBirth);

	public List<Person> getByPersonPOB(String placeOfBirth);

	public List<Person> getByPersonGender(String gender);

	// public List<Person> getCitizens(boolean isCitizen);

}
