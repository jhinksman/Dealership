package com.claim.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.claim.entity.Customer;

@Service
public class CustomerService {
	
	//create a new arrayList of Customer Objects
	List<Customer> customerList = new ArrayList<Customer>();
	
	//save customers to the array
	public void saveCustomer(Customer newCustomer) {
		customerList.add(newCustomer);
	}
	
	public Customer findByEmail(String email) {
		for(Customer cus: customerList) {
			if(cus.getEmail().equals(email)) {
				return cus;
			}
		}
		return null;
		
	}

}
