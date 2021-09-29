package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
@CrossOrigin

public class VehicleController {

	private VehicleService service;

	public VehicleController(VehicleService service) {
		super();
		this.service = service;
	}

	@GetMapping("getVehicleByPersonId/{personId}")
	public ResponseEntity<List<Vehicle>> getVehicleByPersonId(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getVehicleByPersonId(personId), HttpStatus.OK);
	}

}
