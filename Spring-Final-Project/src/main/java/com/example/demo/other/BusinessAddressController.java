package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.BusinessAddress;
import com.example.demo.service.BusinessAddressService;

@RestController
@CrossOrigin

public class BusinessAddressController {

	private BusinessAddressService service;

	public BusinessAddressController(BusinessAddressService service) {
		super();
		this.service = service;
	}

	@GetMapping("getBusinessAddressPersonId/{personId}")
	public ResponseEntity<List<BusinessAddress>> getBusinessAddressPersonId(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getBusinessAddressPersonId(personId), HttpStatus.OK);
	}

}
