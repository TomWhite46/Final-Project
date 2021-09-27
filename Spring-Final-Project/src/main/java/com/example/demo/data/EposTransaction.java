package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EposTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "epos_id")
	private Integer eposId;
	private String timestamp;
	@Column(name = "card_number")
	private Long cardNumber;
	@Column(name = "payee_account")
	private Long payeeAccount;
	private double amount;

	public EposTransaction(Integer id, Integer eposId, String timestamp, Long cardNumber, Long payeeAccount,
			double amount) {
		super();
		this.id = id;
		this.eposId = eposId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
	}

	public EposTransaction(Integer eposId, String timestamp, Long cardNumber, Long payeeAccount, double amount) {
		super();
		this.eposId = eposId;
		this.timestamp = timestamp;
		this.cardNumber = cardNumber;
		this.payeeAccount = payeeAccount;
		this.amount = amount;
	}

	public EposTransaction() {
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
		EposTransaction other = (EposTransaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(cardNumber, other.cardNumber) && Objects.equals(eposId, other.eposId)
				&& Objects.equals(id, other.id) && Objects.equals(payeeAccount, other.payeeAccount)
				&& Objects.equals(timestamp, other.timestamp);
	}

}
