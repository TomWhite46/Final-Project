package com.example.demo.other;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.AtmPoint;
import com.example.demo.data.AtmTransaction;
import com.example.demo.data.Epos;
import com.example.demo.data.EposTransaction;
import com.example.demo.dto.AtmTransactionsDTO;
import com.example.demo.dto.EposTransactionDTO;
import com.example.demo.service.AtmTransactionsService;
import com.example.demo.service.EposTransactionService;

@RestController
@CrossOrigin
public class AtmTransactionController {

	private AtmTransactionsService service;

	private EposTransactionService eposService;

	@Autowired
	public AtmTransactionController(AtmTransactionsService service, EposTransactionService eposService) {
		super();
		this.service = service;
		this.eposService = eposService;
	}

	@GetMapping("getAllTransactions/{cardNumber}")
	public ResponseEntity<List<AtmTransactionsDTO>> getAllAtmTransactions(@PathVariable Long cardNumber) {
		return ResponseEntity.ok(this.service.getAllTransactions(cardNumber));
	}

	@GetMapping("getAllEposTransactions/{cardNumber}")
	public ResponseEntity<List<EposTransactionDTO>> getAllEposTransactions(@PathVariable Long cardNumber) {
		return ResponseEntity.ok(this.eposService.getAllEposTransaction(cardNumber));
	}

	@GetMapping("getByAtmCardNumber/{cardNumber}")
	public ResponseEntity<List<AtmTransaction>> getByAtmCardNumber(@PathVariable Long cardNumber) {
		return ResponseEntity.ok(this.service.getByAtmCardNumber(cardNumber));
	}

	@GetMapping("getByEposCardNumber/{cardNumber}")
	public ResponseEntity<List<EposTransaction>> getByEposCardNumber(@PathVariable Long cardNumber) {
		return ResponseEntity.ok(this.eposService.getByEposCardNumber(cardNumber));
	}

	@GetMapping("getAllAtmInfo/{atmId}")
	public ResponseEntity<Optional<AtmPoint>> getByAtmId(@PathVariable Integer atmId) {
		return ResponseEntity.ok(this.service.getAllAtmInfo(atmId));
	}

	@GetMapping("getAllEposInfo/{eposId}")
	public ResponseEntity<Optional<Epos>> getByEposId(@PathVariable Integer eposId) {
		return ResponseEntity.ok(this.eposService.getByEposId(eposId));
	}

	@GetMapping("getAtmTransactionByPersonId/{personId}")
	public ResponseEntity<List<AtmTransaction>> getAtmTransactionByPersonId(@PathVariable Long personId) {
		return ResponseEntity.ok(this.service.getAtmTransactionByPersonId(personId));
	}

	@GetMapping("getEposTransactionByPersonId/{personId}")
	public ResponseEntity<List<EposTransaction>> getEposTransactionByPersonId(@PathVariable Long personId) {
		return ResponseEntity.ok(this.eposService.getEposTransactionByPersonId(personId));
	}

}
