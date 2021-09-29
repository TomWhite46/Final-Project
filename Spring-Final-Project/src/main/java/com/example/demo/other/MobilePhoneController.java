package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.MobilePhone;
import com.example.demo.service.MobilePhoneService;

@RestController
@CrossOrigin

public class MobilePhoneController {

	private MobilePhoneService service;

	public MobilePhoneController(MobilePhoneService service) {
		super();
		this.service = service;
	}

	@GetMapping("getPhoneByPersonId/{personId}")
	public ResponseEntity<List<MobilePhone>> getPersonFromSearch(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getPhoneByPersonId(personId), HttpStatus.OK);
	}

}
