package com.code.challenge.randomaddressgenerator.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.challenge.randomaddressgenerator.domain.Address;
import com.code.challenge.randomaddressgenerator.services.AddressService;

@RestController
public class AddressResource {
	
	@Autowired
	AddressService service;
	
	@GetMapping("/randomizer/address")
	public ResponseEntity<Address> getAddress() {
		Address address = service.randomAddressGenerator();
		return ResponseEntity.ok().body(address);
		
	}

//	public ResponseEntity<Student> findById(@PathVariable("id") Integer studentId){
//		Student student = studentRepository.findById(studentId).orElseThrow(
//				() -> new ResourceNotFoundException("Student not found..." + studentId));
//		
//		return ResponseEntity.ok().body(student);
//	}
	
}
