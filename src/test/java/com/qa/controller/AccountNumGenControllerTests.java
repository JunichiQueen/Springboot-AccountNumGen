package com.qa.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.service.AccountNumGenService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountNumGenControllerTests {
	
	@InjectMocks
	AccountNumGenController controller;
	
	@Mock
	AccountNumGenService service;
	
	@Test
	public void test() {
		Mockito.when(service.generateRandomNumber()).thenReturn("111");
		assertEquals(controller.getNumber(), "111");
	}

}
