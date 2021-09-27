package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.AtmTransaction;
import com.example.demo.data.repo.AtmTransactionsRepo;
import com.example.demo.dto.AtmTransactionsDTO;

@Service
public class AtmTransactionsService {

	@Autowired
	private AtmTransactionsRepo repo;

	private ModelMapper mapper;

	public AtmTransactionsService(AtmTransactionsRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}

	private AtmTransactionsDTO mapToDTO(AtmTransaction atmtransaction) {
		return this.mapper.map(atmtransaction, AtmTransactionsDTO.class);
	}

	private AtmTransaction mapFromDTO(AtmTransactionsDTO atmTransaction) {
		return this.mapper.map(atmTransaction, AtmTransaction.class);
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

}
