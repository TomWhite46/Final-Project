package com.example.demo.data;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleCamera {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "timestamp")
	private java.sql.Timestamp timestamp;
	@Column(name = "vehicle_registration_number")
	private String vehicleRegistrationNumber;
	@Column(name = "street_name")
	private String streetName;
	@Column(name = "latitude")
	private double latitude;
	@Column(name = "longitude")
	private double longitude;

	public VehicleCamera() {
		// TODO Auto-generated constructor stub
	}

	public VehicleCamera(int id, Timestamp timestamp, String vehicleRegistrationNumber, String streetName,
			double latitude, double longitude) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public VehicleCamera(Timestamp timestamp, String vehicleRegistrationNumber, String streetName, double latitude,
			double longitude) {
		super();
		this.timestamp = timestamp;
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
		this.streetName = streetName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, latitude, longitude, streetName, timestamp, vehicleRegistrationNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleCamera other = (VehicleCamera) obj;
		return id == other.id && Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& Objects.equals(streetName, other.streetName) && Objects.equals(timestamp, other.timestamp)
				&& Objects.equals(vehicleRegistrationNumber, other.vehicleRegistrationNumber);
	}

	public java.sql.Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(java.sql.Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getVehicleRegistrationNumber() {
		return vehicleRegistrationNumber;
	}

	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
