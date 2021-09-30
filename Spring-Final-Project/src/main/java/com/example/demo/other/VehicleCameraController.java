package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.VehicleCamera;
import com.example.demo.service.VehicleCameraService;

@RestController
@CrossOrigin

public class VehicleCameraController {

	private VehicleCameraService service;

	public VehicleCameraController(VehicleCameraService service) {
		super();
		this.service = service;
	}

	@GetMapping("getVehicleCameraByPersonId/{personId}")
	public ResponseEntity<List<VehicleCamera>> getVehicleCameraByPersonId(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getVehicleCameraByPersonId(personId), HttpStatus.OK);
	}

}
