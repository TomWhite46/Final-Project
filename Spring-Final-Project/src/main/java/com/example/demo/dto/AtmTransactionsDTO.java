package com.example.demo.dto;

import java.util.Objects;

public class AtmTransactionsDTO {

	private Integer atmId;
	private String timestamp;
	private Long cardNumber;
	private String type;
	private double amount;

	public AtmTransactionsDTO(Integer atmId, String timestamp, Long cardNumber, String type, double amount) {
		super();
		this.atmId = atmId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.type = type;
		this.amount = amount;
	}

	public AtmTransactionsDTO() {

	}

	public Integer getAtmId() {
		return atmId;
	}

	public void setAtmId(Integer atmId) {
		this.atmId = atmId;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, atmId, cardNumber, timestamp, type);
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
		AtmTransactionsDTO other = (AtmTransactionsDTO) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(atmId, other.atmId) && Objects.equals(cardNumber, other.cardNumber)
				&& Objects.equals(timestamp, other.timestamp) && Objects.equals(type, other.type);
	}

}
