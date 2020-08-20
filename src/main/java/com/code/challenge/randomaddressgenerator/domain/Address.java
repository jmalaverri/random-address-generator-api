package com.code.challenge.randomaddressgenerator.domain;

public class Address {
	private String house;
	private String street;
	private String postalCode;
	private String city;
	private String county;
	private String state;
	private String stateCode;
	private String country;
	private String countryCode;
	
	public Address() {
		
	}

	public Address(String house, String street, String postalCode, String city, String county, String state,
			String stateCode, String country, String countryCode) {
		super();
		this.house = house;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.county = county;
		this.state = state;
		this.stateCode = stateCode;
		this.country = country;
		this.countryCode = countryCode;
	}

	public String getHouse() {
		return house;
	}

	public String getStreet() {
		return street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getCounty() {
		return county;
	}

	public String getState() {
		return state;
	}

	public String getStateCode() {
		return stateCode;
	}

	public String getCountry() {
		return country;
	}

	public String getCountryCode() {
		return countryCode;
	}
	
	

	public void setHouse(String house) {
		this.house = house;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Address [house=" + house + ", street=" + street + ", postalCode=" + postalCode + ", city=" + city
				+ ", county=" + county + ", state=" + state + ", stateCode=" + stateCode + ", country=" + country
				+ ", countryCode=" + countryCode + "]";
	}
	
}
