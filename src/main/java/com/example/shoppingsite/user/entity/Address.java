package com.example.shoppingsite.user.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String firstAddress;
	
	private String city;
	
	private String state;
	
	private String country;
	
	@OneToMany(mappedBy = "address")
	private List<User> user;

	public Address(int id, String firstAddress, String city, String state, String country) {
		super();
		this.id = id;
		this.firstAddress = firstAddress;
		this.city = city;
		this.state = state;
		this.country = country;
		
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", firstAddress=" + firstAddress + ", city=" + city + ", state=" + state
				+ ", country=" + country +  "]";
	}
	
	
}
