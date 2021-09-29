package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.data.Bankcard;
import com.example.demo.data.repo.BankcardRepo;

@Service
public class BankcardService {

	private BankcardRepo repo;

	public BankcardService(BankcardRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Bankcard> getAllBankcards() {
		return this.repo.findAll();
	}

	public List<Bankcard> getBankcardByPersonId(Long personId) {
		return this.repo.getBankcardByPersonId(personId);
	}

}
