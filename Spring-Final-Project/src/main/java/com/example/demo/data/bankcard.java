package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;

public class bankcard {

	@Id
	private int bankcardId;

	@Column
	private String bankcardSortcode;
	private Long bankcardCardNumber;

	public bankcard(int bankcardId, String bankcardSortcode, Long bankcardCardNumber) {
		super();
		this.bankcardId = bankcardId;
		this.bankcardSortcode = bankcardSortcode;
		this.bankcardCardNumber = bankcardCardNumber;
	}

	public bankcard(String bankcardSortcode, Long bankcardCardNumber) {
		super();
		this.bankcardSortcode = bankcardSortcode;
		this.bankcardCardNumber = bankcardCardNumber;
	}

	public bankcard() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(bankcardCardNumber, bankcardId, bankcardSortcode);
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
		bankcard other = (bankcard) obj;
		return Objects.equals(bankcardCardNumber, other.bankcardCardNumber) && bankcardId == other.bankcardId
				&& Objects.equals(bankcardSortcode, other.bankcardSortcode);
	}

	public int getBankcardId() {
		return bankcardId;
	}

	public void setBankcardId(int bankcardId) {
		this.bankcardId = bankcardId;
	}

	public String getBankcardSortcode() {
		return bankcardSortcode;
	}

	public void setBankcardSortcode(String bankcardSortcode) {
		this.bankcardSortcode = bankcardSortcode;
	}

	public Long getBankcardCardNumber() {
		return bankcardCardNumber;
	}

	public void setBankcardCardNumber(Long bankcardCardNumber) {
		this.bankcardCardNumber = bankcardCardNumber;
	}

}
