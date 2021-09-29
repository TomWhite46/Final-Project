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

//	get single person by ID

	@GetMapping("/getByID/{id}")
	public ResponseEntity<Person> getByPersonID(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.getByPersonID(id), HttpStatus.OK);
	}

//	get other people based on join tables

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

//	procedures for handling search with different variables blank

	@GetMapping("findPersonByForenameSurnameDob/{forenames}/{surname}/{dob}")
	public ResponseEntity<List<Person>> findPersonByForenameSurnameDob(@PathVariable String forenames,
			@PathVariable String surname, @PathVariable String dob) {
		return new ResponseEntity<>(this.service.getPersonFromSearch(forenames, surname, dob), HttpStatus.OK);
	}

	@GetMapping("findPersonByForenameSurname/{forenames}/{surname}")
	public ResponseEntity<List<Person>> findPersonByForenameSurname(@PathVariable String forenames,
			@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getPersonFromSearch(forenames, surname, ""), HttpStatus.OK);
	}

	@GetMapping("findPersonByForenameDob/{forenames}/{dob}")
	public ResponseEntity<List<Person>> findPersonByForenameDob(@PathVariable String forenames,
			@PathVariable String dob) {
		return new ResponseEntity<>(this.service.getPersonFromSearch(forenames, "", dob), HttpStatus.OK);
	}

	@GetMapping("findPersonByForename/{forenames}")
	public ResponseEntity<List<Person>> findPersonByForename(@PathVariable String forenames) {
		return new ResponseEntity<>(this.service.getPersonFromSearch(forenames, "", ""), HttpStatus.OK);
	}

	@GetMapping("findPersonBySurnameDob/{surname}/{dob}")
	public ResponseEntity<List<Person>> findPersonBySurnameDob(@PathVariable String surname, @PathVariable String dob) {
		return new ResponseEntity<>(this.service.getPersonFromSearch("", surname, dob), HttpStatus.OK);
	}

	@GetMapping("findPersonBySurname/{surname}")
	public ResponseEntity<List<Person>> findPersonBySurname(@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getPersonFromSearch("", surname, ""), HttpStatus.OK);
	}

	@GetMapping("findPersonByDob/{dob}")
	public ResponseEntity<List<Person>> findPersonByDob(@PathVariable String dob) {
		return new ResponseEntity<>(this.service.getPersonFromSearch("", "", dob), HttpStatus.OK);
	}

	@GetMapping("findPersonByReg/{reg}")
	public ResponseEntity<List<Person>> findPersonByReg(@PathVariable String reg) {
		return new ResponseEntity<>(this.service.findPersonByReg(reg), HttpStatus.OK);
	}

}
