package com.example.Air.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.MediaType;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.Air.pojo.ResponseObj;
import com.example.Air.pojo.User;
//import com.example.Air.service.UserService;

	@RestController
	public class Aircontroller {
		
		@Autowired
		//private UserService userService;
		
		@GetMapping("/")
		public String homepage() {
			return "searchFlights";
		}

		@GetMapping("/login")
		public String login() {
			return "login";
		}
		
		@GetMapping("/register")
		public String register() {
			return "register";
		}
		
		@GetMapping("/bookFlight")
		public String bookFlight() {
			return "bookFlight";
		}
		

		@GetMapping("/checkin")
		public String checkinPage() {
			return "checkin";
		}
		  

}
