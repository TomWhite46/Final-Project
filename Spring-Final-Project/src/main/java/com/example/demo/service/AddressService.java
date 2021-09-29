package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.data.Address;
import com.example.demo.data.repo.AddressRepo;

@Service
public class AddressService {

	private AddressRepo repo;

	public AddressService(AddressRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Address> getAllAddresses() {
		return this.repo.findAll();
	}

	@Transactional
	public Address getByAddressId(Integer id) {
		Address found = this.repo.findById(id).get();
		return found;
	}

	public List<Address> getAddressPersonId(long personId) {
		List<Address> address = this.repo.getAddressPersonId(personId);
		return address;

	}

}
