package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AtmTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "atm_id")
	private Integer atmId;

	@Column
	private String timestamp;
	@Column(name = "card_number")
	private Long cardNumber;
	private String type;
	private double amount;

	public AtmTransaction(Integer id, Integer atmId, String timestamp, Long cardNumber, String type, double amount) {
		super();
		this.id = id;
		this.atmId = atmId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.type = type;
		this.amount = amount;
	}

	public AtmTransaction(Integer atmId, String timestamp, Long cardNumber, String type, double amount) {
		super();
		this.atmId = atmId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.type = type;
		this.amount = amount;
	}

	public AtmTransaction() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return Objects.hash(amount, atmId, cardNumber, id, timestamp, type);
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
		AtmTransaction other = (AtmTransaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(atmId, other.atmId) && Objects.equals(cardNumber, other.cardNumber)
				&& Objects.equals(id, other.id) && Objects.equals(timestamp, other.timestamp)
				&& Objects.equals(type, other.type);
	}

}
