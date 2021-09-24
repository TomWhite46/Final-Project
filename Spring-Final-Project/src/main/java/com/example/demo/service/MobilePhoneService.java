package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

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

	@Transactional
	public MobilePhone getByMobilePhoneId(Integer id) {
		MobilePhone found = this.repo.findById(id).get();
		return found;
	}

}
