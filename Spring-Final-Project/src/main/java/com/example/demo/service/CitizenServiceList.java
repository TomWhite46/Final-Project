package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Citizen;

@Service
public class CitizenServiceList implements CitizenService {

	private List<Citizen> citizens = new ArrayList<>();

	@Override
	public Citizen getByCitizenID(String id) {

		return null;
	}

	@Override
	public List<Citizen> getAllCitizens() {

		for (Citizen citizen : citizens) {
			System.out.println(citizen);
		}
		return citizens;
	}

	@Override
	public List<Citizen> getByCitizenForenames(String forenames) {

		return null;
	}

	@Override
	public List<Citizen> getByCitizenSurname(String surname) {

		return null;
	}

	@Override
	public List<Citizen> getByCitizenAddress(String address) {

		return null;
	}

	@Override
	public List<Citizen> getByCitizenDob(String dob) {

		return null;
	}

	@Override
	public List<Citizen> getByCitizenPOB(String placeOfBirth) {

		return null;
	}

	@Override
	public List<Citizen> getByCitizenSex(String sex) {

		return null;
	}

	@Override
	public List<Citizen> getByCitizenForenamesAndSurname(String forenames, String surname) {
		return null;
	}

	@Override
	public List<Citizen> getByCitizenForenamesAndDob(String forenames, String dob) {
		return null;
	}

	@Override
	public List<Citizen> getByCitizenForenamesAndSurnameAndDob(String forenames, String surname, String dob) {
		return null;
	}

}
