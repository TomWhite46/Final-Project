package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Bankcard;
import com.example.demo.service.BankcardService;

@RestController
@CrossOrigin

public class BankcardController {

	private BankcardService service;

	public BankcardController(BankcardService service) {
		super();
		this.service = service;
	}

	@GetMapping("getBankcardByPersonId/{personId}")
	public ResponseEntity<List<Bankcard>> getBankcardByPersonId(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getBankcardByPersonId(personId), HttpStatus.OK);
	}

}
