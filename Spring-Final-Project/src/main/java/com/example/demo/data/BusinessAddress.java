package com.example.demo.data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusinessAddress {

	@Id
	@Column(name="address_id")
	private Integer businessAddressId;

	@Column(name= "business_name")
	private String businessName;
	@Column(name="street_name")
	private String businessAddressStreetName;
	@Column(name="type_of_business")
	private String businessAddressTypeOfBusiness;
	@Column(name="postcode")
	private String businessAddressPostcode;
	@Column(name="town")
	private String businessAddressTown;
	@Column(name="house_number")
	private String businessAddressHouseNumber;
	
	public BusinessAddress(Integer businessAddressId, String businessName, String businessAddressStreetName,
			String businessAddressTypeOfBusiness, String businessAddressPostcode, String businessAddressTown,
			String businessAddressHouseNumber) {
		super();
		this.businessAddressId = businessAddressId;
		this.businessName = businessName;
		this.businessAddressStreetName = businessAddressStreetName;
		this.businessAddressTypeOfBusiness = businessAddressTypeOfBusiness;
		this.businessAddressPostcode = businessAddressPostcode;
		this.businessAddressTown = businessAddressTown;
		this.businessAddressHouseNumber = businessAddressHouseNumber;
	}
	public BusinessAddress(String businessName, String businessAddressStreetName,
			String businessAddressTypeOfBusiness, String businessAddressPostcode, String businessAddressTown,
			String businessAddressHouseNumber) {
		super();
		this.businessName = businessName;
		this.businessAddressStreetName = businessAddressStreetName;
		this.businessAddressTypeOfBusiness = businessAddressTypeOfBusiness;
		this.businessAddressPostcode = businessAddressPostcode;
		this.businessAddressTown = businessAddressTown;
		this.businessAddressHouseNumber = businessAddressHouseNumber;
	}
	public BusinessAddress() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(businessAddressHouseNumber, businessAddressId, businessAddressPostcode,
				businessAddressStreetName, businessAddressTown, businessAddressTypeOfBusiness, businessName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessAddress other = (BusinessAddress) obj;
		return Objects.equals(businessAddressHouseNumber, other.businessAddressHouseNumber)
				&& Objects.equals(businessAddressId, other.businessAddressId)
				&& Objects.equals(businessAddressPostcode, other.businessAddressPostcode)
				&& Objects.equals(businessAddressStreetName, other.businessAddressStreetName)
				&& Objects.equals(businessAddressTown, other.businessAddressTown)
				&& Objects.equals(businessAddressTypeOfBusiness, other.businessAddressTypeOfBusiness)
				&& Objects.equals(businessName, other.businessName);
	}
	public Integer getBusinessAddressId() {
		return businessAddressId;
	}
	public void setBusinessAddressId(Integer businessAddressId) {
		this.businessAddressId = businessAddressId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessAddressStreetName() {
		return businessAddressStreetName;
	}
	public void setBusinessAddressStreetName(String businessAddressStreetName) {
		this.businessAddressStreetName = businessAddressStreetName;
	}
	public String getBusinessAddressTypeOfBusiness() {
		return businessAddressTypeOfBusiness;
	}
	public void setBusinessAddressTypeOfBusiness(String businessAddressTypeOfBusiness) {
		this.businessAddressTypeOfBusiness = businessAddressTypeOfBusiness;
	}
	public String getBusinessAddressPostcode() {
		return businessAddressPostcode;
	}
	public void setBusinessAddressPostcode(String businessAddressPostcode) {
		this.businessAddressPostcode = businessAddressPostcode;
	}
	public String getBusinessAddressTown() {
		return businessAddressTown;
	}
	public void setBusinessAddressTown(String businessAddressTown) {
		this.businessAddressTown = businessAddressTown;
	}
	public String getBusinessAddressHouseNumber() {
		return businessAddressHouseNumber;
	}
	public void setBusinessAddressHouseNumber(String businessAddressHouseNumber) {
		this.businessAddressHouseNumber = businessAddressHouseNumber;
	}
	@Override
	public String toString() {
		return "BusinessAddress [businessAddressId=" + businessAddressId + ", businessName=" + businessName
				+ ", businessAddressStreetName=" + businessAddressStreetName + ", businessAddressTypeOfBusiness="
				+ businessAddressTypeOfBusiness + ", businessAddressPostcode=" + businessAddressPostcode
				+ ", businessAddressTown=" + businessAddressTown + ", businessAddressHouseNumber="
				+ businessAddressHouseNumber + "]";
	}

	

}
