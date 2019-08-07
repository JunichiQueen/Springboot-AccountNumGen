package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.service.AccountNumGenService;

@RestController
@RequestMapping("/numgen")
public class AccountNumGenController {
	
	private AccountNumGenService accnumgenservice;
	
	@Autowired
	public AccountNumGenController(AccountNumGenService accnumgenservice) {
		this.accnumgenservice=accnumgenservice;
	}
	
	@GetMapping("/getNumber")
	public String getNumber(){
		
		//ResponseEntity<String> retVal = new ResponseEntity<String>("Response Body", HttpStatus.OK);
		return accnumgenservice.generateRandomNumber();
	}
	
}
