package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Vehicle;
import com.example.demo.data.repo.VehicleRepo;

@Service
public class VehicleService {

	private VehicleRepo repo;

	public VehicleService(VehicleRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Vehicle> getAllVehicles() {
		return this.repo.findAll();
	}

	public Vehicle getByVehicleId(Integer id) {
		Vehicle found = this.repo.findById(id).get();
		return found;
	}
}
