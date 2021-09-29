package com.example.demo.other;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.WaypointRecord;
import com.example.demo.service.WaypointRecordService;

@RestController
@CrossOrigin

public class WaypointRecordController {

	private WaypointRecordService service;

	public WaypointRecordController(WaypointRecordService service) {
		super();
		this.service = service;
	}

	@GetMapping("getWaypointRecordByPersonId/{personId}")
	public ResponseEntity<List<WaypointRecord>> getWaypointByPersonId(@PathVariable Long personId) {
		return new ResponseEntity<>(this.service.getWaypointByPersonId(personId), HttpStatus.OK);
	}

}
