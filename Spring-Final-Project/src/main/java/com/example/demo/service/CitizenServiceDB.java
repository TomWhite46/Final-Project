package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.data.Citizen;
import com.example.demo.data.repo.CitizenRepo;

@Service
@Primary
public class CitizenServiceDB implements CitizenService {

	private CitizenRepo repo;

	public CitizenServiceDB(CitizenRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Citizen> getAllCitizens() {
		return this.repo.findAll();
	}

	@Override
	public List<Citizen> getByCitizenForenames(String forenames) {
		return this.repo.findByForenamesIgnoreCase(forenames);
	}

	@Override
	public List<Citizen> getByCitizenSurname(String surname) {
		return this.repo.findBySurnameIgnoreCase(surname);
	}

	@Override
	public List<Citizen> getByCitizenAddress(String address) {
		return this.repo.findByAddressIgnoreCase(address);
	}

	@Override
	public List<Citizen> getByCitizenPOB(String placeOfBirth) {
		return this.repo.findByPlaceOfBirthIgnoreCase(placeOfBirth);
	}

	@Override
	public List<Citizen> getByCitizenSex(String sex) {
		return this.repo.findBySex(sex);
	}

	@Override
	public List<Citizen> getByCitizenDob(LocalDate dob) {
		return this.repo.findByDob(dob);
	}

	@Override
	@Transactional
	public Citizen getByCitizenID(String id) {
		Citizen found = this.repo.findById(id).get();
		return found;
	}

}
