package com.example.demo.other;

import java.time.LocalDate;
import java.util.List;

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

	public PersonController(PersonService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAllPeople")
	public ResponseEntity<List<Person>> getAllPeople() {
		List<Person> created = this.service.getAllPerson();
		return new ResponseEntity<>(created, HttpStatus.OK);
	}

	@GetMapping("/GetByPersonForenames/{forenames}")
	public ResponseEntity<List<Person>> getByPersonForename(@PathVariable String forenames) {
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

	@GetMapping("/getByDOB/{dateOfBirth}")
	public ResponseEntity<List<Person>> getByPersonDOB(@PathVariable LocalDate dob) {
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
	public ResponseEntity<Person> getByPersonID(@PathVariable String id) {
		return new ResponseEntity<>(this.service.getByPersonID(id), HttpStatus.OK);
	}

}
