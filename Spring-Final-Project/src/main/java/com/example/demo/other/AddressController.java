package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Address;
import com.example.demo.service.AddressService;

@RestController
@CrossOrigin

public class AddressController {

	private AddressService service;

	public AddressController(AddressService service) {
		super();
		this.service = service;
	}

	@GetMapping("getAddressPersonId/{personId}")
	public ResponseEntity<List<Address>> getAddressPersonId(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getAddressPersonId(personId), HttpStatus.OK);
	}

}
