package org.halkidiki.petsapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {
	App myApp; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		myApp = new App(); 

		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testTemporaryAdopt() {
		fail("Not yet implemented");
	}

	
	
	@Test public void ifNoPetExistsWhenSearchingForAdoptionAnExceptionIsThrown() { //Konstantina
	// Setup this test
	//	myApp.foundlist = mock(List.class); 
		//Pet myPet = new Pet(1, )
		//App.foundlist.add(myPet);
		List<Pet> Results;
		
	// Stubbing some behavior
		// Simular que cuando se pregunte por perro tipo 0 no hay ninguno que coincida
		
		
		
	// run the test	
		
		//Results = myApp.searchForAdoption(0);
    	
	} 
	
	@Test
	public void ifPetsExistWhenSearchingForAdoptionTheyAreReturnedInTheList() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectPet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFoundPetData() {
		fail("Not yet implemented");
	}

	@Test
	public void testReportFoundPet() {
		fail("Not yet implemented");
	}

	@Test
	public void testReportLostPet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRecordAdopter() {
		fail("Not yet implemented");
	}

}
