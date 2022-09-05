package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Address;
import com.mindgate.main.service.AddressDetailsServiceInterface;

@RestController
@RequestMapping("addressapi")
public class AddressDetailsController {

	@Autowired
	private AddressDetailsServiceInterface addressDetailsService;

	//http: //localhost: 8080/addressapi/address
	@RequestMapping(value = "address", method= RequestMethod.POST)
	public boolean addNewAddress(@RequestBody Address address) {
		System.out.println(address);
		return addressDetailsService.addNewAddress(address);
		
	}
	
	//http: //localhost: 8080/addressapi/address/all
	@RequestMapping(value = "address/all", method= RequestMethod.GET)
	public List<Address> getAllAddresses(){
		return addressDetailsService.getAllAddresses();
	}
	
	
	
}
