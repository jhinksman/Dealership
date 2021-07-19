package com.claim.entity;

import java.time.LocalDate;

public class Cars {
	// type will be car, motorcycle, or truck
	private String type;
	private String newOrUsed;
	private String make;
	private String model;
	private String carDescription;
	// maybe make this an arrayList so you can have multiple pictures?
	private String pictures;
	private int kilometersRan;
	// unique identifier for a car
	private double vin;
	private int price;
	private int purchasePrice;
	private LocalDate dealershipPurchaseDate;

	// parameterized constructor
	public Cars(String type, String newOrUsed, String make, String model, String carDescription, String pictures,
			int kilometersRan, double vin, int price, int purchasePrice, LocalDate dealershipPurchaseDate) {
		super();
		this.type = type;
		this.newOrUsed = newOrUsed;
		this.make = make;
		this.model = model;
		this.carDescription = carDescription;
		this.pictures = pictures;
		this.kilometersRan = kilometersRan;
		this.vin = vin;
		this.price = price;
		this.dealershipPurchaseDate = dealershipPurchaseDate;
	}

	// default constructor
	public Cars() {
		super();
	}

	// generate getters and setters
	public LocalDate getDealershipPurchaseDate() {
		return dealershipPurchaseDate;
	}

	public void setDealershipPurchaseDate(LocalDate dealershipPurchaseDate) {
		this.dealershipPurchaseDate = dealershipPurchaseDate;
	}

	public String getNewOrUsed() {
		return newOrUsed;
	}

	public void setNewOrUsed(String newOrUsed) {
		this.newOrUsed = newOrUsed;
	}

	public double getVin() {
		return vin;
	}

	public void setVin(double vin) {
		this.vin = vin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public int getKilometersRan() {
		return kilometersRan;
	}

	public void setKilometersRan(int kilometersRan) {
		this.kilometersRan = kilometersRan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}

}
