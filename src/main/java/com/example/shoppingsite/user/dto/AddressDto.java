package com.example.shoppingsite.user.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.example.shoppingsite.user.entity.User;

public class AddressDto {

	
	private String firstAddress;
	
	private String city;
	
	private String state;
	
	private String country;
	
	

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AddressDto(String firstAddress, String city, String state, String country) {
		super();
		this.firstAddress = firstAddress;
		this.city = city;
		this.state = state;
		this.country = country;
	}



	public String getFirstAddress() {
		return firstAddress;
	}



	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "AddressDto [firstAddress=" + firstAddress + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
	
	


}
