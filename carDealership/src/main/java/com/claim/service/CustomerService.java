package com.claim.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.claim.entity.Address;
import com.claim.entity.Customer;

@Service
public class CustomerService {
	
	//create a new arrayList of Customer Objects
	List<Customer> customerList = new ArrayList<Customer>();
	
	//create static admin account and user account
	@PostConstruct
	public void testAccounts() {
		Customer user = new Customer();
		user.setFirstName("User");
		user.setLastName("Name");
		user.setEmail("test@test.com");
		user.setAge(21);
		user.setPassword("test");
		
		customerList.add(user);
		
		Customer admin = new Customer();
		admin.setFirstName("Admin");  
		admin.setLastName("Astrator");
		admin.setEmail("admin@admin.com");
		admin.setAge(30);
		admin.setPassword("test");
		
		customerList.add(admin);
	}
	
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
