package com.example.demo.other;

import java.time.LocalDate;
import java.util.List;

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

	public CitizenController(CitizenService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getAllCitizens")
	public ResponseEntity<List<Citizen>> getAllCitizens() {
		List<Citizen> created = this.service.getAllCitizens();
		return new ResponseEntity<>(created, HttpStatus.OK);
	}

	@GetMapping("/getByCitizenFirstName/{forename}")
	public ResponseEntity<List<Citizen>> getByCitizenFirstName(@PathVariable String forename) {
		return new ResponseEntity<>(this.service.getByCitizenFirstName(forename), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenLastName/{surname}")
	public ResponseEntity<List<Citizen>> getByCitizenLastName(@PathVariable String surname) {
		return new ResponseEntity<>(this.service.getByCitizenLastName(surname), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenAddress/{address}")
	public ResponseEntity<List<Citizen>> getByCitizenAddress(@PathVariable String address) {
		return new ResponseEntity<>(this.service.getByCitizenAddress(address), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenDOB/{dateOfBirth}")
	public ResponseEntity<List<Citizen>> getByCitizenDOB(@PathVariable LocalDate dateOfBirth) {
		return new ResponseEntity<>(this.service.getByCitizenDOB(dateOfBirth), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenPOB/{placeOfBirth}")
	public ResponseEntity<List<Citizen>> getByCitizenPOB(@PathVariable String placeOfBirth) {
		return new ResponseEntity<>(this.service.getByCitizenPOB(placeOfBirth), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenGender/{gender}")
	public ResponseEntity<List<Citizen>> getByCitizenGender(@PathVariable String gender) {
		return new ResponseEntity<>(this.service.getByCitizenGender(gender), HttpStatus.OK);
	}

	@GetMapping("/getByCitizenID/{id}")
	public ResponseEntity<Citizen> getByCitizenID(@PathVariable String id) {
		return new ResponseEntity<>(this.service.getByCitizenID(id), HttpStatus.OK);
	}

}
