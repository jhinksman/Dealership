package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Customer;
import com.claim.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public String welcome(Model model) {
		return "index";
	}
	
	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		//when the customer tries to view the sign up page
		//this servlet will handle the request and add a spring Model Attribute
		//object to map to the sign up form called "customer", which is a
		//customer object
		return new ModelAndView("sign-up", "customer", new Customer());
	}
	
	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		
		customerService.saveCustomer(customer);
		model.addAttribute("newCustomer", customer);
		return "thank-you";
	}
	
	@GetMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("login", "customer", new Customer());
	}
	
	@PostMapping("/login")
	public String handleLogin(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		
		Customer newCustomer = customerService.findByEmail(customer.getEmail());
		if(!newCustomer.getEmail().equals(null) && newCustomer.getPassword().equals(customer.getPassword())) {
			return "index";
		} else {
			model.addAttribute("error", "Invalid credentials, please try again!");
			return "login";
		}

	}
}
