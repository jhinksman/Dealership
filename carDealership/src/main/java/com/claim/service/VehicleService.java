package com.claim.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.claim.entity.Cars;

@Service
public class VehicleService extends Cars{
	//create a new arrayList of Cars Objects
	List<Cars> carsInventory = new ArrayList<Cars>();
	//List for sold cars
	List<Cars> carsSold = new ArrayList<Cars>();
	
	@PostConstruct
	public void newCars() {
		Cars car1 = new Cars();
		car1.setType("car");
		car1.setNewOrUsed("New");
		car1.setMake("Nissan");
		car1.setModel("GTR");
		car1.setCarDescription("2021 Nissan GTR");
		car1.setPictures("./images/gtr.jpg");
		car1.setKilometersRan(0);
		car1.setVin(Math.random()*6);
		car1.setPrice(20000);
		car1.setPurchasePrice(getPrice());
		car1.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car1);
		
		Cars car2 = new Cars();
		car2.setType("car");
		car2.setNewOrUsed("Used");
		car2.setMake("Chrysler");
		car2.setModel("PT Cruiser");
		car2.setCarDescription("Lightly modified PT Cruiser");
		car2.setPictures("./images/ptCruiser.jpg");
		car2.setKilometersRan(100000);
		car2.setVin(Math.random()*6);
		car2.setPrice(20000);
		car2.setPurchasePrice(0);
		car2.setDealershipPurchaseDate(LocalDate.of(2020, 7, 10));
		
		carsInventory.add(car2);
		
		Cars car3 = new Cars();
		car3.setType("car");
		car3.setNewOrUsed("New");
		car3.setMake("Ford");
		car3.setModel("Mustang Mach E");
		car3.setCarDescription("Brand new Mustang Mach E");
		car3.setPictures("./images/MachE.jpg");
		car3.setKilometersRan(0);
		car3.setVin(Math.random()*6);
		car3.setPrice(30000);
		car3.setPurchasePrice(getPrice());
		car3.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car3);
		
		Cars car4 = new Cars();
		car4.setType("car");
		car4.setNewOrUsed("New");
		car4.setMake("Dodge");
		car4.setModel("Challenger");
		car4.setCarDescription("Brand new (somehow) 1970 Dodge Challenger");
		car4.setPictures("./images/challenger.jpg");
		car4.setKilometersRan(0);
		car4.setVin(Math.random()*6);
		car4.setPrice(35000);
		car4.setPurchasePrice(getPrice());
		car4.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car4);
		
		Cars car5 = new Cars();
		car5.setType("car");
		car5.setNewOrUsed("New");
		car5.setMake("Honda");
		car5.setModel("Civic");
		car5.setCarDescription("Brand new Honda Civic");
		car5.setPictures("./images/civic.jpg");
		car5.setKilometersRan(0);
		car5.setVin(Math.random()*6);
		car5.setPrice(25000);
		car5.setPurchasePrice(getPrice());
		car5.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car5);
		
		Cars car6 = new Cars();
		car6.setType("car");
		car6.setNewOrUsed("New");
		car6.setMake("Audi");
		car6.setModel("A6");
		car6.setCarDescription("Brand new 2022 Audi A6");
		car6.setPictures("./images/a6.jpg");
		car6.setKilometersRan(0);
		car6.setVin(Math.random()*6);
		car6.setPrice(50000);
		car6.setPurchasePrice(getPrice());
		car6.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car6);
		
		Cars car7 = new Cars();
		car7.setType("car");
		car7.setNewOrUsed("New");
		car7.setMake("Chevrolet");
		car7.setModel("Corvette");
		car7.setCarDescription("Brand new 2022 Chevrolet Corvette");
		car7.setPictures("./images/corvette.jpg");
		car7.setKilometersRan(0);
		car7.setVin(Math.random()*6);
		car7.setPrice(60000);
		car7.setPurchasePrice(getPrice());
		car7.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car7);
		
		Cars car8 = new Cars();
		car8.setType("car");
		car8.setNewOrUsed("New");
		car8.setMake("Tesla");
		car8.setModel("Cybertruck");
		car8.setCarDescription("Brand new Tesla Cybertruck");
		car8.setPictures("./images/cybertruck.jpg");
		car8.setKilometersRan(0);
		car8.setVin(Math.random()*6);
		car8.setPrice(57000);
		car8.setPurchasePrice(getPrice());
		car8.setDealershipPurchaseDate(LocalDate.of(2021, 7, 10));
		
		carsInventory.add(car8);
		
		Cars car9 = new Cars();
		car9.setType("car");
		car9.setNewOrUsed("Used");
		car9.setMake("Corbin");
		car9.setModel("Sparrow");
		car9.setCarDescription("Extensively used Corbin Sparrow");
		car9.setPictures("./images/sparrow.jpg");
		car9.setKilometersRan(1000000);
		car9.setVin(Math.random()*6);
		car9.setPrice(1000);
		car9.setPurchasePrice(0);
		car9.setDealershipPurchaseDate(LocalDate.of(2020, 7, 10));
		
		carsInventory.add(car9);
		
		Cars car10 = new Cars();
		car10.setType("car");
		car10.setNewOrUsed("Used");
		car10.setMake("Bond");
		car10.setModel("Bug");
		car10.setCarDescription("Used Bond Bug");
		car10.setPictures("./images/bug.jpg");
		car10.setKilometersRan(90000);
		car10.setVin(Math.random()*6);
		car10.setPrice(2000);
		car10.setPurchasePrice(0);
		car10.setDealershipPurchaseDate(LocalDate.of(2020, 7, 10));
		
		carsInventory.add(car10);
		
		
	}
	
	public void saveCar(Cars newCar) {
		carsInventory.add(newCar);
	}
	
	public List<Cars> findAll(){
		
		return carsInventory;
	}
	
	public List<Cars> search(String keyword) {
		List<Cars> matches = new ArrayList<Cars>();
		for(Cars car: carsInventory) {
			if(car.getModel().equalsIgnoreCase(keyword)) {
				matches.add(car);
			}
		}
		return matches;
	}
	
	public List<Cars> findAllSold(){
		return carsSold;
	}
	
	
	//save cars to the array
	public void saveCarsInventory(Cars cars) {
		carsInventory.add(cars);
		
	}
	
	//save sold cars to the array
	public void saveCarsSold(Cars cars) {
		
		carsSold.add(cars);
	}
	//find a car in inventory by unique id (vin)
	public Cars findByVin(double vin) {
		for(Cars car: carsInventory){
			if(car.getVin() == vin) {
				return car;
			}
		}
		return null;
	}
	
	//remove car from inventory and add it to sold inventory.
	public void sellCar(double vin) {
		//carsInventory.set(soldCarIndex, null);
		
		carsSold.add((findByVin(vin)));
		carsInventory.remove(findByVin(vin));
	}
	
	
	//a separate search for used car vins
	public Cars findSoldByVin(double vin) {
		
		for(Cars car:carsSold) {
			if(car.getVin() == vin) {
				return car;
			}
		}
		return null;
	}
	
}
