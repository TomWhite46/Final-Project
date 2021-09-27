package com.example.demo.other;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Citizen;
import com.example.demo.service.CitizenService;

@RestController
@CrossOrigin
public class CitizenController {

	private CitizenService service;

	@Autowired
	public CitizenController(CitizenService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAllCitizens")
	public ResponseEntity<List<Citizen>> getAllCitizens() {
		List<Citizen> created = this.service.getAllCitizens();
		return new ResponseEntity<>(created, HttpStatus.OK);
	}

	@GetMapping("/getByCitizenForenames/{forenames}")
	public ResponseEntity<List<Citizen>> getByCitizenForenames(@PathVariable String forenames) {
		return new ResponseEntity<>(this.service.getByCitizenForenames(forenames), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenLastName/{surname}")
	public ResponseEntity<List<Citizen>> getByCitizenSurname(@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getByCitizenSurname(surname), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenAddress/{address}")
	public ResponseEntity<List<Citizen>> getByCitizenAddress(@PathVariable String address) {
		return new ResponseEntity<>(this.service.getByCitizenAddress(address), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenDob/{dob}")
	public ResponseEntity<List<Citizen>> getByCitizenDob(@PathVariable String dob) {

		return new ResponseEntity<>(this.service.getByCitizenDob(dob), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenPOB/{placeOfBirth}")
	public ResponseEntity<List<Citizen>> getByCitizenPOB(@PathVariable String placeOfBirth) {
		return new ResponseEntity<>(this.service.getByCitizenPOB(placeOfBirth), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenSex/{sex}")
	public ResponseEntity<List<Citizen>> getByCitizenSex(@PathVariable String sex) {
		return new ResponseEntity<>(this.service.getByCitizenSex(sex), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenID/{id}")
	public ResponseEntity<Citizen> getByCitizenID(@PathVariable String id) {
		return new ResponseEntity<>(this.service.getByCitizenID(id), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenForenamesAndSurname/{forenames}/{surname}")
	public ResponseEntity<List<Citizen>> getByCitizenForenamesAndSurname(@PathVariable String forenames,
			@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getByCitizenForenamesAndSurname(forenames, surname), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenForenamesAndSurnameAndDob/{forenames}/{surname}/{dob}")
	public ResponseEntity<List<Citizen>> getByCitizenForenamesAndSurnameAndDob(@PathVariable String forenames,
			@PathVariable String surname, @PathVariable String dob) {
		return new ResponseEntity<>(this.service.getByCitizenForenamesAndSurnameAndDob(forenames, surname, dob),
				HttpStatus.OK);
	}

	@GetMapping("/getByCitizenForenameAndDob/{forenames}/{dob}")
	public ResponseEntity<List<Citizen>> getByCitizenForenamesAndDob(@PathVariable String forenames,
			@PathVariable String dob) {
		return new ResponseEntity<>(this.service.getByCitizenForenamesAndDob(forenames, dob), HttpStatus.OK);
	}

}

//	
