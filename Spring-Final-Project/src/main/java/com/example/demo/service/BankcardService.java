package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.data.Bankcard;
import com.example.demo.data.repo.BankcardRepo;

@Service
@Primary
public class BankcardService {

	private BankcardRepo repo;

	public BankcardService(BankcardRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Bankcard> getAllBankcards() {
		return this.repo.findAll();
	}

	@Transactional
	public Bankcard getByBankCardId(Integer id) {
		Bankcard found = this.repo.findById(id).get();
		return found;
	}

}
