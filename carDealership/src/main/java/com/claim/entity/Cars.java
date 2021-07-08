package com.claim.entity;

public class Cars {
	private String manufacturer;
	private String make;
	private String model;
	private String carDescription;
	private String pictures;
	private String dateOfPurchase;
	private String kilometersRan;
	private int price;
	
	//generate getters and setters
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getKilometersRan() {
		return kilometersRan;
	}

	public void setKilometersRan(String kilometersRan) {
		this.kilometersRan = kilometersRan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
		this.make = model;
	}
	
	public String getCarDescription() {
		return carDescription;
	}
	
	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}
	 
	
	
	
}
