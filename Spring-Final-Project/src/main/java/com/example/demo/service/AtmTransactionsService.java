package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.data.AtmPoint;
import com.example.demo.data.AtmTransaction;
import com.example.demo.data.repo.AtmPointRepo;
import com.example.demo.data.repo.AtmTransactionsRepo;
import com.example.demo.dto.AtmTransactionsDTO;

@Service
public class AtmTransactionsService {

	private AtmTransactionsRepo repo;

	private AtmPointRepo atmPointRepo;

	private ModelMapper mapper;

	public AtmTransactionsService(AtmTransactionsRepo repo, AtmPointRepo atmPointRepo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
		this.atmPointRepo = atmPointRepo;
	}

	private AtmTransactionsDTO mapToDTO(AtmTransaction atmtransaction) {
		return this.mapper.map(atmtransaction, AtmTransactionsDTO.class);
	}

	public List<AtmTransaction> getByAtmCardNumber(Long cardNumber) {
		return this.repo.findByCardNumber(cardNumber);
	}

	public AtmTransactionsDTO addAtmTransaction(AtmTransaction atmTransaction) {
		AtmTransaction saved = this.repo.save(atmTransaction);
		return this.mapToDTO(saved);
	}

	public List<AtmTransactionsDTO> getAllTransactions(Long cardNumber) {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public Optional<AtmPoint> getAllAtmInfo(Integer atmId) {
		return this.atmPointRepo.findById(atmId);
	}

	public List<AtmTransaction> getAtmTransactionByPersonId(Long personId) {
		List<AtmTransaction> transactions = this.repo.getAtmTransactionByPersonId(personId);
		for (AtmTransaction transaction : transactions) {
			transaction.setTimestamp(transaction.getTimestamp().substring(0, 19).replace('T', ' '));
		}
		return transactions;
	}

}
