package com.example.shoppingsite.user.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.shoppingsite.user.entity.Address;

public class UserDto {

	
	private String  firstName;
	
	private String lastName;
	

	private AddressDto address;
	
	private String panCard;
	
	private String mobileNo;
	
	private String gender;

	public UserDto(String firstName, String lastName, AddressDto address, String panCard, String mobileNo, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.panCard = panCard;
		this.mobileNo = mobileNo;
		this.gender = gender;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", panCard="
				+ panCard + ", mobileNo=" + mobileNo + ", gender=" + gender + "]";
	}
	
	
}
