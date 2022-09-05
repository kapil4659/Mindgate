package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Address;
import com.mindgate.main.repository.AddressDetailsRepositoryInterface;
@Service
public class AddressDetailsService implements AddressDetailsServiceInterface {

	@Autowired
	private AddressDetailsRepositoryInterface addressDetailsRepository;
	
	
	@Override
	public boolean addNewAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDetailsRepository.addNewAddress(address);
	}

	@Override
	public List<Address> getAllAddresses() {
		// TODO Auto-generated method stub
		return addressDetailsRepository.getAllAddresses();
	}

}
