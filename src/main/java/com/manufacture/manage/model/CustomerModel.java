package com.manufacture.manage.model;

import java.time.LocalDate;
import java.util.List;

public class CustomerModel {

	private int customerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private LocalDate dateOfBirth;
	private List<ContactModel> contactLIst;
	private AddressModel addressModel;

	public CustomerModel() {
		super();
	}

	public CustomerModel(int customerId, String firstName, String middleName, String lastName, String gender,
			LocalDate dateOfBirth, List<ContactModel> contactLIst, AddressModel addressModel) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.contactLIst = contactLIst;
		this.addressModel = addressModel;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<ContactModel> getContactLIst() {
		return contactLIst;
	}

	public void setContactLIst(List<ContactModel> contactLIst) {
		this.contactLIst = contactLIst;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	@Override
	public String toString() {
		return "CustomerModel [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", contactLIst="
				+ contactLIst + ", addressModel=" + addressModel + "]";
	}

}
