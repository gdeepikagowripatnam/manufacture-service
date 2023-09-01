package com.manufacture.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address", schema = "manufacture_schema")
public class AddressEntity {

	@Id
	@Column(name = "address_id")
	private int addressId;
	
	private String line1;
	
	private String line2;
	
	private String line3;
	
	private String city;
	
	private String state;
	
	@Column(name = "postal_code")
	private String postalCode;

	public AddressEntity() {
		super();
	}

	public AddressEntity(int addressId, String line1, String line2, String line3, String city, String state,
			String postalCode) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "AddressEntity [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3
				+ ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]";
	}

}
