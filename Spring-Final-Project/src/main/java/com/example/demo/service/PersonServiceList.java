package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Citizen;
import com.example.demo.data.Person;
import com.example.demo.dto.AllDetailsDTO;

@Service
public class PersonServiceList implements PersonService {

	// @Override
//	public List<Person> getCitizens(boolean isCitizen) {
	// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Citizen getFullDetailsFromPerson(String id) {
		return null;
	}

	private List<Person> people = new ArrayList<>();

	@Override
	public Person getByPersonID(Long personID) {

		return null;
	}

	@Override
	public List<Person> getAllPerson() {

		for (Person person : people) {
			System.out.println(person);
		}
		return people;
	}

	@Override
	public List<Person> getByPersonForenames(String forenames) {
		return null;
	}

	@Override
	public List<Person> getByPersonSurname(String surname) {
		return null;
	}

	@Override
	public List<Person> getByPersonNationality(String nationality) {
		return null;
	}

	@Override
	public List<Person> getByPersonDOB(String dateOfBirth) {
		return null;
	}

	@Override
	public List<Person> getByPersonPOB(String placeOfBirth) {
		return null;
	}

	@Override
	public List<Person> getByPersonSex(String sex) {
		return null;
	}

	@Override
	public AllDetailsDTO getFullDetailsFromPerson(Long id) {
		return null;
	}

	@Override
	public List<Person> getByPersonForenamesAndPersonSurname(String personForenames, String personSurname) {
		return null;
	}

	@Override
	public List<Person> getByPersonForenamesAndPersonDOB(String personForenames, String personDOB) {
		return null;
	}

	@Override
	public List<Person> getByPersonForenamesAndPersonSurnameAndPersonDOB(String personForenames, String personSurname,
			String personDOB) {
		return null;
	}

}