package org.halkidiki.petsapp;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.halkidiki.petsapp.accounts.User;
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
	
	@Test public void ifNoUserExistsWhenSearchingForUserAnExceptionIsThrown() { //Konstantina
		User myUser = new User(null,null, 128965, 685496352, "calle Larios 2", "Malaga", "alice@gmail.com", "fre54", "Alice");
		App.userList.add(myUser);
		List<User> Results;
		Results = myApp.getUser(123456);
    	
	} 
	
	@Test
	public void ifUserExistWhenSearchingForUserTheyAreReturnedInTheList() {
		User myUser = new User(null,null, 128965, 685496352, "calle Larios 2", "Malaga", "alice@gmail.com", "fre54", "Alice");
		App.userList.add(myUser);
		List<User> Results;
		Results = myApp.getUser(128965);
	}
	

	@Test
	public void testTemporaryAdopt() {
		fail("Not yet implemented");
	}

	
	
	@Test public void ifNoPetExistsWhenSearchingForAdoptionAnExceptionIsThrown() { //Konstantina
		Pet myPet = new Pet(1,"M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		List<Pet> Results;
		Results = myApp.searchForAdoption(0);
    	
	} 
	
	@Test
	public void ifPetsExistWhenSearchingForAdoptionTheyAreReturnedInTheList() {
		Pet myPet = new Pet(1,"M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		List<Pet> Results;
		Results = myApp.searchForAdoption(1);
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
