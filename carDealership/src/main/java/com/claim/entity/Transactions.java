package com.claim.entity;

import java.time.LocalDate;

public class Transactions {

	private double vin;
	private String email;
	private Customer customer;
	private Cars cars;
	private LocalDate dateOfPurchase;
	private int transactionId;

	//default constructor
	public Transactions() {
	}
	
	// paramaterized constructor
	public Transactions(double vin, String email, Customer customer, Cars cars, LocalDate dateOfPurchase, int transactionId) {
		super();
		this.vin = vin;
		this.email = email;
		this.customer = customer;
		this.cars = cars;
		this.dateOfPurchase = dateOfPurchase;
		this.transactionId = transactionId;
	}

	// generate getters and setters

	public double getVin() {
		return vin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cars getCars() {
		return cars;
	}

	public void setCars(Cars cars) {
		this.cars = cars;
	}

	public void setVin(double vin) {
		this.vin = vin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

}
