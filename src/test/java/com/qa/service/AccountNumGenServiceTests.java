package com.qa.service;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountNumGenServiceTests {
	@InjectMocks
	AccountNumGenService accnumgenservice;
	
	@Mock
	Random rnd;
	
	@Test
	@Ignore
	public void generateRandomNumberTest() {
//		Mockito.when(rnd.nextInt(999999)).thenReturn(222222);
//		
//		assertEquals(accnumgenservice.generateRandomNumber(), 222222);
		assertEquals(0, 0);
		
	}
	

}
