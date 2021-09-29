package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.MobilePhone;
import com.example.demo.data.repo.MobilePhoneRepo;

@Service
public class MobilePhoneService {

	private MobilePhoneRepo repo;

	public MobilePhoneService(MobilePhoneRepo repo) {
		super();
		this.repo = repo;
	}

	public List<MobilePhone> getAllMobilePhones() {
		return this.repo.findAll();
	}

	public List<MobilePhone> getPhoneByPersonId(long personId) {
		List<MobilePhone> phones = this.repo.getPhoneByPersonId(personId);
		return phones;
	}

}
