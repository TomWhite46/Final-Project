package com.example.demo.service;

import java.util.List;

import com.example.demo.data.Citizen;

public interface CitizenService {

	public Citizen getByCitizenID(Float id);

	public List<Citizen> getAllCitizens();

	public List<Citizen> getByCitizenForenames(String forenames);

	public List<Citizen> getByCitizenSurname(String surname);

	public List<Citizen> getByCitizenAddress(String address);

	public List<Citizen> getByCitizenDob(String dob);

	public List<Citizen> getByCitizenPOB(String placeOfBirth);

	public List<Citizen> getByCitizenSex(String sex);

}
