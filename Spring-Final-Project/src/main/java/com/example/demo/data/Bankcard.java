package com.example.demo.data;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bankcard {

	@Column(name = "bankcard_id")
	private Integer bankcardId;
	@Column(name = "sort_code")
	private String bankcardSortcode;
	@Id
	@Column(name = "card_number")
	private Long cardNumber;

	@OneToMany(mappedBy = "cardNumber") // sets the FK
	private List<AtmTransaction> atmTransactions;

	public Bankcard(Integer bankcardId, String bankcardSortcode, Long cardNumber) {
		super();
		this.bankcardId = bankcardId;
		this.bankcardSortcode = bankcardSortcode;
		this.cardNumber = cardNumber;
	}

	public Bankcard(String bankcardSortcode, Long cardNumber) {
		super();
		this.bankcardSortcode = bankcardSortcode;
		this.cardNumber = cardNumber;
	}

	public Bankcard() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(cardNumber, bankcardId, bankcardSortcode);
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
		Bankcard other = (Bankcard) obj;
		return Objects.equals(cardNumber, other.cardNumber) && bankcardId == other.bankcardId
				&& Objects.equals(bankcardSortcode, other.bankcardSortcode);
	}

	public Integer getBankcardId() {
		return bankcardId;
	}

	public void setBankcardId(Integer bankcardId) {
		this.bankcardId = bankcardId;
	}

	public String getBankcardSortcode() {
		return bankcardSortcode;
	}

	public void setBankcardSortcode(String bankcardSortcode) {
		this.bankcardSortcode = bankcardSortcode;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Bankcard [bankcardId=" + bankcardId + ", bankcardSortcode=" + bankcardSortcode + ", cardNumber="
				+ cardNumber + "]";
	}

}
