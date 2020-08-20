package com.code.challenge.randomaddressgenerator.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.code.challenge.randomaddressgenerator.RandomAddressGeneratorApplication;
import com.code.challenge.randomaddressgenerator.domain.Address;

@SpringBootTest(classes = RandomAddressGeneratorApplication.class)
public class AddressServiceTest {
	
	@Autowired
	AddressService service;

	@Test
	public void testGeneratedAddress() {
		Address newAddress = service.randomAddressGenerator();
		final String addressNumber = newAddress.getHouse();
		final String streetName = newAddress.getStreet();
		final String zipCode = newAddress.getPostalCode();
		final String city = newAddress.getCity();
		final String state = newAddress.getState();
		final String stateCode = newAddress.getStateCode();
		final String countryName = newAddress.getCountry();
		final String countryCode = newAddress.getCountryCode();

		
		Matcher numberMatcher = Pattern.compile("[0-9]+").matcher(addressNumber);
		assertTrue(numberMatcher.find());

		Matcher streetMatcher = Pattern.compile("[A-Za-z0-9\\s,\\.]").matcher(streetName);
		assertTrue(streetMatcher.find());
		
		Matcher cityMatcher = Pattern.compile("[A-Za-z'() ]+").matcher(city); 
		assertTrue(cityMatcher.find());		
		
		Matcher stateMatcher = Pattern.compile("[A-Za-z ]+").matcher(state); 
		assertTrue(stateMatcher.find());
		
		Matcher stateCodeMatcher = Pattern.compile("[A-Za-z ]+").matcher(stateCode); 
		assertTrue(stateCodeMatcher.find());
		
		Matcher countryMatcher = Pattern.compile("[A-Za-z ]+").matcher(countryName); 
		assertTrue(countryMatcher.find());
		
		Matcher countryCodeMatcher = Pattern.compile("[A-Za-z ]+").matcher(countryCode); 
		assertTrue(countryCodeMatcher.find());
		
		assertTrue(!zipCode.isEmpty());

	}

}
