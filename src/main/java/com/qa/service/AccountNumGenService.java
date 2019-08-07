package com.qa.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class AccountNumGenService {
	
	public String generateRandomNumber() {
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		return String.format("%06d", number);
	}
	
}