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
	@Column(name = "timestamp")
	private String eposTimestamp;
	@Column(name = "card_number")
	private Long eposCardNumber;
	@Column(name = "payee_account")
	private Long payeeAccount;
	@Column(name = "amount")
	private double eposAmount;

	public EposTransaction(Integer id, Integer eposId, String eposTimestamp, Long eposCardNumber, Long payeeAccount,
			double eposAmount) {
		super();
		this.id = id;
		this.eposId = eposId;
		this.eposTimestamp = eposTimestamp;
		this.eposCardNumber = eposCardNumber;
		this.payeeAccount = payeeAccount;
		this.eposAmount = eposAmount;
	}

	public EposTransaction(Integer eposId, String eposTimestamp, Long eposCardNumber, Long payeeAccount,
			double eposAmount) {
		super();
		this.eposId = eposId;
		this.eposTimestamp = eposTimestamp;
		this.eposCardNumber = eposCardNumber;
		this.payeeAccount = payeeAccount;
		this.eposAmount = eposAmount;
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

	public String getEposTimestamp() {
		return eposTimestamp;
	}

	public void setEposTimestamp(String eposTimestamp) {
		this.eposTimestamp = eposTimestamp;
	}

	public Long getEposCardNumber() {
		return eposCardNumber;
	}

	public void setEposCardNumber(Long eposCardNumber) {
		this.eposCardNumber = eposCardNumber;
	}

	public Long getPayeeAccount() {
		return payeeAccount;
	}

	public void setPayeeAccount(Long payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public double getEposAmount() {
		return eposAmount;
	}

	public void setEposAmount(double eposAmount) {
		this.eposAmount = eposAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eposAmount, eposCardNumber, eposId, eposTimestamp, id, payeeAccount);
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
		return Double.doubleToLongBits(eposAmount) == Double.doubleToLongBits(other.eposAmount)
				&& Objects.equals(eposCardNumber, other.eposCardNumber) && Objects.equals(eposId, other.eposId)
				&& Objects.equals(eposTimestamp, other.eposTimestamp) && Objects.equals(id, other.id)
				&& Objects.equals(payeeAccount, other.payeeAccount);
	}

}
