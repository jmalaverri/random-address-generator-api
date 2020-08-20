package com.code.challenge.randomaddressgenerator.services;

import java.util.Locale;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.code.challenge.randomaddressgenerator.domain.Address;
import com.github.javafaker.Faker;

/**
 * This class is for generating a random address
 * 
 * @since address-generator-core-0.1
 * @version 0.1
 */

@Service
public class AddressService {

	/**
	 * Allows to generate a random address for US, Canada, Mexico, and Netherlands
	 * 
	 * @since burger-core-0.1
	 */
	public Address randomAddressGenerator() {
		String[] countries = { "en-US", "fr-CA", "es-MX", "nl" };
		String[] countryCode = { "USA", "CAN", "MEX", "NLD" };
		String[] countryName = { "United States of America", "Canada", "Mexico", "Netherlands" };
		int[] secondAddress = { 1, 2 };
		int opt = new Random().nextInt(secondAddress.length);
		int rnd = new Random().nextInt(countries.length);

		Faker generator = new Faker(new Locale(countries[rnd]));

		String number = generator.address().streetAddressNumber();
		String streetNameSingleAddr = (countries[rnd].equals("en-US") || countries[rnd].equals("nl")
				? generator.address().streetName() + " " + generator.address().streetSuffix()
				: generator.address().streetPrefix() + " " + generator.address().streetName());
		String streetNameWithSecAddr = streetNameSingleAddr + ", " + generator.address().secondaryAddress();
		String streetName = (secondAddress[opt] == 1) ? streetNameSingleAddr : streetNameWithSecAddr;
		String city = generator.address().city();
		String postCode = (countries[rnd].equals("en-US")) ? generator.address().zipCode().substring(0, 5)
				: generator.address().zipCode();
		String state = generator.address().state();
		String stateCode = generator.address().stateAbbr();
		String county = (countries[rnd].equals("en-US"))
				? generator.address().countyByZipCode(generator.address().zipCodeByState(stateCode))
				: "";

		return new Address(number, streetName, postCode, city, county, state, stateCode, countryName[rnd],
				countryCode[rnd]);
	}
}
