package org.halkidiki.petsapp;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class ContestTest {

	String title;
	String description;
	public Boolean	cStarted;
	Date cStartDate;
	Date cEndDate;
	Reward cPrize;
	int ONE_DAY_IN_MILLISEC = 86400000;
	
	Contest contestToTest;
	
	@Before
	public void setUp() throws Exception {
		title = "Who's the most devoted one?";
		description = "Get a prize!";
		cStarted = true;
		cStartDate = new Date(); // Today
		cEndDate = new Date(System.currentTimeMillis() + 2*ONE_DAY_IN_MILLISEC); // Today after 2*1720 milliseconds
		cPrize = new Reward("Petfood", "", 500);
		contestToTest = new Contest(title, description, cStarted, cStartDate, cEndDate, cPrize);
	}

//	@Test
//	public void testReward() {
//		
//	}

	@Test
	public void testEventEnd() {
		assertEquals(true,contestToTest.getcStarted());
		
		contestToTest.eventEnd();
		assertEquals(false,contestToTest.getcStarted());
	}

	@Test
	public void testGivePrize() {
		fail("Not yet implemented");
	}


}
