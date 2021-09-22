package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.data.BusinessAddress;
import com.example.demo.data.repo.BusinessAddressRepo;

@Service
public class BusinessAddressService {

	private BusinessAddressRepo repo;

	public BusinessAddressService(BusinessAddressRepo repo) {
		super();
		this.repo = repo;
	}

	public List<BusinessAddress> getAllBusinessAddresses() {
		return this.repo.findAll();
	}

	@Transactional
	public BusinessAddress getByBusinessAddressId(Integer id) {
		BusinessAddress found = this.repo.findById(id).get();
		return found;
	}

}
