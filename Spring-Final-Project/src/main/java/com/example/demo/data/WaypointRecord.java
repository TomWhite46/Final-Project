package com.example.demo.data;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WaypointRecord {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "timestamp")
	private java.sql.Timestamp timestamp;
	@Column(name = "person_id")
	private long personID;
	@Column(name = "name")
	private String personName;
	@Column(name = "latitude")
	private double latitude;
	@Column(name = "longitude")
	private double longitude;

	public WaypointRecord() {
		// TODO Auto-generated constructor stub
	}

	public WaypointRecord(Long id, Timestamp timestamp, long personID, String personName, double latitude,
			double longitude) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.personID = personID;
		this.personName = personName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public WaypointRecord(Timestamp timestamp, long personID, String personName, double latitude, double longitude) {
		super();
		this.timestamp = timestamp;
		this.personID = personID;
		this.personName = personName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, latitude, longitude, personID, personName, timestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WaypointRecord other = (WaypointRecord) obj;
		return Objects.equals(id, other.id)
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude)
				&& personID == other.personID && Objects.equals(personName, other.personName)
				&& Objects.equals(timestamp, other.timestamp);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.sql.Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(java.sql.Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public long getPersonID() {
		return personID;
	}

	public void setPersonID(long personID) {
		this.personID = personID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
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
