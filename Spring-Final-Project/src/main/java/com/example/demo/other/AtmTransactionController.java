package com.example.demo.other;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AtmTransactionsDTO;
import com.example.demo.dto.EposTransactionDTO;
import com.example.demo.service.AtmTransactionsService;
import com.example.demo.service.BankcardService;
import com.example.demo.service.EposTransactionService;

@RestController
@CrossOrigin
public class AtmTransactionController {

	@Autowired
	private AtmTransactionsService service;

	@Autowired
	private EposTransactionService eposService;

	@Autowired
	private BankcardService bankCardService;

	public AtmTransactionController(AtmTransactionsService service, EposTransactionService eposService,
			BankcardService bankcardService) {
		super();
		this.service = service;
		this.eposService = eposService;
		this.bankCardService = bankCardService;
	}

	@GetMapping("getAllTransactions/{cardNumber}")
	public ResponseEntity<List<AtmTransactionsDTO>> getAllAtmTransactions(@PathVariable Long cardNumber) {
		return ResponseEntity.ok(this.service.getAllTransactions(cardNumber));
	}

	@GetMapping("getAllEposTransactions/{cardNumber}")
	public ResponseEntity<List<EposTransactionDTO>> getAllEposTransactions(@PathVariable Long cardNumber) {
		return ResponseEntity.ok(this.eposService.getAllEposTransaction(cardNumber));
	}

}
