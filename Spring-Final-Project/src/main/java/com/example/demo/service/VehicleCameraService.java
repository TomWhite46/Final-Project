package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.VehicleCamera;
import com.example.demo.data.repo.VehicleCameraRepo;

@Service
public class VehicleCameraService {

	private VehicleCameraRepo repo;

	public VehicleCameraService(VehicleCameraRepo repo) {
		super();
		this.repo = repo;
	}

	public List<VehicleCamera> getVehicleCameraByPersonId(Long personId) {
		return this.repo.getVehicleCameraByPersonId(personId);
	}

}
