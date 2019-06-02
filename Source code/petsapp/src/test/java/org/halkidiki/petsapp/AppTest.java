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
		@SuppressWarnings("unused")
		List<User> Results;
		Results = myApp.getUser(123456);
    	
	} 
	
	@SuppressWarnings("unused")
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
		Pet myPet = new Pet(1, 654986,"M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		@SuppressWarnings("unused")
		List<Pet> Results;
		Results = myApp.searchForAdoption(0);
    	
	} 
	
	@Test
	public void ifPetsExistWhenSearchingForAdoptionTheyAreReturnedInTheList() {
		Pet myPet = new Pet(1, 518951, "M", false, "DF485445", 5, "Bob", null);
		App.foundlist.add(myPet);
		List<Pet> Results;
		Results = myApp.searchForAdoption(1);
	}

	@SuppressWarnings("null")
	@Test public void ifNoPetExistsWhenSearchingForPetToSelect() { //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = null;
		Results.add(myPet);
		myApp.selectPet(969956,Results);
    	
	} 
	
	@SuppressWarnings("null")
	@Test
	public void ifPetsExistWhenSearchingForPetToSelect() {
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = null;
		Results.add(myPet);
		myApp.selectPet(519695,Results);
	}

	@SuppressWarnings("null")
	@Test public void ifNoPetExistsWhenSearchingForPetData() { //Konstantina
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		Pet myPet2 = new Pet(1, 519697,"F", false, "DF465445", 1, "Alice", null);
		List<Pet> Results = null;
		Results.add(myPet2);
		myApp.getFoundPetData(myPet,Results);
    	
	} 
	
	@SuppressWarnings("null")
	@Test
	public void ifPetsExistWhenSearchingForPetData() {
		Pet myPet = new Pet(1, 519695,"M", false, "DF485445", 5, "Bob", null);
		List<Pet> Results = null;
		Results.add(myPet);
		myApp.getFoundPetData(myPet,Results);
	}

	@Rule
	public ExpectedException e = ExpectedException.none(); 
	@SuppressWarnings("static-access")
	@Test
	public void testReportFoundPet() {
		myApp.reportFoundPet();
		if(myApp.foundlist.isEmpty()) {
			e.expect(IndexOutOfBoundsException.class);
			e.expectMessage("Index: 0, Size: 0");
			myApp.foundlist.get(0);
		} 
	}

	@SuppressWarnings("static-access")
	@Test
	public void testReportLostPet() {
		myApp.reportLostPet();
		if(myApp.lostlist.isEmpty()) {
			e.expect(IndexOutOfBoundsException.class);
			e.expectMessage("Index: 0, Size: 0");
			myApp.lostlist.get(0);
		} 
	}

	@SuppressWarnings("static-access")
	@Test
	public void testRecordAdopter() {
		myApp.recordAdopter(null, null, 896584);
		if(myApp.adopterList.isEmpty()) {
			e.expect(IndexOutOfBoundsException.class);
			e.expectMessage("Index: 0, Size: 0");
			myApp.adopterList.get(0);
		} 
	    
	}

}
