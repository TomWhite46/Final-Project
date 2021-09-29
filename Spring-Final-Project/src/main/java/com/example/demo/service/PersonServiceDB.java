package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.data.Citizen;
import com.example.demo.data.Person;
import com.example.demo.data.Person_Citizen;
import com.example.demo.data.repo.CitizenRepo;
import com.example.demo.data.repo.PersonCitizenRepo;
import com.example.demo.data.repo.PersonRepo;
import com.example.demo.dto.AllDetailsDTO;

@Service
@Primary
public class PersonServiceDB implements PersonService {

	private PersonRepo repo;

	@Autowired
	private PersonCitizenRepo personCitizenRepo;

	@Autowired
	private CitizenRepo citizenRepo;

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
	public AllDetailsDTO getFullDetailsFromPerson(Long personID) {
		Optional<Person> person = this.repo.findById(personID);
		if (person.isEmpty()) {
			return null;
		}

		Person_Citizen person_citizen = this.personCitizenRepo.findByPerson(person.get());
		Optional<Citizen> citizen = this.citizenRepo.findById(person_citizen.getCitizen().getId());
		if (citizen.isEmpty()) {
			return null;
		}

		AllDetailsDTO allDetails = new AllDetailsDTO();
		allDetails.person = person.get();
		allDetails.citizen = citizen.get();

		System.out.println(person_citizen);
		return null;
	}

	@Override
	public List<Person> getAllPerson() {
		return this.repo.findAll();
	}

	@Override
	public List<Person> getByPersonForenames(String personForenames) {
		return this.repo.findByPersonForenamesIgnoreCase(personForenames);
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

	@Override
	public Citizen getFullDetailsFromPerson(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getByPersonForenamesAndPersonSurname(String personForenames, String personSurname) {
		return this.repo.findPersonByPersonForenamesAndPersonSurname(personForenames, personSurname);
	}

	@Override
	public List<Person> getByPersonForenamesAndPersonDOB(String personForenames, String personDOB) {
		return this.repo.findPersonByPersonForenamesAndPersonDOB(personForenames, personDOB);
	}

	@Override
	public List<Person> getByPersonForenamesAndPersonSurnameAndPersonDOB(String personForenames, String personSurname,
			String personDOB) {
		return this.repo.findPersonByPersonForenamesAndPersonSurnameAndPersonDOB(personForenames, personSurname,
				personDOB);
	}

	@Override
	public List<Person> getPersonFromSearch(String forenames, String surname, String dob) {
		List<Person> person = this.repo.getPersonFromSearch(forenames, surname, dob);
		for (Person prs : person) {
			prs.setPersonDOB(prs.getPersonDOB().substring(0, 10));
		}
		return person;
	}

	@Override
	public List<Person> getFriendsFromPersonId(Long personId) {
		List<Person> person = this.repo.getFriendsFromPersonId(personId);
		for (Person prs : person) {
			prs.setPersonDOB(prs.getPersonDOB().substring(0, 10));
		}
		return person;
	};

	@Override
	public List<Person> getPartnersFromPersonId(Long personId) {
		List<Person> person = this.repo.getPartnersFromPersonId(personId);
		for (Person prs : person) {
			prs.setPersonDOB(prs.getPersonDOB().substring(0, 10));
		}
		return person;
	};

	@Override
	public List<Person> getPhoneContactsByPersonId(Long personId) {
		List<Person> person = this.repo.getPhoneContactsByPersonId(personId);
		for (Person prs : person) {
			prs.setPersonDOB(prs.getPersonDOB().substring(0, 10));
		}
		return person;
	};

	@Override
	public List<Person> getColleaguesByPersonId(Long personId) {
		List<Person> person = this.repo.getColleaguesByPersonId(personId);
		for (Person prs : person) {
			prs.setPersonDOB(prs.getPersonDOB().substring(0, 10));
		}
		return person;
	};

}
