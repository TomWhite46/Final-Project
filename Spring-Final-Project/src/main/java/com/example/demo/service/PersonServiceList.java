package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Person;

@Service
public class PersonServiceList implements PersonService {

	// @Override
//	public List<Person> getCitizens(boolean isCitizen) {
	// TODO Auto-generated method stub
//		return null;
//	}

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByPersonSurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByPersonNationality(String nationality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByPersonDOB(LocalDate dateOfBirth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByPersonPOB(String placeOfBirth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByPersonSex(String sex) {
		// TODO Auto-generated method stub
		return null;
	}

}
