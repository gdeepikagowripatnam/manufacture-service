package com.manufacture.manage.model;

import jakarta.validation.constraints.NotBlank;

public class ContactModel {
	private int contactId;
	@NotBlank(message = "contactType should not be not null")
	private String contactType;

	private String value;

	private CustomerModel customerModel;

	public ContactModel() {
		super();
	}

	public ContactModel(int contactId, String contactType, String value, CustomerModel customerModel) {
		super();
		this.contactId = contactId;
		this.contactType = contactType;
		this.value = value;
		this.customerModel = customerModel;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ContactModel [contactId=" + contactId + ", contactType=" + contactType + ", value=" + value
				+ ", customerModel=" + customerModel + "]";
	}

}
