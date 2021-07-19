package com.claim.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Cars;
import com.claim.entity.Customer;
import com.claim.service.CustomerService;
import com.claim.service.TransactionService;
import com.claim.service.VehicleService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	VehicleService vehicleService;
	
	@Autowired
	TransactionService transactionService;
	
	@GetMapping("index")
	public String welcome(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		
		//Customer newCustomer = customerService.findByEmail(customer.getEmail());
		if (session.getAttribute("loggedIn") == null) {
			
			return "login";
		}
		
		model.addAttribute("allCars", vehicleService.findAll());
		model.addAttribute("soldCars", vehicleService.findAllSold());
		model.addAttribute("transactions", transactionService.findAll());
		//model.addAttribute("loggedIn", customerService.findByEmail(email));
		//the next line accessing the object that is signed into the session
		session.getAttribute("loggedIn");

		return "index";
	}
	
	@GetMapping("/search-results")
	public String searchResults(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		
		Customer newCustomer = customerService.findByEmail(customer.getEmail());
		if (newCustomer == null) {
			return "login";
		}
		model.addAttribute("allCars", model.getAttribute("matches"));
		
		session.getAttribute("loggedIn");
		return "search-results";
	}
	
	
	@GetMapping("/search")
	public String search(Model model, HttpSession session) {
		return "search";
	}
	
	@PostMapping("/search")
	String handleSearch(@RequestParam String keyword, Model model, HttpSession session) {
		
		System.out.println("keyword: "+ keyword);
		
		
		List<Cars> matches = vehicleService.search(keyword);
		model.addAttribute("allCars", matches);
		model.addAttribute("msg", "Sorry, no results found. Please try again.");
		return "search-results";
	}
	
	@GetMapping("/sold-cars")
	public String soldCars(Model model, @RequestParam String email, HttpSession session) {
		
		
		model.getAttribute("soldCars");
		
		model.getAttribute("transactions");
		
		//model.addAttribute("transactions", transactionService.findAll());
		
		
		//model.addAttribute("loggedIn", customerService.findByEmail(email));
		//the next line accessing the object that is signed into the session
		session.getAttribute("loggedIn");

		return "sold-cars";
	}
	
	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		
		//when the customer tries to view the sign up page
		//this servlet will handle the request and add a spring Model Attribute
		//object to map to the sign up form called "customer", which is a
		//customer object
		//This says, return the sign up page, create a modelAttribute, and create an empty Customer object
		return new ModelAndView("sign-up", "customer", new Customer());
	}
	
	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		
		customerService.saveCustomer(customer);
		model.addAttribute("newCustomer", customer);
		return "thank-you";
	}
	
	@GetMapping("/addCar")
	public ModelAndView addCar(Model model) {
		return new ModelAndView("addCar", "car", new Cars());
	}
	
	@PostMapping("/addCar")
	public String handleAddCar(Model model, @ModelAttribute ("car") Cars car, HttpSession session) {
		car.setVin(Math.random()*6);
		car.setPictures("./images/new-car.jpg");
		vehicleService.saveCar(car);
		model.addAttribute("newCar", car);
		return"car-added";
	}
	
	@GetMapping({"/login", "/", "/home"})
	public ModelAndView login(Model model, HttpSession session) {
		//keep logged in user from logging in again
		//just don't display the login button if you're logged in?
		
//		if(session.equals(session)!= false) {
//			return ModelAndView("index", "allCars", vehicleService.findAll());
//		}
		return new ModelAndView("login", "customer", new Customer());
	}
	
	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		model.addAttribute("allCars", vehicleService.findAll());

		Customer newCustomer = customerService.findByEmail(customer.getEmail());
		//checking if the whole object is null, as opposed to a single attribute to avoid null pointer exceptions
		if(newCustomer != null && newCustomer.getPassword().equals(customer.getPassword())) {
			model.addAttribute("allCars", vehicleService.findAll());
			model.addAttribute("soldCars", vehicleService.findAllSold());
			model.addAttribute("transactions", transactionService.findAll());
			session.setAttribute("loggedIn", newCustomer);
			if(newCustomer.getFirstName().equals("Admin")) {
				//this will pass the sold cars model into the admin page
				model.addAttribute("soldCars", vehicleService.findAllSold());
				return "sold-cars";
				
			}
			else {
			return "index";
			}
		} else {
			model.addAttribute("error", "Invalid credentials, please try again!");
			return "login";
		}
		
		
		//session.setAttribute is used to attach a user to a session
		//session.getAttribute links the whole session together, lets program know we're making a call as a logged in user
		//model.getAttribute("modelName") knows how to populate table info
		
		//model.addAttribute("blah", blah) adds EL to the jsp?
		//EL can access model.addAttribute OR session.setAttribute*****
		//model is short term, and per request
		//session will stay until person logs out
		
		//if session.getAttribute (person is logged in) then redirect to homepage
		//if session.getAttribute (person is not logged in) they shouldn't be on the home page or profile page
		// set session attribute to null when someone logs out

	}
	
	@GetMapping("/details")
	public String details(@RequestParam double vin, Model model, HttpSession session) {
		session.getAttribute("LoggedIn");
		LocalDate today = LocalDate.now();
		
		long age = ChronoUnit.DAYS.between(vehicleService.findByVin(vin).getDealershipPurchaseDate(), today);
		
		model.addAttribute("details", vehicleService.findByVin(vin));
		model.addAttribute("purchaseAge", age);
		return "details";
		
	}
	
	@GetMapping("/purchase")
	public String purchase(@RequestParam double vin, Model model, @RequestParam String email, HttpSession session) {
		
		//Customer newCustomer = customerService.findByEmail(email);
		//session.getAttribute("loggedIn");
		model.addAttribute("loggedIn", customerService.findByEmail(email));
		model.addAttribute("details", vehicleService.findByVin(vin));
		
		//add all customer and car information to transaction history list
		transactionService.sellCar(vin, email);
		//call sellCar last since it removes from the inventory.
		vehicleService.sellCar(vin);
		
		
		//model.addAttribute("allCars", vehicleService.findAll());
		return "purchase";
		
	}
	
	@GetMapping("/bid")
	public String bid(@RequestParam double vin, @RequestParam String email,Model model, HttpSession session) {
		//int bidAmount = Integer.parseInt(bid);
		
		model.addAttribute("loggedIn", customerService.findByEmail(email));
		model.addAttribute("details", vehicleService.findByVin(vin));
		model.addAttribute("msg", "you have successfully purchased this vehicle");
		transactionService.sellCar(vin, email);
		vehicleService.sellCar(vin);
		
		return "bid";
	}
	
	@PostMapping("/bid")
	public String handleBid(@RequestParam double vin, @RequestParam String bidAmount, @RequestParam String email, Model model) {
		model.addAttribute("loggedIn", customerService.findByEmail(email));

		
		//int bidAmount = Integer.parseInt(bid);
		LocalDate today = LocalDate.now();
		
		long age = ChronoUnit.DAYS.between(vehicleService.findByVin(vin).getDealershipPurchaseDate(), today);

		
		model.addAttribute("details", vehicleService.findByVin(vin));
		model.addAttribute("purchaseAge", age);
		
		int bid = Integer.parseInt(bidAmount);
		if(bid>= vehicleService.findByVin(vin).getPrice()- vehicleService.findByVin(vin).getPrice()*.010) {
			vehicleService.findByVin(vin).setPurchasePrice(bid);
			transactionService.sellCar(vin, email);
			vehicleService.sellCar(vin);
			model.addAttribute("msg", "you have successfully purchased this vehicle");
			return "bid";
		}
		else {
			model.addAttribute("msg", "bid amount too low, please try again");
			return "bid";
		}

		
		
	}
	
}
