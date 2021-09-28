package com.example.demo.other;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Person;
import com.example.demo.dto.AllDetailsDTO;
import com.example.demo.service.PersonService;

@RestController
@CrossOrigin
public class PersonController {

	private PersonService service;

	@Autowired
	public PersonController(PersonService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAllPeople")
	public ResponseEntity<List<Person>> getAllPeople() {
		List<Person> created = this.service.getAllPerson();
		return new ResponseEntity<>(created, HttpStatus.OK);
	}

	@GetMapping("/getByPersonForenames/{forenames}")
	public ResponseEntity<List<Person>> getByPersonForenames(@PathVariable String forenames) {
		return new ResponseEntity<>(this.service.getByPersonForenames(forenames), HttpStatus.OK);
	}

	@GetMapping("/getByLastName/{surname}")
	public ResponseEntity<List<Person>> getByPersonSurname(@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getByPersonSurname(surname), HttpStatus.OK);
	}

	@GetMapping("/getByNationality/{nationality}")
	public ResponseEntity<List<Person>> getByPersonNationality(@PathVariable String nationality) {
		return new ResponseEntity<>(this.service.getByPersonNationality(nationality), HttpStatus.OK);
	}

	@GetMapping("/getByDOB/{dob}")
	public ResponseEntity<List<Person>> getByPersonDOB(@PathVariable String dob) {
		return new ResponseEntity<>(this.service.getByPersonDOB(dob), HttpStatus.OK);
	}

	@GetMapping("/getByPOB/{placeOfBirth}")
	public ResponseEntity<List<Person>> getByPersonPOB(@PathVariable String placeOfBirth) {
		return new ResponseEntity<>(this.service.getByPersonPOB(placeOfBirth), HttpStatus.OK);
	}

	@GetMapping("/getByPersonSex/{sex}")
	public ResponseEntity<List<Person>> getByPersonSex(@PathVariable String sex) {
		return new ResponseEntity<>(this.service.getByPersonSex(sex), HttpStatus.OK);
	}

	@GetMapping("/getByID/{id}")
	public ResponseEntity<Person> getByPersonID(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.getByPersonID(id), HttpStatus.OK);
	}

	@GetMapping("/getFullDetails/{id}")
	public ResponseEntity<AllDetailsDTO> getFullDetailsFromPerson(@PathVariable Long id) {
		return new ResponseEntity<AllDetailsDTO>(this.service.getFullDetailsFromPerson(id), HttpStatus.OK);
	}

	@GetMapping("/getByPersonForenamesAndSurname/{forenames}/{surname}")
	public ResponseEntity<List<Person>> getByPersonForenamesAndSurname(@PathVariable String forenames,
			@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getByPersonForenamesAndPersonSurname(forenames, surname),
				HttpStatus.OK);
	}

	@GetMapping("/getByPersonForenamesAndSurnameAndDob/{forenames}/{surname}/{dob}")
	public ResponseEntity<List<Person>> getByPersonForenamesAndSurnameAndDob(@PathVariable String forenames,
			@PathVariable String surname, @PathVariable String dob) {
		return new ResponseEntity<>(
				this.service.getByPersonForenamesAndPersonSurnameAndPersonDOB(forenames, surname, dob), HttpStatus.OK);
	}

	@GetMapping("/getByPersonForenameAndDob/{forenames}/{dob}")
	public ResponseEntity<List<Person>> getByPersonForenamesAndDob(@PathVariable String forenames,
			@PathVariable String dob) {
		return new ResponseEntity<>(this.service.getByPersonForenamesAndPersonDOB(forenames, dob), HttpStatus.OK);
	}

	@GetMapping("getFromSearch/{forenames}/{surname}/{dob}")
	public ResponseEntity<List<Person>> getPersonFromSearch(@PathVariable String forenames,
			@PathVariable String surname, @PathVariable String dob) {
		return new ResponseEntity<>(this.service.getPersonFromSearch(forenames, surname, dob), HttpStatus.OK);
	}

	@GetMapping("getFriendsByPersonId/{personId}")
	public ResponseEntity<List<Person>> getFriendsFromPersonId(@PathVariable long personId) {
		return new ResponseEntity<>(this.service.getFriendsFromPersonId(personId), HttpStatus.OK);
	}

	@GetMapping("getPartnersByPersonId/{personId}")
	public ResponseEntity<List<Person>> getPartnersFromPersonId(@PathVariable long personId) {
		return new ResponseEntity<>(this.service.getPartnersFromPersonId(personId), HttpStatus.OK);
	}

	@GetMapping("getPhoneContactsByPersonId/{personId}")
	public ResponseEntity<List<Person>> getPhoneContactsByPersonId(@PathVariable long personId) {
		return new ResponseEntity<>(this.service.getPhoneContactsByPersonId(personId), HttpStatus.OK);
	}

	@GetMapping("getColleaguesByPersonId/{personId}")
	public ResponseEntity<List<Person>> getColleaguesByPersonId(@PathVariable long personId) {
		return new ResponseEntity<>(this.service.getColleaguesByPersonId(personId), HttpStatus.OK);
	}

}
