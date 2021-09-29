package com.example.demo.service;

import java.util.List;

import com.example.demo.data.Citizen;
import com.example.demo.data.Person;
import com.example.demo.dto.AllDetailsDTO;

public interface PersonService {

	public Person getByPersonID(Long personID);

	public AllDetailsDTO getFullDetailsFromPerson(Long id);

	public List<Person> getAllPerson();

	public List<Person> getByPersonForenames(String personForenames);

	public List<Person> getByPersonSurname(String surname);

	public List<Person> getByPersonNationality(String nationality);

	public List<Person> getByPersonDOB(String dob);

	public List<Person> getByPersonPOB(String placeOfBirth);

	public List<Person> getByPersonSex(String sex);

	Citizen getFullDetailsFromPerson(String id);

	public List<Person> getByPersonForenamesAndPersonSurname(String personForenames, String personSurname);

	public List<Person> getByPersonForenamesAndPersonDOB(String personForenames, String personDOB);

	public List<Person> getByPersonForenamesAndPersonSurnameAndPersonDOB(String personForenames, String personSurname,
			String personDOB);

	public List<Person> getPersonFromSearch(String forenames, String surname, String dob);

	public List<Person> getFriendsFromPersonId(Long personId);

	public List<Person> getPartnersFromPersonId(Long personId);

	public List<Person> getPhoneContactsByPersonId(Long personId);

	public List<Person> getColleaguesByPersonId(Long personId);

}
