package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.data.Person;
import com.example.demo.data.repo.PersonRepo;

@Service
@Primary
public class PersonServiceDB implements PersonService {

	private PersonRepo repo;

	public PersonServiceDB(PersonRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Person getByPersonID(Long personID) {
		Optional<Person> found = this.repo.findById(personID);
		if (found.isEmpty())
			return null;

		return found.get();
	}

	@Override
	public List<Person> getAllPerson() {
		return this.repo.findAll();
	}

	@Override
	public List<Person> getByPersonForenames(String forenames) {
		return this.repo.findByPersonForenamesIgnoreCase(forenames);
	}

	@Override
	public List<Person> getByPersonSurname(String surname) {
		return this.repo.findByPersonSurnameIgnoreCase(surname);
	}

	@Override
	public List<Person> getByPersonNationality(String nationality) {
		return this.repo.findByPersonNationalityIgnoreCase(nationality);
	}

	@Override
	public List<Person> getByPersonDOB(String dateOfBirth) {
		return this.repo.findByPersonDOB(dateOfBirth);
	}

	@Override
	public List<Person> getByPersonPOB(String placeOfBirth) {
		return this.repo.findByPersonPOBIgnoreCase(placeOfBirth);
	}

	@Override
	public List<Person> getByPersonSex(String sex) {
		return this.repo.findByPersonSex(sex);
	}

	// @Override
	// public List<Person> getCitizens(boolean isCitizen){
	// return this.repo.findIsCitizen(isCitizen);
	// }

}
