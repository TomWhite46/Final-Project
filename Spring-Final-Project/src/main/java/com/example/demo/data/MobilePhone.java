package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobilePhone {

	@Id
	@Column(name = "phone_id")
	private Integer mobilePhoneId;

	@Column(name = "phone_number")
	private String mobilePhoneNumber;
	@Column(name = "operator")
	private String mobilePhoneOperator;

	public MobilePhone(Integer mobilePhoneId, String mobilePhoneNumber, String mobilePhoneOperator) {
		super();
		this.mobilePhoneId = mobilePhoneId;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.mobilePhoneOperator = mobilePhoneOperator;
	}

	public MobilePhone(String mobilePhoneNumber, String mobilePhoneOperator) {
		super();
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.mobilePhoneOperator = mobilePhoneOperator;
	}

	public MobilePhone() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(mobilePhoneId, mobilePhoneNumber, mobilePhoneOperator);
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
		MobilePhone other = (MobilePhone) obj;
		return Objects.equals(mobilePhoneId, other.mobilePhoneId) && mobilePhoneNumber == other.mobilePhoneNumber
				&& Objects.equals(mobilePhoneOperator, other.mobilePhoneOperator);
	}

	public Integer getMobilePhoneId() {
		return mobilePhoneId;
	}

	public void setMobilePhoneId(Integer mobilePhoneId) {
		this.mobilePhoneId = mobilePhoneId;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getMobilePhoneOperator() {
		return mobilePhoneOperator;
	}

	public void setMobilePhoneOperator(String mobilePhoneOperator) {
		this.mobilePhoneOperator = mobilePhoneOperator;
	}

	@Override
	public String toString() {
		return "MobilePhone [mobilePhoneId=" + mobilePhoneId + ", mobilePhoneNumber=" + mobilePhoneNumber
				+ ", mobilePhoneOperator=" + mobilePhoneOperator + "]";
	}

}
