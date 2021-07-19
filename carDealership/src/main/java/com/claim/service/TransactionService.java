package com.claim.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Transactions;

@Service
public class TransactionService {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	VehicleService vehicleService;

	// List for transactions
	List<Transactions> transactionHistory = new ArrayList<Transactions>();
	
	
	public List<Transactions> findAll(){
		return transactionHistory;
	}
	
	public void saveTransactionHistory(Transactions transaction) {
		transactionHistory.add(transaction);
	}
	
	public int generateTransactionId() {
		int firstTransaction = 0;

		for(Transactions transaction: transactionHistory) {
			firstTransaction = transaction.getTransactionId();
		}
		int newTransactionId = ++firstTransaction;
		return newTransactionId;
	}
	
	public void sellCar(double vin, String email) {
		
		Transactions transaction = new Transactions();
		
		transaction.setTransactionId(generateTransactionId());
		transaction.setDateOfPurchase(LocalDate.now());
		transaction.setCustomer(customerService.findByEmail(email));
		transaction.setCars(vehicleService.findByVin(vin));
		transactionHistory.add(transaction);
//		vehicleService.carsSold.add(vehicleService.findByVin(vin));
//		vehicleService.carsInventory.remove(vehicleService.findByVin(vin));
	}
	
}
