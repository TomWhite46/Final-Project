package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bankcard {

	@Id
	private Integer bankcardId;

	@Column
	private String bankcardSortcode;
	private Long bankcardCardNumber;

	public Bankcard(Integer bankcardId, String bankcardSortcode, Long bankcardCardNumber) {
		super();
		this.bankcardId = bankcardId;
		this.bankcardSortcode = bankcardSortcode;
		this.bankcardCardNumber = bankcardCardNumber;
	}

	public Bankcard(String bankcardSortcode, Long bankcardCardNumber) {
		super();
		this.bankcardSortcode = bankcardSortcode;
		this.bankcardCardNumber = bankcardCardNumber;
	}

	public Bankcard() {

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
		Bankcard other = (Bankcard) obj;
		return Objects.equals(bankcardCardNumber, other.bankcardCardNumber) && bankcardId == other.bankcardId
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

	public Long getBankcardCardNumber() {
		return bankcardCardNumber;
	}

	public void setBankcardCardNumber(Long bankcardCardNumber) {
		this.bankcardCardNumber = bankcardCardNumber;
	}

	@Override
	public String toString() {
		return "Bankcard [bankcardId=" + bankcardId + ", bankcardSortcode=" + bankcardSortcode + ", bankcardCardNumber="
				+ bankcardCardNumber + "]";
	}

}
