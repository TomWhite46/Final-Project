package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.data.EposTransaction;
import com.example.demo.data.repo.EposTransactionRepo;
import com.example.demo.dto.EposTransactionDTO;

@Service
public class EposTransactionService {

	private EposTransactionRepo repo;

	private ModelMapper mapper;

	public EposTransactionService(EposTransactionRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}

	private EposTransactionDTO mapToDTO(EposTransaction eposTransaction) {
		return this.mapper.map(eposTransaction, EposTransactionDTO.class);
	}

	public EposTransactionDTO addEposTransactions(EposTransaction eposTransaction) {
		EposTransaction saved = this.repo.save(eposTransaction);
		return this.mapToDTO(saved);
	}

	public List<EposTransactionDTO> getAllEposTransaction(Long cardNumber) {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public List<EposTransaction> getByEposCardNumber(Long cardNumber) {
		return this.repo.findByEposCardNumber(cardNumber);
	}

}
