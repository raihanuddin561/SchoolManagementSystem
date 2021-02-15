package com.partnersApp.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partnersApp.ui.model.response.UserRest;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping(path="/{userId}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		UserRest returnResponse = new UserRest();
		returnResponse.setEmail("raihan@gmail.com");
		returnResponse.setFirstName("Raihan");
		returnResponse.setLastName("Uddin");
		returnResponse.setUserId("12345");
		return new ResponseEntity<UserRest>(returnResponse, HttpStatus.OK);
	}
	
	@PostMapping
	public String users() {
		return "post method";
	}

}
