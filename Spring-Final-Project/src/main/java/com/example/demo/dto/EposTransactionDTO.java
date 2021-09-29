package com.example.demo.dto;

import java.util.Objects;

public class EposTransactionDTO {

	private Integer id;
	private Integer eposId;
	private String timestamp;
	private Long cardNumber;
	private Long payeeAccount;
	private double amount;

	public EposTransactionDTO(Integer id, Integer eposId, String timestamp, Long cardNumber, Long payeeAccount,
			double amount) {
		super();
		this.id = id;
		this.eposId = eposId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
	}

	public EposTransactionDTO(Integer eposId, String timestamp, Long cardNumber, Long payeeAccount, double amount) {
		super();
		this.eposId = eposId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
	}

	public EposTransactionDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEposId() {
		return eposId;
	}

	public void setEposId(Integer eposId) {
		this.eposId = eposId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getPayeeAccount() {
		return payeeAccount;
	}

	public void setPayeeAccount(Long payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, cardNumber, eposId, id, payeeAccount, timestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		EposTransactionDTO other = (EposTransactionDTO) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(cardNumber, other.cardNumber) && Objects.equals(eposId, other.eposId)
				&& Objects.equals(id, other.id) && Objects.equals(payeeAccount, other.payeeAccount)
				&& Objects.equals(timestamp, other.timestamp);
	}

}
