package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.WaypointRecord;
import com.example.demo.data.repo.WaypointRecordRepo;

@Service
public class WaypointRecordService {

	private WaypointRecordRepo repo;

	public WaypointRecordService(WaypointRecordRepo repo) {
		super();
		this.repo = repo;
	}

	public List<WaypointRecord> getWaypointByPersonId(Long personId) {
		return this.repo.getByPersonIDOrderByTimestamp(personId);
	}

}
